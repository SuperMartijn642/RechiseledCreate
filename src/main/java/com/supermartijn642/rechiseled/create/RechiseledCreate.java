package com.supermartijn642.rechiseled.create;

import com.jozufozu.flywheel.backend.instancing.InstancedRenderRegistry;
import com.simibubi.create.content.kinetics.BlockStressDefaults;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import com.supermartijn642.core.CommonUtils;
import com.supermartijn642.core.item.BaseBlockItem;
import com.supermartijn642.core.item.CreativeItemGroup;
import com.supermartijn642.core.item.ItemProperties;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.core.registry.RegistrationHandler;
import com.supermartijn642.core.registry.RegistryEntryAcceptor;
import com.supermartijn642.rechiseled.api.registration.RechiseledRegistration;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselBlock;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselBlockEntity;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselDataGenerators;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselRenderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
@Mod(RechiseledCreate.MODID)
public class RechiseledCreate {

    public static final String MODID = "rechiseledcreate";
    public static final RechiseledRegistration REGISTRATION = RechiseledRegistration.get(MODID);
    @SuppressWarnings("Convert2MethodRef")
    public static final CreativeItemGroup GROUP = (CreativeItemGroup)REGISTRATION.itemGroup(() -> Blocks.ROSE_QUARTZ_POLISHED_BLOCK.getRegularBlock(), "Rechiseled: Create Integration");

    @RegistryEntryAcceptor(namespace = MODID, identifier = "mechanical_chisel", registry = RegistryEntryAcceptor.Registry.BLOCKS)
    public static MechanicalChiselBlock mechanical_chisel;
    @RegistryEntryAcceptor(namespace = MODID, identifier = "mechanical_chisel", registry = RegistryEntryAcceptor.Registry.BLOCK_ENTITY_TYPES)
    public static BlockEntityType<MechanicalChiselBlockEntity> mechanical_chisel_entity;

    public RechiseledCreate(){
        // Make sure the blocks get loaded
        Blocks.init();
        Recipes.init();

        // Register mechanical chisel
        RegistrationHandler handler = RegistrationHandler.get(MODID);
        handler.registerBlock("mechanical_chisel", () -> new MechanicalChiselBlock(BlockBehaviour.Properties.copy(SharedProperties.stone()).color(MaterialColor.PODZOL)));
        handler.registerBlockEntityTypeCallback(RechiseledCreate::registerBlockEntity);
        handler.registerItemCallback(RechiseledCreate::registerItem);
        BlockStressDefaults.setDefaultImpact(new ResourceLocation(MODID, "mechanical_chisel"), 3);
        MechanicalChiselDataGenerators.register();

        // Register data providers for generating all the json files
        GeneratorRegistrationHandler.get("rechiseledcreate").addProvider(WoodTextureProvider::new);
        REGISTRATION.registerDataProviders();

        if(CommonUtils.getEnvironmentSide().isClient())
            RechiseledCreateClient.onInitializeClient();
    }

    private static void registerBlockEntity(RegistrationHandler.Helper<BlockEntityType<?>> helper){
        BlockEntityType<MechanicalChiselBlockEntity> blockEntityType = BlockEntityType.Builder.of(MechanicalChiselBlockEntity::new, mechanical_chisel).build(null);
        helper.register("mechanical_chisel", blockEntityType);
        if(CommonUtils.getEnvironmentSide().isClient())
            InstancedRenderRegistry.configure(blockEntityType).factory(MechanicalChiselRenderInstance::new).apply();
    }

    private static void registerItem(RegistrationHandler.Helper<Item> helper){
        Item item = new BaseBlockItem(mechanical_chisel, ItemProperties.create().group(GROUP));
        helper.register("mechanical_chisel", item);
        if(CommonUtils.getEnvironmentSide().isClient())
            TooltipModifier.REGISTRY.register(item, KineticStats.create(item));
    }
}
