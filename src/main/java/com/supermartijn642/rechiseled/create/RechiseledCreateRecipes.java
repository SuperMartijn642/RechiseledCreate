package com.supermartijn642.rechiseled.create;

import com.simibubi.create.AllBlocks;
import com.supermartijn642.core.registry.Registries;
import com.supermartijn642.rechiseled.api.BaseChiselingRecipes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.create.RechiseledCreate.REGISTRATION;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
public class RechiseledCreateRecipes {

    public static final ResourceLocation ACACIA_WINDOW = location("acacia_window");
    public static final ResourceLocation ANDESITE = BaseChiselingRecipes.ANDESITE;
    public static final ResourceLocation ASURINE = location("asurine");
    public static final ResourceLocation BIRCH_WINDOW = location("birch_window");
    public static final ResourceLocation CALCITE = location("calcite");
    public static final ResourceLocation CRIMSITE = location("crimsite");
    public static final ResourceLocation CRIMSON_WINDOW = location("crimson_window");
    public static final ResourceLocation DARK_OAK_WINDOW = location("dark_oak_window");
    public static final ResourceLocation DEEPSLATE = location("deepslate");
    public static final ResourceLocation DIORITE = BaseChiselingRecipes.DIORITE;
    public static final ResourceLocation DRIPSTONE = location("dripstone");
    public static final ResourceLocation GLASS = location("glass");
    public static final ResourceLocation GRANITE = BaseChiselingRecipes.GRANITE;
    public static final ResourceLocation JUNGLE_WINDOW = location("jungle_window");
    public static final ResourceLocation LIMESTONE = location("limestone");
    public static final ResourceLocation MANGROVE_WINDOW = location("mangrove_window");
    public static final ResourceLocation OCHRUM = location("ochrum");
    public static final ResourceLocation OAK_WINDOW = location("oak_window");
    public static final ResourceLocation POLISHED_ROSE_QUARTZ = location("polished_rose_quartz");
    public static final ResourceLocation SCORCHIA = location("scorchia");
    public static final ResourceLocation SCORIA = location("scoria");
    public static final ResourceLocation SPRUCE_WINDOW = location("spruce_window");
    public static final ResourceLocation TUFF = location("tuff");
    public static final ResourceLocation VERIDIUM = location("veridium");
    public static final ResourceLocation WARPED_WINDOW = location("warped_window");

    private static ResourceLocation location(String name){
        return new ResourceLocation(RechiseledCreate.MODID, name);
    }

    private static Supplier<ItemLike> getBlock(String identifier){
        ResourceLocation location = new ResourceLocation(identifier);
        return () -> {
            if(!Registries.BLOCKS.hasIdentifier(location))
                throw new RuntimeException("Unknown block '" + identifier + "'!");
            return Registries.BLOCKS.getValue(location);
        };
    }

    public static void init(){
        // Acacia window
        connectingBlockOnly(ACACIA_WINDOW, "create:acacia_window");
        // Andesite
        regularSet(ANDESITE, "create:cut_andesite");
        regularSet(ANDESITE, "create:cut_andesite_bricks", "create:cut_andesite_brick_stairs", "create:cut_andesite_brick_slab");
        connectingBlockOnly(ANDESITE, "create:layered_andesite");
        connectingBlockOnly(ANDESITE, "create:andesite_pillar");
        // Asurine
        regularBlockOnly(ASURINE, "create:asurine");
        regularSet(ASURINE, "create:cut_asurine");
        regularSet(ASURINE, "create:cut_asurine_bricks", "create:cut_asurine_brick_stairs", "create:cut_asurine_brick_slab");
        connectingBlockOnly(ASURINE, "create:layered_asurine");
        connectingBlockOnly(ASURINE, "create:asurine_pillar");
        // Birch window
        connectingBlockOnly(BIRCH_WINDOW, "create:birch_window");
        // Calcite
        regularBlockOnly(CALCITE, () -> Items.CALCITE);
        regularSet(CALCITE, "create:cut_calcite");
        regularSet(CALCITE, "create:cut_calcite_bricks", "create:cut_calcite_brick_stairs", "create:cut_calcite_brick_slab");
        connectingBlockOnly(CALCITE, "create:layered_calcite");
        connectingBlockOnly(CALCITE, "create:calcite_pillar");
        // Crimsite
        regularBlockOnly(CRIMSITE, "create:crimsite");
        regularSet(CRIMSITE, "create:cut_crimsite");
        regularSet(CRIMSITE, "create:cut_crimsite_bricks", "create:cut_crimsite_brick_stairs", "create:cut_crimsite_brick_slab");
        connectingBlockOnly(CRIMSITE, "create:layered_crimsite");
        connectingBlockOnly(CRIMSITE, "create:crimsite_pillar");
        // Crimson window
        connectingBlockOnly(CRIMSON_WINDOW, "create:crimson_window");
        // Dark oak window
        connectingBlockOnly(DARK_OAK_WINDOW, "create:dark_oak_window");
        // Deepslate
        regularBlockOnly(DEEPSLATE, () -> Items.DEEPSLATE);
        regularSet(DEEPSLATE, "create:cut_deepslate");
        regularSet(DEEPSLATE, "create:cut_deepslate_bricks", "create:cut_deepslate_brick_stairs", "create:cut_deepslate_brick_slab");
        connectingBlockOnly(DEEPSLATE, "create:layered_deepslate");
        connectingBlockOnly(DEEPSLATE, "create:deepslate_pillar");
        // Diorite
        regularSet(DIORITE, "create:cut_diorite");
        regularSet(DIORITE, "create:cut_diorite_bricks", "create:cut_diorite_brick_stairs", "create:cut_diorite_brick_slab");
        connectingBlockOnly(DIORITE, "create:layered_diorite");
        connectingBlockOnly(DIORITE, "create:diorite_pillar");
        // Dripstone
        regularBlockOnly(DRIPSTONE, () -> Items.DRIPSTONE_BLOCK);
        regularSet(DRIPSTONE, "create:cut_dripstone");
        regularSet(DRIPSTONE, "create:cut_dripstone_bricks", "create:cut_dripstone_brick_stairs", "create:cut_dripstone_brick_slab");
        connectingBlockOnly(DRIPSTONE, "create:layered_dripstone");
        connectingBlockOnly(DRIPSTONE, "create:dripstone_pillar");
        // Glass
        regularBlockOnly(GLASS, () -> Items.GLASS);
        regularBlockOnly(GLASS, "create:tiled_glass");
        connectingBlockOnly(GLASS, "create:framed_glass");
        connectingBlockOnly(GLASS, "create:horizontal_framed_glass");
        connectingBlockOnly(GLASS, "create:vertical_framed_glass");
        // Granite
        regularSet(GRANITE, "create:cut_granite");
        regularSet(GRANITE, "create:cut_granite_bricks", "create:cut_granite_brick_stairs", "create:cut_granite_brick_slab");
        connectingBlockOnly(GRANITE, "create:layered_granite");
        connectingBlockOnly(GRANITE, "create:granite_pillar");
        // Jungle window
        connectingBlockOnly(JUNGLE_WINDOW, "create:jungle_window");
        // Limestone
        regularBlockOnly(LIMESTONE, getBlock("create:limestone"));
        regularSet(LIMESTONE, "create:cut_limestone");
        regularSet(LIMESTONE, "create:cut_limestone_bricks", "create:cut_limestone_brick_stairs", "create:cut_limestone_brick_slab");
        connectingBlockOnly(LIMESTONE, "create:layered_limestone");
        connectingBlockOnly(LIMESTONE, "create:limestone_pillar");
        // Mangrove window
        connectingBlockOnly(MANGROVE_WINDOW, "create:mangrove_window");
        // Oak window
        connectingBlockOnly(OAK_WINDOW, "create:oak_window");
        // Ochrum
        regularBlockOnly(OCHRUM, "create:ochrum");
        regularSet(OCHRUM, "create:cut_ochrum");
        regularSet(OCHRUM, "create:cut_ochrum_bricks", "create:cut_ochrum_brick_stairs", "create:cut_ochrum_brick_slab");
        connectingBlockOnly(OCHRUM, "create:layered_ochrum");
        connectingBlockOnly(OCHRUM, "create:ochrum_pillar");
        // Polished rose quartz
        regularBlockOnly(POLISHED_ROSE_QUARTZ, AllBlocks.SMALL_ROSE_QUARTZ_TILES::get);
        // Scorchia
        regularBlockOnly(SCORCHIA, "create:scorchia");
        regularSet(SCORCHIA, "create:cut_scorchia");
        regularSet(SCORCHIA, "create:cut_scorchia_bricks", "create:cut_scorchia_brick_stairs", "create:cut_scorchia_brick_slab");
        connectingBlockOnly(SCORCHIA, "create:layered_scorchia");
        connectingBlockOnly(SCORCHIA, "create:scorchia_pillar");
        // Scoria
        regularBlockOnly(SCORIA, "create:scoria");
        regularSet(SCORIA, "create:cut_scoria");
        regularSet(SCORIA, "create:cut_scoria_bricks", "create:cut_scoria_brick_stairs", "create:cut_scoria_brick_slab");
        connectingBlockOnly(SCORIA, "create:layered_scoria");
        connectingBlockOnly(SCORIA, "create:scoria_pillar");
        // Spruce window
        connectingBlockOnly(SPRUCE_WINDOW, "create:spruce_window");
        // Tuff
        regularBlockOnly(TUFF, () -> Items.TUFF);
        regularSet(TUFF, "create:cut_tuff");
        regularSet(TUFF, "create:cut_tuff_bricks", "create:cut_tuff_brick_stairs", "create:cut_tuff_brick_slab");
        connectingBlockOnly(TUFF, "create:layered_tuff");
        connectingBlockOnly(TUFF, "create:tuff_pillar");
        // Veridium
        regularBlockOnly(VERIDIUM, "create:veridium");
        regularSet(VERIDIUM, "create:cut_veridium");
        regularSet(VERIDIUM, "create:cut_veridium_bricks", "create:cut_veridium_brick_stairs", "create:cut_veridium_brick_slab");
        connectingBlockOnly(VERIDIUM, "create:layered_veridium");
        connectingBlockOnly(VERIDIUM, "create:veridium_pillar");
        // Warped window
        connectingBlockOnly(WARPED_WINDOW, "create:warped_window");
    }

    private static void regularBlockOnly(ResourceLocation recipe, Supplier<ItemLike> block){
        REGISTRATION.chiselingEntry(recipe, entry -> entry.regularBlock(block.get()));
    }

    private static void regularBlockOnly(ResourceLocation recipe, String blockIdentifier){
        regularBlockOnly(recipe, getBlock(blockIdentifier));
    }

    private static void connectingBlockOnly(ResourceLocation recipe, Supplier<ItemLike> block){
        REGISTRATION.chiselingEntry(recipe, entry -> entry.connectingBlock(block.get()));
    }

    private static void connectingBlockOnly(ResourceLocation recipe, String blockIdentifier){
        connectingBlockOnly(recipe, getBlock(blockIdentifier));
    }

    private static void regularSet(ResourceLocation recipe, String blockIdentifier, String stairsIdentifier, String slabIdentifier){
        Supplier<ItemLike> block = getBlock(blockIdentifier);
        Supplier<ItemLike> stairs = getBlock(stairsIdentifier);
        Supplier<ItemLike> slab = getBlock(slabIdentifier);
        REGISTRATION.chiselingEntry(recipe, entry -> {
            entry.regularBlock(block.get());
            entry.regularStairs(stairs.get());
            entry.regularSlab(slab.get());
        });
    }

    private static void regularSet(ResourceLocation recipe, String identifier){
        regularSet(recipe, identifier, identifier + "_stairs", identifier + "_slab");
    }
}
