package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.simibubi.create.AllShapes;
import com.simibubi.create.content.kinetics.base.DirectionalAxisKineticBlock;
import com.simibubi.create.content.kinetics.saw.SawBlock;
import com.simibubi.create.foundation.block.IBE;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Created 15/05/2023 by SuperMartijn642
 */
public class MechanicalChiselBlock extends DirectionalAxisKineticBlock implements IBE<MechanicalChiselBlockEntity> {

    public MechanicalChiselBlock(Properties properties){
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.UP).setValue(SawBlock.FLIPPED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block,BlockState> builder){
        super.createBlockStateDefinition(builder.add(SawBlock.FLIPPED));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context){
        Direction facing = context.getHorizontalDirection();
        return this.defaultBlockState()
            .setValue(AXIS_ALONG_FIRST_COORDINATE, facing.getAxis() == Direction.Axis.X)
            .setValue(SawBlock.FLIPPED, facing.getAxisDirection() == Direction.AxisDirection.POSITIVE);
    }

    @Override
    public BlockState getRotatedBlockState(BlockState state, Direction side){
        BlockState newState = super.getRotatedBlockState(state, side);
        if(newState.getValue(FACING).getAxis() != Direction.Axis.Y)
            return newState;
        if(side.getAxis() != Direction.Axis.Y)
            return newState;
        if(!state.getValue(AXIS_ALONG_FIRST_COORDINATE))
            newState = newState.cycle(SawBlock.FLIPPED);
        return newState;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation){
        BlockState newState = super.rotate(state, rotation);
        if(state.getValue(FACING)
            .getAxis() != Direction.Axis.Y)
            return newState;

        if(rotation.ordinal() % 2 == 1 && (rotation == Rotation.CLOCKWISE_90) != state.getValue(AXIS_ALONG_FIRST_COORDINATE))
            newState = newState.cycle(SawBlock.FLIPPED);
        if(rotation == Rotation.CLOCKWISE_180)
            newState = newState.cycle(SawBlock.FLIPPED);

        return newState;
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror){
        BlockState newState = super.mirror(state, mirror);
        if(state.getValue(FACING).getAxis() != Direction.Axis.Y)
            return newState;

        boolean alongX = state.getValue(AXIS_ALONG_FIRST_COORDINATE);
        if(alongX && mirror == Mirror.FRONT_BACK)
            newState = newState.cycle(SawBlock.FLIPPED);
        if(!alongX && mirror == Mirror.LEFT_RIGHT)
            newState = newState.cycle(SawBlock.FLIPPED);

        return newState;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context){
        return AllShapes.CASING_12PX.get(state.getValue(FACING));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit){
        if(player.isSpectator() || !player.getItemInHand(hand).isEmpty())
            return InteractionResult.PASS;
        if(state.getOptionalValue(FACING).orElse(Direction.WEST) != Direction.UP)
            return InteractionResult.PASS;

        return this.onBlockEntityUse(level, pos, be -> {
            for(int i = 0; i < be.inventory.getSlots(); i++){
                ItemStack heldItemStack = be.inventory.getStackInSlot(i);
                if(!level.isClientSide && !heldItemStack.isEmpty())
                    player.getInventory().placeItemBackInInventory(heldItemStack);
            }
            be.inventory.clear();
            be.notifyUpdate();
            return InteractionResult.SUCCESS;
        });
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter level, Entity entity){
        super.updateEntityAfterFallOn(level, entity);
        if(!(entity instanceof ItemEntity))
            return;
        if(entity.level().isClientSide)
            return;

        BlockPos pos = entity.blockPosition();
        this.withBlockEntityDo(entity.level(), pos, be -> {
            if(be.getSpeed() == 0)
                return;
            be.insertItem((ItemEntity)entity);
        });
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state){
        return PushReaction.NORMAL;
    }

    public static boolean isHorizontal(BlockState state){
        return state.getValue(FACING).getAxis().isHorizontal();
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state){
        return isHorizontal(state) ? state.getValue(FACING).getAxis() : super.getRotationAxis(state);
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face){
        return isHorizontal(state) ? face == state.getValue(FACING).getOpposite()
            : super.hasShaftTowards(world, pos, state, face);
    }

    @Override
    public Class<MechanicalChiselBlockEntity> getBlockEntityClass(){
        return MechanicalChiselBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends MechanicalChiselBlockEntity> getBlockEntityType(){
        return RechiseledCreate.mechanical_chisel_entity;
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter reader, BlockPos pos, PathComputationType type){
        return false;
    }
}
