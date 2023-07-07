package com.supermartijn642.rechiseled.create;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.palettes.AllPaletteBlocks;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.supermartijn642.core.registry.Registries;
import com.supermartijn642.rechiseled.api.blocks.BlockModelType;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockBuilder;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.api.blocks.BlockSpecification.GLASS;
import static com.supermartijn642.rechiseled.api.blocks.BlockSpecification.GLASS_PILLAR;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
@SuppressWarnings("unused")
public class Blocks {

    // Acacia window
    public static final RechiseledBlockType ACACIA_WINDOW_COVERED = createWindow("acacia_window_covered", "Covered Acacia Window", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_DIAGONAL = createWindow("acacia_window_diagonal", "Diagonal Acacia Window", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_LARGE = createWindow("acacia_window_large", "Large Acacia Window", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_SLIM = createWindow("acacia_window_slim", "Slim Acacia Window", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_PANES = createWindow("acacia_window_panes", "Acacia Window Panes", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_TILES = createWindow("acacia_window_tiles", "Acacia Window Tiles", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_SWIRLING = createWindow("acacia_window_swirling", "Swirling Acacia Window", AllPaletteBlocks.ACACIA_WINDOW).recipe(Recipes.ACACIA_WINDOW).build();
    // Andesite
    public static final RechiseledBlockType ANDESITE_CUT_POLISHED = create("andesite_cut_polished", "Polished Cut Andesite", () -> AllPaletteStoneTypes.ANDESITE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_andesite")).recipe(Recipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_CUT_SMALL_BRICK = create("andesite_cut_small_brick", "Small Andesite Bricks", () -> AllPaletteStoneTypes.ANDESITE.getBaseBlock().get()).regularVariant(getBlock("create:small_andesite_bricks")).recipe(Recipes.ANDESITE).build();
    // Asurine
    public static final RechiseledBlockType ASURINE_CUT_POLISHED = create("asurine_cut_polished", "Polished Cut Asurine", () -> AllPaletteStoneTypes.ASURINE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_asurine")).recipe(Recipes.ASURINE).build();
    public static final RechiseledBlockType ASURINE_CUT_SMALL_BRICK = create("asurine_cut_small_brick", "Small Asurine Bricks", () -> AllPaletteStoneTypes.ASURINE.getBaseBlock().get()).regularVariant(getBlock("create:small_asurine_bricks")).recipe(Recipes.ASURINE).build();
    // Birch window
    public static final RechiseledBlockType BIRCH_WINDOW_BARS = createWindow("birch_window_bars", "Birch Window Bars", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_DIAGONAL = createWindow("birch_window_diagonal", "Diagonal Birch Window", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_LARGE = createWindow("birch_window_large", "Large Birch Window", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_SLIM = createWindow("birch_window_slim", "Slim Birch Window", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_PANES = createWindow("birch_window_panes", "Birch Window Panes", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_TILES = createWindow("birch_window_tiles", "Birch Window Tiles", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_SWIRLING = createWindow("birch_window_swirling", "Swirling Birch Window", AllPaletteBlocks.BIRCH_WINDOW).recipe(Recipes.BIRCH_WINDOW).build();
    // Calcite
    public static final RechiseledBlockType CALCITE_CUT_POLISHED = create("calcite_cut_polished", "Polished Cut Calcite", () -> AllPaletteStoneTypes.CALCITE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_calcite")).recipe(Recipes.CALCITE).build();
    public static final RechiseledBlockType CALCITE_CUT_SMALL_BRICK = create("calcite_cut_small_brick", "Small Calcite Bricks", () -> AllPaletteStoneTypes.CALCITE.getBaseBlock().get()).regularVariant(getBlock("create:small_calcite_bricks")).recipe(Recipes.CALCITE).build();
    // Crimsite
    public static final RechiseledBlockType CRIMSITE_CUT_POLISHED = create("crimsite_cut_polished", "Polished Cut Crimsite", () -> AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_crimsite")).recipe(Recipes.CRIMSITE).build();
    public static final RechiseledBlockType CRIMSITE_CUT_SMALL_BRICK = create("crimsite_cut_small_brick", "Small Crimsite Bricks", () -> AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get()).regularVariant(getBlock("create:small_crimsite_bricks")).recipe(Recipes.CRIMSITE).build();
    // Crimson window
    public static final RechiseledBlockType CRIMSON_WINDOW_BARS = createWindow("crimson_window_bars", "Crimson Window Bars", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_COVERED = createWindow("crimson_window_covered", "Covered Crimson Window", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_LARGE = createWindow("crimson_window_large", "Large Crimson Window", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_SLIM = createWindow("crimson_window_slim", "Slim Crimson Window", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_PANES = createWindow("crimson_window_panes", "Crimson Window Panes", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_TILES = createWindow("crimson_window_tiles", "Crimson Window Tiles", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_SWIRLING = createWindow("crimson_window_swirling", "Swirling Crimson Window", AllPaletteBlocks.CRIMSON_WINDOW).recipe(Recipes.CRIMSON_WINDOW).build();
    // Dark oak window
    public static final RechiseledBlockType DARK_OAK_WINDOW_BARS = createWindow("dark_oak_window_bars", "Dark Oak Window Bars", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_COVERED = createWindow("dark_oak_window_covered", "Covered Dark Oak Window", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_DIAGONAL = createWindow("dark_oak_window_diagonal", "Diagonal Dark Oak Window", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_SLIM = createWindow("dark_oak_window_slim", "Slim Dark Oak Window", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_PANES = createWindow("dark_oak_window_panes", "Dark Oak Window Panes", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_TILES = createWindow("dark_oak_window_tiles", "Dark Oak Window Tiles", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_SWIRLING = createWindow("dark_oak_window_swirling", "Swirling Dark Oak Window", AllPaletteBlocks.DARK_OAK_WINDOW).recipe(Recipes.DARK_OAK_WINDOW).build();
    // Deepslate
    public static final RechiseledBlockType DEEPSLATE_CUT_POLISHED = create("deepslate_cut_polished", "Polished Cut Deepslate", () -> AllPaletteStoneTypes.DEEPSLATE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_deepslate")).recipe(Recipes.DEEPSLATE).build();
    public static final RechiseledBlockType DEEPSLATE_CUT_SMALL_BRICK = create("deepslate_cut_small_brick", "Small Deepslate Bricks", () -> AllPaletteStoneTypes.DEEPSLATE.getBaseBlock().get()).regularVariant(getBlock("create:small_deepslate_bricks")).recipe(Recipes.DEEPSLATE).build();
    // Diorite
    public static final RechiseledBlockType DIORITE_CUT_POLISHED = create("diorite_cut_polished", "Polished Cut Diorite", () -> AllPaletteStoneTypes.DIORITE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_diorite")).recipe(Recipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_CUT_SMALL_BRICK = create("diorite_cut_small_brick", "Small Diorite Bricks", () -> AllPaletteStoneTypes.DIORITE.getBaseBlock().get()).regularVariant(getBlock("create:small_diorite_bricks")).recipe(Recipes.DIORITE).build();
    // Dripstone
    public static final RechiseledBlockType DRIPSTONE_CUT_POLISHED = create("dripstone_cut_polished", "Polished Cut Dripstone", () -> AllPaletteStoneTypes.DRIPSTONE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_dripstone")).recipe(Recipes.DRIPSTONE).build();
    public static final RechiseledBlockType DRIPSTONE_CUT_SMALL_BRICK = create("dripstone_cut_small_brick", "Small Dripstone Bricks", () -> AllPaletteStoneTypes.DRIPSTONE.getBaseBlock().get()).regularVariant(getBlock("create:small_dripstone_bricks")).recipe(Recipes.DRIPSTONE).build();
    // Granite
    public static final RechiseledBlockType GRANITE_CUT_POLISHED = create("granite_cut_polished", "Polished Cut Granite", () -> AllPaletteStoneTypes.GRANITE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_granite")).recipe(Recipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_CUT_SMALL_BRICK = create("granite_cut_small_brick", "Small Granite Bricks", () -> AllPaletteStoneTypes.GRANITE.getBaseBlock().get()).regularVariant(getBlock("create:small_granite_bricks")).recipe(Recipes.GRANITE).build();
    // Jungle window
    public static final RechiseledBlockType JUNGLE_WINDOW_BARS = createWindow("jungle_window_bars", "Jungle Window Bars", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_COVERED = createWindow("jungle_window_covered", "Covered Jungle Window", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_DIAGONAL = createWindow("jungle_window_diagonal", "Diagonal Jungle Window", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_LARGE = createWindow("jungle_window_large", "Large Jungle Window", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_PANES = createWindow("jungle_window_panes", "Jungle Window Panes", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_TILES = createWindow("jungle_window_tiles", "Jungle Window Tiles", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_SWIRLING = createWindow("jungle_window_swirling", "Swirling Jungle Window", AllPaletteBlocks.JUNGLE_WINDOW).recipe(Recipes.JUNGLE_WINDOW).build();
    // Limestone
    public static final RechiseledBlockType LIMESTONE_CUT_POLISHED = create("limestone_cut_polished", "Polished Cut Limestone", () -> AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_limestone")).recipe(Recipes.LIMESTONE).build();
    public static final RechiseledBlockType LIMESTONE_CUT_SMALL_BRICK = create("limestone_cut_small_brick", "Small Limestone Bricks", () -> AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get()).regularVariant(getBlock("create:small_limestone_bricks")).recipe(Recipes.LIMESTONE).build();
    // Oak window
    public static final RechiseledBlockType OAK_WINDOW_BARS = createWindow("oak_window_bars", "Oak Window Bars", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_COVERED = createWindow("oak_window_covered", "Covered Oak Window", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_DIAGONAL = createWindow("oak_window_diagonal", "Diagonal Oak Window", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_LARGE = createWindow("oak_window_large", "Large Oak Window", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_SLIM = createWindow("oak_window_slim", "Slim Oak Window", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_TILES = createWindow("oak_window_tiles", "Oak Window Tiles", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_SWIRLING = createWindow("oak_window_swirling", "Swirling Oak Window", AllPaletteBlocks.OAK_WINDOW).recipe(Recipes.OAK_WINDOW).build();
    // Ochrum
    public static final RechiseledBlockType OCHRUM_CUT_POLISHED = create("ochrum_cut_polished", "Polished Cut Ochrum", () -> AllPaletteStoneTypes.OCHRUM.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_ochrum")).recipe(Recipes.OCHRUM).build();
    public static final RechiseledBlockType OCHRUM_CUT_SMALL_BRICK = create("ochrum_cut_small_brick", "Small Ochrum Bricks", () -> AllPaletteStoneTypes.OCHRUM.getBaseBlock().get()).regularVariant(getBlock("create:small_ochrum_bricks")).recipe(Recipes.OCHRUM).build();
    // Polished rose quartz
    public static final RechiseledBlockType ROSE_QUARTZ_BRICKS = create("rose_quartz_bricks", "Rose Quartz Bricks", AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_CHISELED = create("rose_quartz_chiseled", "Chiseled Rose Quartz", AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_CRUSHED = create("rose_quartz_crushed", "Crushed Rose Quartz", AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_POLISHED_BLOCK = create("rose_quartz_polished_block", "Polished Block of Rose Quartz", AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_SQUARES = create("rose_quartz_squares", "Rose Quartz Squares", AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_TILES = create("rose_quartz_tiles", "Rose Quartz Tiles", AllBlocks.ROSE_QUARTZ_TILES).regularVariant(AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    // Scorchia
    public static final RechiseledBlockType SCORCHIA_CUT_POLISHED = create("scorchia_cut_polished", "Polished Cut Scorchia", () -> AllPaletteStoneTypes.SCORCHIA.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_scorchia")).recipe(Recipes.SCORCHIA).build();
    public static final RechiseledBlockType SCORCHIA_CUT_SMALL_BRICK = create("scorchia_cut_small_brick", "Small Scorchia Bricks", () -> AllPaletteStoneTypes.SCORCHIA.getBaseBlock().get()).regularVariant(getBlock("create:small_scorchia_bricks")).recipe(Recipes.SCORCHIA).build();
    // Scoria
    public static final RechiseledBlockType SCORIA_CUT_POLISHED = create("scoria_cut_polished", "Polished Cut Scoria", () -> AllPaletteStoneTypes.SCORIA.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_scoria")).recipe(Recipes.SCORIA).build();
    public static final RechiseledBlockType SCORIA_CUT_SMALL_BRICK = create("scoria_cut_small_brick", "Small Scoria Bricks", () -> AllPaletteStoneTypes.SCORIA.getBaseBlock().get()).regularVariant(getBlock("create:small_scoria_bricks")).recipe(Recipes.SCORIA).build();
    // Spruce window
    public static final RechiseledBlockType SPRUCE_WINDOW_BARS = createWindow("spruce_window_bars", "Spruce Window Bars", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_COVERED = createWindow("spruce_window_covered", "Covered Spruce Window", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_DIAGONAL = createWindow("spruce_window_diagonal", "Diagonal Spruce Window", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_LARGE = createWindow("spruce_window_large", "Large Spruce Window", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_SLIM = createWindow("spruce_window_slim", "Slim Spruce Window", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_PANES = createWindow("spruce_window_panes", "Spruce Window Panes", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_TILES = createWindow("spruce_window_tiles", "Spruce Window Tiles", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_SWIRLING = createWindow("spruce_window_swirling", "Swirling Spruce Window", AllPaletteBlocks.SPRUCE_WINDOW).recipe(Recipes.SPRUCE_WINDOW).build();
    // Tuff
    public static final RechiseledBlockType TUFF_CUT_POLISHED = create("tuff_cut_polished", "Polished Cut Tuff", () -> AllPaletteStoneTypes.TUFF.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_tuff")).recipe(Recipes.TUFF).build();
    public static final RechiseledBlockType TUFF_CUT_SMALL_BRICK = create("tuff_cut_small_brick", "Small Tuff Bricks", () -> AllPaletteStoneTypes.TUFF.getBaseBlock().get()).regularVariant(getBlock("create:small_tuff_bricks")).recipe(Recipes.TUFF).build();
    // Veridium
    public static final RechiseledBlockType VERIDIUM_CUT_POLISHED = create("veridium_cut_polished", "Polished Cut Veridium", () -> AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get()).regularVariant(getBlock("create:polished_cut_veridium")).recipe(Recipes.VERIDIUM).build();
    public static final RechiseledBlockType VERIDIUM_CUT_SMALL_BRICK = create("veridium_cut_small_brick", "Small Veridium Bricks", () -> AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get()).regularVariant(getBlock("create:small_veridium_bricks")).recipe(Recipes.VERIDIUM).build();
    // Warped window
    public static final RechiseledBlockType WARPED_WINDOW_BARS = createWindow("warped_window_bars", "Warped Window Bars", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_COVERED = createWindow("warped_window_covered", "Covered Warped Window", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_DIAGONAL = createWindow("warped_window_diagonal", "Diagonal Warped Window", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_LARGE = createWindow("warped_window_large", "Large Warped Window", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_SLIM = createWindow("warped_window_slim", "Slim Warped Window", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_PANES = createWindow("warped_window_panes", "Warped Window Panes", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_TILES = createWindow("warped_window_tiles", "Warped Window Tiles", AllPaletteBlocks.WARPED_WINDOW).recipe(Recipes.WARPED_WINDOW).build();

    private static RechiseledBlockBuilder createWindow(String identifier, String translation, Supplier<? extends Block> parent){
        return create(identifier, translation, parent).specification(GLASS_PILLAR);
    }

    private static RechiseledBlockBuilder create(String identifier, String translation){
        return RechiseledCreate.REGISTRATION.block(identifier).translation(translation);
    }

    private static RechiseledBlockBuilder create(String identifier, String translation, Supplier<? extends Block> parent){
        //noinspection unchecked
        return RechiseledCreate.REGISTRATION.block(identifier).translation(translation).copyProperties((Supplier<Block>)parent).miningTagsFrom((Supplier<Block>)parent);
    }

    private static Supplier<Block> getBlock(String identifier){
        ResourceLocation location = new ResourceLocation(identifier);
        return () -> Registries.BLOCKS.getValue(location);
    }

    public static void init(){
        // Cause this class to be initialized
    }
}
