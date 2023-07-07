package com.supermartijn642.rechiseled.create;

import com.simibubi.create.content.kinetics.BlockStressDefaults;
import com.simibubi.create.foundation.data.SharedProperties;
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
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
public class RechiseledCreate implements ModInitializer {

    public static final String MODID = "rechiseledcreate";
    public static final RechiseledRegistration REGISTRATION = RechiseledRegistration.get(MODID);
    @SuppressWarnings("Convert2MethodRef")
    public static final CreativeItemGroup GROUP = (CreativeItemGroup)REGISTRATION.itemGroup(() -> Blocks.ROSE_QUARTZ_POLISHED_BLOCK.getRegularBlock(), "Rechiseled: Create Integration");

    @RegistryEntryAcceptor(namespace = MODID, identifier = "mechanical_chisel", registry = RegistryEntryAcceptor.Registry.BLOCKS)
    public static MechanicalChiselBlock mechanical_chisel;
    @RegistryEntryAcceptor(namespace = MODID, identifier = "mechanical_chisel", registry = RegistryEntryAcceptor.Registry.BLOCK_ENTITY_TYPES)
    public static BlockEntityType<MechanicalChiselBlockEntity> mechanical_chisel_entity;

    @Override
    public void onInitialize(){
        // Make sure the blocks get loaded
        Blocks.init();
        Recipes.init();

        // Register mechanical chisel
        RegistrationHandler handler = RegistrationHandler.get(MODID);
        handler.registerBlock("mechanical_chisel", () -> new MechanicalChiselBlock(BlockBehaviour.Properties.copy(SharedProperties.stone()).color(MaterialColor.PODZOL)));
        handler.registerBlockEntityType("mechanical_chisel", () -> BlockEntityType.Builder.of(MechanicalChiselBlockEntity::new, mechanical_chisel).build(null));
        handler.registerItem("mechanical_chisel", () -> new BaseBlockItem(mechanical_chisel, ItemProperties.create().group(GROUP)));
        BlockStressDefaults.setDefaultImpact(new ResourceLocation(MODID, "mechanical_chisel"), 3);
        MechanicalChiselDataGenerators.register();

        // Register data providers for generating all the json files
        GeneratorRegistrationHandler.get("rechiseledcreate").addProvider(WoodTextureProvider::new);
        REGISTRATION.registerDataProviders();
    }
}
