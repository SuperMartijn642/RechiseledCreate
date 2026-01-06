package com.supermartijn642.rechiseled.create;

import com.simibubi.create.AllBlocks;
import com.supermartijn642.core.registry.Registries;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockBuilder;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.api.blocks.BlockSpecification.GLASS_PILLAR;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
@SuppressWarnings("unused")
public class Blocks {

    // Acacia window
    public static final RechiseledBlockType ACACIA_WINDOW_COVERED = createWindow("acacia_window_covered", "Covered Acacia Window", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_DIAGONAL = createWindow("acacia_window_diagonal", "Diagonal Acacia Window", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_LARGE = createWindow("acacia_window_large", "Large Acacia Window", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_PANES = createWindow("acacia_window_panes", "Acacia Window Panes", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_ROUNDED = createWindow("acacia_window_rounded", "Rounded Acacia Window", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_SLIM = createWindow("acacia_window_slim", "Slim Acacia Window", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_SWIRLING = createWindow("acacia_window_swirling", "Swirling Acacia Window", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    public static final RechiseledBlockType ACACIA_WINDOW_TILES = createWindow("acacia_window_tiles", "Acacia Window Tiles", () -> net.minecraft.world.level.block.Blocks.ACACIA_PLANKS).recipe(Recipes.ACACIA_WINDOW).build();
    // Andesite
    public static final RechiseledBlockType ANDESITE_CUT_POLISHED = create("andesite_cut_polished", "Polished Cut Andesite", () -> net.minecraft.world.level.block.Blocks.ANDESITE).regularVariant(getBlock("create:polished_cut_andesite")).recipe(Recipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_CUT_SMALL_BRICK = create("andesite_cut_small_brick", "Small Andesite Bricks", () -> net.minecraft.world.level.block.Blocks.ANDESITE).regularVariant(getBlock("create:small_andesite_bricks")).recipe(Recipes.ANDESITE).build();
    // Asurine
    public static final RechiseledBlockType ASURINE_CUT_POLISHED = create("asurine_cut_polished", "Polished Cut Asurine", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:polished_cut_asurine")).recipe(Recipes.ASURINE).build();
    public static final RechiseledBlockType ASURINE_CUT_SMALL_BRICK = create("asurine_cut_small_brick", "Small Asurine Bricks", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:small_asurine_bricks")).recipe(Recipes.ASURINE).build();
    // Birch window
    public static final RechiseledBlockType BIRCH_WINDOW_BARS = createWindow("birch_window_bars", "Birch Window Bars", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_DIAGONAL = createWindow("birch_window_diagonal", "Diagonal Birch Window", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_LARGE = createWindow("birch_window_large", "Large Birch Window", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_PANES = createWindow("birch_window_panes", "Birch Window Panes", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_ROUNDED = createWindow("birch_window_rounded", "Rounded Birch Window", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_SLIM = createWindow("birch_window_slim", "Slim Birch Window", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_SWIRLING = createWindow("birch_window_swirling", "Swirling Birch Window", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    public static final RechiseledBlockType BIRCH_WINDOW_TILES = createWindow("birch_window_tiles", "Birch Window Tiles", () -> net.minecraft.world.level.block.Blocks.BIRCH_PLANKS).recipe(Recipes.BIRCH_WINDOW).build();
    // Calcite
    public static final RechiseledBlockType CALCITE_CUT_POLISHED = create("calcite_cut_polished", "Polished Cut Calcite", () -> net.minecraft.world.level.block.Blocks.CALCITE).regularVariant(getBlock("create:polished_cut_calcite")).recipe(Recipes.CALCITE).build();
    public static final RechiseledBlockType CALCITE_CUT_SMALL_BRICK = create("calcite_cut_small_brick", "Small Calcite Bricks", () -> net.minecraft.world.level.block.Blocks.CALCITE).regularVariant(getBlock("create:small_calcite_bricks")).recipe(Recipes.CALCITE).build();
    // Crimsite
    public static final RechiseledBlockType CRIMSITE_CUT_POLISHED = create("crimsite_cut_polished", "Polished Cut Crimsite", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:polished_cut_crimsite")).recipe(Recipes.CRIMSITE).build();
    public static final RechiseledBlockType CRIMSITE_CUT_SMALL_BRICK = create("crimsite_cut_small_brick", "Small Crimsite Bricks", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:small_crimsite_bricks")).recipe(Recipes.CRIMSITE).build();
    // Crimson window
    public static final RechiseledBlockType CRIMSON_WINDOW_BARS = createWindow("crimson_window_bars", "Crimson Window Bars", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_COVERED = createWindow("crimson_window_covered", "Covered Crimson Window", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_LARGE = createWindow("crimson_window_large", "Large Crimson Window", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_PANES = createWindow("crimson_window_panes", "Crimson Window Panes", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_ROUNDED = createWindow("crimson_window_rounded", "Rounded Crimson Window", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_SLIM = createWindow("crimson_window_slim", "Slim Crimson Window", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_SWIRLING = createWindow("crimson_window_swirling", "Swirling Crimson Window", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_TILES = createWindow("crimson_window_tiles", "Crimson Window Tiles", () -> net.minecraft.world.level.block.Blocks.CRIMSON_PLANKS).recipe(Recipes.CRIMSON_WINDOW).build();
    // Dark oak window
    public static final RechiseledBlockType DARK_OAK_WINDOW_BARS = createWindow("dark_oak_window_bars", "Dark Oak Window Bars", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_COVERED = createWindow("dark_oak_window_covered", "Covered Dark Oak Window", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_DIAGONAL = createWindow("dark_oak_window_diagonal", "Diagonal Dark Oak Window", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_PANES = createWindow("dark_oak_window_panes", "Dark Oak Window Panes", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_ROUNDED = createWindow("dark_oak_window_rounded", "Rounded Dark Oak Window", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_SLIM = createWindow("dark_oak_window_slim", "Slim Dark Oak Window", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_SWIRLING = createWindow("dark_oak_window_swirling", "Swirling Dark Oak Window", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_TILES = createWindow("dark_oak_window_tiles", "Dark Oak Window Tiles", () -> net.minecraft.world.level.block.Blocks.DARK_OAK_PLANKS).recipe(Recipes.DARK_OAK_WINDOW).build();
    // Deepslate
    public static final RechiseledBlockType DEEPSLATE_CUT_POLISHED = create("deepslate_cut_polished", "Polished Cut Deepslate", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).regularVariant(getBlock("create:polished_cut_deepslate")).recipe(Recipes.DEEPSLATE).build();
    public static final RechiseledBlockType DEEPSLATE_CUT_SMALL_BRICK = create("deepslate_cut_small_brick", "Small Deepslate Bricks", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).regularVariant(getBlock("create:small_deepslate_bricks")).recipe(Recipes.DEEPSLATE).build();
    // Diorite
    public static final RechiseledBlockType DIORITE_CUT_POLISHED = create("diorite_cut_polished", "Polished Cut Diorite", () -> net.minecraft.world.level.block.Blocks.DIORITE).regularVariant(getBlock("create:polished_cut_diorite")).recipe(Recipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_CUT_SMALL_BRICK = create("diorite_cut_small_brick", "Small Diorite Bricks", () -> net.minecraft.world.level.block.Blocks.DIORITE).regularVariant(getBlock("create:small_diorite_bricks")).recipe(Recipes.DIORITE).build();
    // Dripstone
    public static final RechiseledBlockType DRIPSTONE_CUT_POLISHED = create("dripstone_cut_polished", "Polished Cut Dripstone", () -> net.minecraft.world.level.block.Blocks.DRIPSTONE_BLOCK).regularVariant(getBlock("create:polished_cut_dripstone")).recipe(Recipes.DRIPSTONE).build();
    public static final RechiseledBlockType DRIPSTONE_CUT_SMALL_BRICK = create("dripstone_cut_small_brick", "Small Dripstone Bricks", () -> net.minecraft.world.level.block.Blocks.DRIPSTONE_BLOCK).regularVariant(getBlock("create:small_dripstone_bricks")).recipe(Recipes.DRIPSTONE).build();
    // Granite
    public static final RechiseledBlockType GRANITE_CUT_POLISHED = create("granite_cut_polished", "Polished Cut Granite", () -> net.minecraft.world.level.block.Blocks.GRANITE).regularVariant(getBlock("create:polished_cut_granite")).recipe(Recipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_CUT_SMALL_BRICK = create("granite_cut_small_brick", "Small Granite Bricks", () -> net.minecraft.world.level.block.Blocks.GRANITE).regularVariant(getBlock("create:small_granite_bricks")).recipe(Recipes.GRANITE).build();
    // Jungle window
    public static final RechiseledBlockType JUNGLE_WINDOW_BARS = createWindow("jungle_window_bars", "Jungle Window Bars", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_COVERED = createWindow("jungle_window_covered", "Covered Jungle Window", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_DIAGONAL = createWindow("jungle_window_diagonal", "Diagonal Jungle Window", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_LARGE = createWindow("jungle_window_large", "Large Jungle Window", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_PANES = createWindow("jungle_window_panes", "Jungle Window Panes", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_ROUNDED = createWindow("jungle_window_rounded", "Rounded Jungle Window", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_SWIRLING = createWindow("jungle_window_swirling", "Swirling Jungle Window", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_TILES = createWindow("jungle_window_tiles", "Jungle Window Tiles", () -> net.minecraft.world.level.block.Blocks.JUNGLE_PLANKS).recipe(Recipes.JUNGLE_WINDOW).build();
    // Limestone
    public static final RechiseledBlockType LIMESTONE_CUT_POLISHED = create("limestone_cut_polished", "Polished Cut Limestone", () -> net.minecraft.world.level.block.Blocks.SANDSTONE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:polished_cut_limestone")).recipe(Recipes.LIMESTONE).build();
    public static final RechiseledBlockType LIMESTONE_CUT_SMALL_BRICK = create("limestone_cut_small_brick", "Small Limestone Bricks", () -> net.minecraft.world.level.block.Blocks.SANDSTONE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:small_limestone_bricks")).recipe(Recipes.LIMESTONE).build();
    // Mangrove window
    public static final RechiseledBlockType MANGROVE_WINDOW_BARS = createWindow("mangrove_window_bars", "Mangrove Window Bars", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_COVERED = createWindow("mangrove_window_covered", "Covered Mangrove Window", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_DIAGONAL = createWindow("mangrove_window_diagonal", "Diagonal Mangrove Window", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_LARGE = createWindow("mangrove_window_large", "Large Mangrove Window", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_SLIM = createWindow("mangrove_window_slim", "Slim Mangrove Window", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_PANES = createWindow("mangrove_window_panes", "Mangrove Window Panes", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_SWIRLING = createWindow("mangrove_window_swirling", "Swirling Mangrove Window", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_TILES = createWindow("mangrove_window_tiles", "Mangrove Window Tiles", () -> net.minecraft.world.level.block.Blocks.MANGROVE_PLANKS).recipe(Recipes.MANGROVE_WINDOW).build();
    // Oak window
    public static final RechiseledBlockType OAK_WINDOW_BARS = createWindow("oak_window_bars", "Oak Window Bars", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_COVERED = createWindow("oak_window_covered", "Covered Oak Window", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_DIAGONAL = createWindow("oak_window_diagonal", "Diagonal Oak Window", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_LARGE = createWindow("oak_window_large", "Large Oak Window", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_ROUNDED = createWindow("oak_window_rounded", "Rounded Oak Window", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_SLIM = createWindow("oak_window_slim", "Slim Oak Window", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_SWIRLING = createWindow("oak_window_swirling", "Swirling Oak Window", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    public static final RechiseledBlockType OAK_WINDOW_TILES = createWindow("oak_window_tiles", "Oak Window Tiles", () -> net.minecraft.world.level.block.Blocks.OAK_PLANKS).recipe(Recipes.OAK_WINDOW).build();
    // Ochrum
    public static final RechiseledBlockType OCHRUM_CUT_POLISHED = create("ochrum_cut_polished", "Polished Cut Ochrum", () -> net.minecraft.world.level.block.Blocks.CALCITE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:polished_cut_ochrum")).recipe(Recipes.OCHRUM).build();
    public static final RechiseledBlockType OCHRUM_CUT_SMALL_BRICK = create("ochrum_cut_small_brick", "Small Ochrum Bricks", () -> net.minecraft.world.level.block.Blocks.CALCITE).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:small_ochrum_bricks")).recipe(Recipes.OCHRUM).build();
    // Polished rose quartz
    public static final RechiseledBlockType ROSE_QUARTZ_BRICKS = create("rose_quartz_bricks", "Rose Quartz Bricks", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_CHISELED = create("rose_quartz_chiseled", "Chiseled Rose Quartz", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_CRUSHED = create("rose_quartz_crushed", "Crushed Rose Quartz", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_POLISHED_BLOCK = create("rose_quartz_polished_block", "Polished Block of Rose Quartz", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_SQUARES = create("rose_quartz_squares", "Rose Quartz Squares", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    public static final RechiseledBlockType ROSE_QUARTZ_TILES = create("rose_quartz_tiles", "Rose Quartz Tiles", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).regularVariant(AllBlocks.ROSE_QUARTZ_TILES).recipe(Recipes.POLISHED_ROSE_QUARTZ).build();
    // Scorchia
    public static final RechiseledBlockType SCORCHIA_CUT_POLISHED = create("scorchia_cut_polished", "Polished Cut Scorchia", () -> net.minecraft.world.level.block.Blocks.BLACKSTONE).regularVariant(getBlock("create:polished_cut_scorchia")).recipe(Recipes.SCORCHIA).build();
    public static final RechiseledBlockType SCORCHIA_CUT_SMALL_BRICK = create("scorchia_cut_small_brick", "Small Scorchia Bricks", () -> net.minecraft.world.level.block.Blocks.BLACKSTONE).regularVariant(getBlock("create:small_scorchia_bricks")).recipe(Recipes.SCORCHIA).build();
    // Scoria
    public static final RechiseledBlockType SCORIA_CUT_POLISHED = create("scoria_cut_polished", "Polished Cut Scoria", () -> net.minecraft.world.level.block.Blocks.BLACKSTONE).regularVariant(getBlock("create:polished_cut_scoria")).recipe(Recipes.SCORIA).build();
    public static final RechiseledBlockType SCORIA_CUT_SMALL_BRICK = create("scoria_cut_small_brick", "Small Scoria Bricks", () -> net.minecraft.world.level.block.Blocks.BLACKSTONE).regularVariant(getBlock("create:small_scoria_bricks")).recipe(Recipes.SCORIA).build();
    // Spruce window
    public static final RechiseledBlockType SPRUCE_WINDOW_BARS = createWindow("spruce_window_bars", "Spruce Window Bars", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_COVERED = createWindow("spruce_window_covered", "Covered Spruce Window", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_DIAGONAL = createWindow("spruce_window_diagonal", "Diagonal Spruce Window", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_LARGE = createWindow("spruce_window_large", "Large Spruce Window", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_PANES = createWindow("spruce_window_panes", "Spruce Window Panes", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_ROUNDED = createWindow("spruce_window_rounded", "Rounded Spruce Window", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_SLIM = createWindow("spruce_window_slim", "Slim Spruce Window", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_SWIRLING = createWindow("spruce_window_swirling", "Swirling Spruce Window", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_TILES = createWindow("spruce_window_tiles", "Spruce Window Tiles", () -> net.minecraft.world.level.block.Blocks.SPRUCE_PLANKS).recipe(Recipes.SPRUCE_WINDOW).build();
    // Tuff
    public static final RechiseledBlockType TUFF_CUT_POLISHED = create("tuff_cut_polished", "Polished Cut Tuff", () -> net.minecraft.world.level.block.Blocks.TUFF).regularVariant(getBlock("create:polished_cut_tuff")).recipe(Recipes.TUFF).build();
    public static final RechiseledBlockType TUFF_CUT_SMALL_BRICK = create("tuff_cut_small_brick", "Small Tuff Bricks", () -> net.minecraft.world.level.block.Blocks.TUFF).regularVariant(getBlock("create:small_tuff_bricks")).recipe(Recipes.TUFF).build();
    // Veridium
    public static final RechiseledBlockType VERIDIUM_CUT_POLISHED = create("veridium_cut_polished", "Polished Cut Veridium", () -> net.minecraft.world.level.block.Blocks.TUFF).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:polished_cut_veridium")).recipe(Recipes.VERIDIUM).build();
    public static final RechiseledBlockType VERIDIUM_CUT_SMALL_BRICK = create("veridium_cut_small_brick", "Small Veridium Bricks", () -> net.minecraft.world.level.block.Blocks.TUFF).properties(p -> p.destroyTime(1.25f)).regularVariant(getBlock("create:small_veridium_bricks")).recipe(Recipes.VERIDIUM).build();
    // Warped window
    public static final RechiseledBlockType WARPED_WINDOW_BARS = createWindow("warped_window_bars", "Warped Window Bars", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_COVERED = createWindow("warped_window_covered", "Covered Warped Window", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_DIAGONAL = createWindow("warped_window_diagonal", "Diagonal Warped Window", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_LARGE = createWindow("warped_window_large", "Large Warped Window", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_PANES = createWindow("warped_window_panes", "Warped Window Panes", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_ROUNDED = createWindow("warped_window_rounded", "Rounded Warped Window", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_SLIM = createWindow("warped_window_slim", "Slim Warped Window", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();
    public static final RechiseledBlockType WARPED_WINDOW_TILES = createWindow("warped_window_tiles", "Warped Window Tiles", () -> net.minecraft.world.level.block.Blocks.WARPED_PLANKS).recipe(Recipes.WARPED_WINDOW).build();

    private static RechiseledBlockBuilder createWindow(String identifier, String translation, Supplier<? extends Block> parent){
        return create(identifier, translation, () -> net.minecraft.world.level.block.Blocks.GLASS).specification(GLASS_PILLAR);
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
