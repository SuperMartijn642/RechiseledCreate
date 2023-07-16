package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.simibubi.create.AllSoundEvents;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.belt.behaviour.DirectBeltInputBehaviour;
import com.simibubi.create.content.kinetics.saw.SawFilterSlot;
import com.simibubi.create.content.processing.recipe.ProcessingInventory;
import com.simibubi.create.foundation.advancement.AllAdvancements;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import com.simibubi.create.foundation.blockEntity.behaviour.filtering.FilteringBehaviour;
import com.simibubi.create.foundation.item.ItemHelper;
import com.simibubi.create.foundation.utility.VecHelper;
import com.simibubi.create.infrastructure.config.AllConfigs;
import com.supermartijn642.rechiseled.chiseling.ChiselingEntry;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipe;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipes;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import io.github.fabricators_of_create.porting_lib.transfer.TransferUtil;
import io.github.fabricators_of_create.porting_lib.transfer.item.ItemHandlerHelper;
import io.github.fabricators_of_create.porting_lib.util.ItemStackUtil;
import io.github.fabricators_of_create.porting_lib.util.NBTSerializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created 15/05/2023 by SuperMartijn642
 */
public class MechanicalChiselBlockEntity extends KineticBlockEntity implements SidedStorageBlockEntity {

    public ProcessingInventory inventory;
    private int recipeIndex;
    private FilteringBehaviour filtering;

    private ItemStack playEvent;

    public MechanicalChiselBlockEntity(BlockPos pos, BlockState state){
        super(RechiseledCreate.mechanical_chisel_entity, pos, state);
        this.inventory = new ProcessingInventory(this::start).withSlotLimit(!AllConfigs.server().recipes.bulkCutting.get());
        this.inventory.remainingTime = -1;
        this.recipeIndex = 0;
        this.playEvent = ItemStack.EMPTY;
    }

    @Override
    public void addBehaviours(List<BlockEntityBehaviour> behaviours){
        super.addBehaviours(behaviours);
        this.filtering = new FilteringBehaviour(this, new SawFilterSlot()).forRecipes();
        behaviours.add(this.filtering);
        behaviours.add(new DirectBeltInputBehaviour(this).allowingBeltFunnelsWhen(this::canProcess));
    }

    @Override
    public void write(CompoundTag compound, boolean clientPacket){
        compound.put("Inventory", this.inventory.serializeNBT());
        compound.putInt("RecipeIndex", this.recipeIndex);
        super.write(compound, clientPacket);

        if(!clientPacket || this.playEvent.isEmpty())
            return;
        compound.put("PlayEvent", NBTSerializer.serializeNBT(this.playEvent));
        this.playEvent = ItemStack.EMPTY;
    }

    @Override
    protected void read(CompoundTag compound, boolean clientPacket){
        super.read(compound, clientPacket);
        this.inventory.deserializeNBT(compound.getCompound("Inventory"));
        this.recipeIndex = compound.getInt("RecipeIndex");
        if(compound.contains("PlayEvent"))
            this.playEvent = ItemStack.of(compound.getCompound("PlayEvent"));
    }

    @Override
    protected AABB createRenderBoundingBox(){
        return new AABB(this.worldPosition).inflate(.125f);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void tickAudio(){
        super.tickAudio();
        if(this.getSpeed() == 0)
            return;

        if(!this.playEvent.isEmpty()){
            boolean isWood = false;
            Item item = this.playEvent.getItem();
            if(item instanceof BlockItem){
                Block block = ((BlockItem)item).getBlock();
                isWood = block.getSoundType(block.defaultBlockState()) == SoundType.WOOD;
            }
            this.spawnEventParticles(this.playEvent);
            this.playEvent = ItemStack.EMPTY;
            if(!isWood)
                AllSoundEvents.SAW_ACTIVATE_STONE.playAt(this.level, this.worldPosition, 3, 1, true);
            else
                AllSoundEvents.SAW_ACTIVATE_WOOD.playAt(this.level, this.worldPosition, 3, 1, true);
        }
    }

    @Override
    public void tick(){
        super.tick();

        if(!this.canProcess())
            return;
        if(this.getSpeed() == 0)
            return;
        if(this.inventory.remainingTime == -1){
            if(!this.inventory.isEmpty() && !this.inventory.appliedRecipe)
                this.start(this.inventory.getStackInSlot(0));
            return;
        }

        float processingSpeed = Mth.clamp(Math.abs(this.getSpeed()) / 24, 1, 128);
        this.inventory.remainingTime -= processingSpeed;

        if(this.inventory.remainingTime < 5 && !this.inventory.appliedRecipe){
            if(this.level.isClientSide && !this.isVirtual())
                return;
            this.playEvent = this.inventory.getStackInSlot(0);
            this.applyRecipe();
            this.inventory.appliedRecipe = true;
            this.inventory.recipeDuration = 20;
            this.inventory.remainingTime = 20;
            this.sendData();
            return;
        }

        Vec3 itemMovement = this.getItemMovementVec();
        Direction itemMovementFacing = Direction.getNearest(itemMovement.x, itemMovement.y, itemMovement.z);
        if(this.inventory.remainingTime > 0)
            return;
        this.inventory.remainingTime = 0;

        for(int slot = 0; slot < this.inventory.getSlots(); slot++){
            ItemStack stack = this.inventory.getStackInSlot(slot);
            if(stack.isEmpty())
                continue;
            ItemStack tryExportingToBeltFunnel = this.getBehaviour(DirectBeltInputBehaviour.TYPE).tryExportingToBeltFunnel(stack, itemMovementFacing.getOpposite(), false);
            if(tryExportingToBeltFunnel != null){
                if(tryExportingToBeltFunnel.getCount() != stack.getCount()){
                    this.inventory.setStackInSlot(slot, tryExportingToBeltFunnel);
                    this.notifyUpdate();
                    return;
                }
                if(!tryExportingToBeltFunnel.isEmpty())
                    return;
            }
        }

        BlockPos nextPos = this.worldPosition.offset(itemMovement.x, itemMovement.y, itemMovement.z);
        DirectBeltInputBehaviour behaviour = BlockEntityBehaviour.get(this.level, nextPos, DirectBeltInputBehaviour.TYPE);
        if(behaviour != null){
            boolean changed = false;
            if(!behaviour.canInsertFromSide(itemMovementFacing))
                return;
            if(this.level.isClientSide && !this.isVirtual())
                return;
            for(int slot = 0; slot < this.inventory.getSlots(); slot++){
                ItemStack stack = this.inventory.getStackInSlot(slot);
                if(stack.isEmpty())
                    continue;
                ItemStack remainder = behaviour.handleInsertion(stack, itemMovementFacing, false);
                if(ItemStackUtil.equals(remainder, stack, false))
                    continue;
                this.inventory.setStackInSlot(slot, remainder);
                changed = true;
            }
            if(changed){
                this.setChanged();
                this.sendData();
            }
            return;
        }

        // Eject Items
        Vec3 outPos = VecHelper.getCenterOf(this.worldPosition).add(itemMovement.scale(.5f).add(0, .5, 0));
        Vec3 outMotion = itemMovement.scale(.0625).add(0, .125, 0);
        for(int slot = 0; slot < this.inventory.getSlots(); slot++){
            ItemStack stack = this.inventory.getStackInSlot(slot);
            if(stack.isEmpty())
                continue;
            ItemEntity entityIn = new ItemEntity(this.level, outPos.x, outPos.y, outPos.z, stack);
            entityIn.setDeltaMovement(outMotion);
            this.level.addFreshEntity(entityIn);
        }
        this.inventory.clear();
        this.level.updateNeighbourForOutputSignal(this.worldPosition, this.getBlockState().getBlock());
        this.inventory.remainingTime = -1;
        this.sendData();
    }

    @Override
    public void destroy(){
        super.destroy();
        ItemHelper.dropContents(this.level, this.worldPosition, this.inventory);
    }

    @Nullable
    @Override
    public Storage<ItemVariant> getItemStorage(@Nullable Direction face){
        return face == Direction.DOWN ? null : this.inventory;
    }

    protected void spawnEventParticles(ItemStack stack){
        if(stack == null || stack.isEmpty())
            return;

        ParticleOptions particleData;
        if(stack.getItem() instanceof BlockItem)
            particleData = new BlockParticleOption(ParticleTypes.BLOCK, ((BlockItem)stack.getItem()).getBlock()
                .defaultBlockState());
        else
            particleData = new ItemParticleOption(ParticleTypes.ITEM, stack);

        RandomSource r = this.level.random;
        Vec3 v = VecHelper.getCenterOf(this.worldPosition).add(0, 5 / 16f, 0);
        for(int i = 0; i < 10; i++){
            Vec3 m = VecHelper.offsetRandomly(new Vec3(0, 0.25f, 0), r, .125f);
            this.level.addParticle(particleData, v.x, v.y, v.z, m.x, m.y, m.y);
        }
    }

    public Vec3 getItemMovementVec(){
        boolean alongX = !this.getBlockState().getValue(MechanicalChiselBlock.AXIS_ALONG_FIRST_COORDINATE);
        int offset = this.getSpeed() < 0 ? -1 : 1;
        return new Vec3(offset * (alongX ? 1 : 0), 0, offset * (alongX ? 0 : -1));
    }

    private void applyRecipe(){
        List<ItemStack> recipes = this.getRecipes();
        if(recipes.isEmpty())
            return;
        if(this.recipeIndex >= recipes.size())
            this.recipeIndex = 0;

        ItemStack recipe = recipes.get(this.recipeIndex);

        int rolls = this.inventory.getStackInSlot(0)
            .getCount();
        this.inventory.clear();

        ItemStack output = recipe.copy();
        output.setCount(rolls);
        this.inventory.setStackInSlot(1, output);

        this.award(AllAdvancements.SAW_PROCESSING);
    }

    private List<ItemStack> getRecipes(){
        ItemStack input = this.inventory.getStackInSlot(0);
        // Find the chiseling recipe for the input
        ChiselingRecipe recipe = ChiselingRecipes.getRecipe(input);
        if(recipe == null)
            return Collections.emptyList();
        // If there's filter, return everything which matches the filter
        if(this.filtering.isActive() && !this.filtering.getFilter().isEmpty())
            return recipe.getEntries().stream()
                .flatMap(entry -> entry.hasConnectingItem() ? entry.hasRegularItem() ? Stream.of(entry.getConnectingItem(), entry.getRegularItem()) : Stream.of(entry.getConnectingItem()) : Stream.of(entry.getRegularItem()))
                .map(Item::getDefaultInstance)
                .filter(this.filtering::test)
                .collect(Collectors.toList());
        // Check whether the input is a connecting entry
        boolean connecting = false;
        for(ChiselingEntry entry : recipe.getEntries()){
            if(entry.getConnectingItem() == input.getItem()){
                connecting = true;
                break;
            }
            if(entry.getRegularItem() == input.getItem())
                break;
        }
        // Return the appropriate outputs
        return recipe.getEntries().stream()
            .filter(connecting ? ChiselingEntry::hasConnectingItem : ChiselingEntry::hasRegularItem)
            .map(connecting ? ChiselingEntry::getConnectingItem : ChiselingEntry::getRegularItem)
            .map(Item::getDefaultInstance)
            .filter(this.filtering::test)
            .collect(Collectors.toList());
    }

    public void insertItem(ItemEntity entity){
        if(!this.canProcess())
            return;
        if(!this.inventory.isEmpty())
            return;
        if(!entity.isAlive())
            return;
        if(this.level.isClientSide)
            return;

        this.inventory.clear();
        try(Transaction transaction = TransferUtil.getTransaction()){
            ItemStack stack = entity.getItem();
            long inserted = this.inventory.insert(ItemVariant.of(stack), stack.getCount(), transaction);
            if(stack.getCount() == inserted)
                entity.discard();
            else
                entity.setItem(ItemHandlerHelper.copyStackWithSize(stack, (int)(stack.getCount() - inserted)));
            transaction.commit();
        }
    }

    public void start(ItemStack inserted){
        if(!this.canProcess())
            return;
        if(this.inventory.isEmpty())
            return;
        if(this.level.isClientSide && !this.isVirtual())
            return;

        List<ItemStack> recipes = this.getRecipes();
        int time = 50;

        if(recipes.isEmpty()){
            this.inventory.remainingTime = this.inventory.recipeDuration = 10;
            this.inventory.appliedRecipe = false;
            this.sendData();
            return;
        }

        this.recipeIndex = this.level.getRandom().nextInt(recipes.size());
        if(inserted.getItem() == recipes.get(this.recipeIndex).getItem()){
            this.recipeIndex++;
            if(this.recipeIndex >= recipes.size())
                this.recipeIndex = 0;
        }

        this.inventory.remainingTime = time * Math.max(1, (inserted.getCount() / 5));
        this.inventory.recipeDuration = this.inventory.remainingTime;
        this.inventory.appliedRecipe = false;
        this.sendData();
    }

    protected boolean canProcess(){
        return this.getBlockState().getValue(MechanicalChiselBlock.FACING) == Direction.UP;
    }
}
