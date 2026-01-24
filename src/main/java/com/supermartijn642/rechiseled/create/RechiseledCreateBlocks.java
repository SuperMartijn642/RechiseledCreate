package com.supermartijn642.rechiseled.create;

import com.simibubi.create.AllBlocks;
import com.supermartijn642.core.block.BlockProperties;
import com.supermartijn642.core.registry.Registries;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockBuilder;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.api.blocks.BlockSpecification.GLASS_PILLAR;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
@SuppressWarnings("unused")
public class RechiseledCreateBlocks {

    // Acacia window
    private static final Consumer<BlockProperties> ACACIA_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> ACACIA_WINDOW_CONFIGURER = b -> b.properties(ACACIA_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.ACACIA_PLANKS).recipe(RechiseledCreateRecipes.ACACIA_WINDOW);
    public static final RechiseledBlockType ACACIA_WINDOW_COVERED = createWindow("acacia_window_covered", "Covered Acacia Window").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_DIAGONAL = createWindow("acacia_window_diagonal", "Diagonal Acacia Window").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_LARGE = createWindow("acacia_window_large", "Large Acacia Window").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_PANES = createWindow("acacia_window_panes", "Acacia Window Panes").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_ROUNDED = createWindow("acacia_window_rounded", "Rounded Acacia Window").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_SLIM = createWindow("acacia_window_slim", "Slim Acacia Window").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_SWIRLING = createWindow("acacia_window_swirling", "Swirling Acacia Window").configure(ACACIA_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType ACACIA_WINDOW_TILES = createWindow("acacia_window_tiles", "Acacia Window Tiles").configure(ACACIA_WINDOW_CONFIGURER).build();
    // Andesite
    private static final Consumer<BlockProperties> ANDESITE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.5F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> ANDESITE_CONFIGURER = b -> b.properties(ANDESITE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.ANDESITE).recipe(RechiseledCreateRecipes.ANDESITE);
    public static final RechiseledBlockType ANDESITE_CUT_POLISHED = create("andesite_cut_polished", "Polished Cut Andesite").configure(ANDESITE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_andesite")).withStairs().withSlabs().build();
    public static final RechiseledBlockType ANDESITE_CUT_SMALL_BRICK = create("andesite_cut_small_brick", "Small Andesite Bricks").configure(ANDESITE_CONFIGURER).configure(regularBlockStairsSlab("create:small_andesite_bricks", "create:small_andesite_brick_stairs", "create:small_andesite_brick_slab")).withStairs().withSlabs().build();
    // Asurine
    private static final Consumer<BlockProperties> ASURINE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.25f).explosionResistance(6.0F).sound(SoundType.DEEPSLATE);
    private static final Consumer<RechiseledBlockBuilder> ASURINE_CONFIGURER = b -> b.properties(ASURINE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DEEPSLATE).recipe(RechiseledCreateRecipes.ASURINE);
    public static final RechiseledBlockType ASURINE_CUT_POLISHED = create("asurine_cut_polished", "Polished Cut Asurine").configure(ASURINE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_asurine")).build();
    public static final RechiseledBlockType ASURINE_CUT_SMALL_BRICK = create("asurine_cut_small_brick", "Small Asurine Bricks").configure(ASURINE_CONFIGURER).configure(regularBlockStairsSlab("create:small_asurine_bricks", "create:small_asurine_brick_stairs", "create:small_asurine_brick_slab")).build();
    // Birch window
    private static final Consumer<BlockProperties> BIRCH_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> BIRCH_WINDOW_CONFIGURER = b -> b.properties(BIRCH_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.BIRCH_PLANKS).recipe(RechiseledCreateRecipes.BIRCH_WINDOW);
    public static final RechiseledBlockType BIRCH_WINDOW_BARS = createWindow("birch_window_bars", "Birch Window Bars").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_DIAGONAL = createWindow("birch_window_diagonal", "Diagonal Birch Window").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_LARGE = createWindow("birch_window_large", "Large Birch Window").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_PANES = createWindow("birch_window_panes", "Birch Window Panes").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_ROUNDED = createWindow("birch_window_rounded", "Rounded Birch Window").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_SLIM = createWindow("birch_window_slim", "Slim Birch Window").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_SWIRLING = createWindow("birch_window_swirling", "Swirling Birch Window").configure(BIRCH_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType BIRCH_WINDOW_TILES = createWindow("birch_window_tiles", "Birch Window Tiles").configure(BIRCH_WINDOW_CONFIGURER).build();
    // Calcite
    private static final Consumer<BlockProperties> CALCITE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectTool().strength(0.75F);
    private static final Consumer<RechiseledBlockBuilder> CALCITE_CONFIGURER = b -> b.properties(CALCITE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.CALCITE).recipe(RechiseledCreateRecipes.CALCITE);
    public static final RechiseledBlockType CALCITE_CUT_POLISHED = create("calcite_cut_polished", "Polished Cut Calcite").configure(CALCITE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_calcite")).build();
    public static final RechiseledBlockType CALCITE_CUT_SMALL_BRICK = create("calcite_cut_small_brick", "Small Calcite Bricks").configure(CALCITE_CONFIGURER).configure(regularBlockStairsSlab("create:small_calcite_bricks", "create:small_calcite_brick_stairs", "create:small_calcite_brick_slab")).build();
    // Crimsite
    private static final Consumer<BlockProperties> CRIMSITE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.25f).explosionResistance(6.0F).sound(SoundType.DEEPSLATE);
    private static final Consumer<RechiseledBlockBuilder> CRIMSITE_CONFIGURER = b -> b.properties(CRIMSITE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DEEPSLATE).recipe(RechiseledCreateRecipes.CRIMSITE);
    public static final RechiseledBlockType CRIMSITE_CUT_POLISHED = create("crimsite_cut_polished", "Polished Cut Crimsite").configure(CRIMSITE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_crimsite")).build();
    public static final RechiseledBlockType CRIMSITE_CUT_SMALL_BRICK = create("crimsite_cut_small_brick", "Small Crimsite Bricks").configure(CRIMSITE_CONFIGURER).configure(regularBlockStairsSlab("create:small_crimsite_bricks", "create:small_crimsite_brick_stairs", "create:small_crimsite_brick_slab")).build();
    // Crimson window
    private static final Consumer<BlockProperties> CRIMSON_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.CRIMSON_STEM).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> CRIMSON_WINDOW_CONFIGURER = b -> b.properties(CRIMSON_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.CRIMSON_PLANKS).recipe(RechiseledCreateRecipes.CRIMSON_WINDOW);
    public static final RechiseledBlockType CRIMSON_WINDOW_BARS = createWindow("crimson_window_bars", "Crimson Window Bars").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_COVERED = createWindow("crimson_window_covered", "Covered Crimson Window").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_LARGE = createWindow("crimson_window_large", "Large Crimson Window").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_PANES = createWindow("crimson_window_panes", "Crimson Window Panes").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_ROUNDED = createWindow("crimson_window_rounded", "Rounded Crimson Window").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_SLIM = createWindow("crimson_window_slim", "Slim Crimson Window").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_SWIRLING = createWindow("crimson_window_swirling", "Swirling Crimson Window").configure(CRIMSON_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType CRIMSON_WINDOW_TILES = createWindow("crimson_window_tiles", "Crimson Window Tiles").configure(CRIMSON_WINDOW_CONFIGURER).build();
    // Dark oak window
    private static final Consumer<BlockProperties> DARK_OAK_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> DARK_OAK_WINDOW_CONFIGURER = b -> b.properties(DARK_OAK_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DARK_OAK_PLANKS).recipe(RechiseledCreateRecipes.DARK_OAK_WINDOW);
    public static final RechiseledBlockType DARK_OAK_WINDOW_BARS = createWindow("dark_oak_window_bars", "Dark Oak Window Bars").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_COVERED = createWindow("dark_oak_window_covered", "Covered Dark Oak Window").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_DIAGONAL = createWindow("dark_oak_window_diagonal", "Diagonal Dark Oak Window").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_PANES = createWindow("dark_oak_window_panes", "Dark Oak Window Panes").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_ROUNDED = createWindow("dark_oak_window_rounded", "Rounded Dark Oak Window").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_SLIM = createWindow("dark_oak_window_slim", "Slim Dark Oak Window").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_SWIRLING = createWindow("dark_oak_window_swirling", "Swirling Dark Oak Window").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType DARK_OAK_WINDOW_TILES = createWindow("dark_oak_window_tiles", "Dark Oak Window Tiles").configure(DARK_OAK_WINDOW_CONFIGURER).build();
    // Deepslate
    private static final Consumer<BlockProperties> DEEPSLATE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.25f).explosionResistance(6.0F).sound(SoundType.DEEPSLATE);
    private static final Consumer<RechiseledBlockBuilder> DEEPSLATE_CONFIGURER = b -> b.properties(DEEPSLATE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DEEPSLATE).recipe(RechiseledCreateRecipes.DEEPSLATE);
    public static final RechiseledBlockType DEEPSLATE_CUT_POLISHED = create("deepslate_cut_polished", "Polished Cut Deepslate").configure(DEEPSLATE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_deepslate")).build();
    public static final RechiseledBlockType DEEPSLATE_CUT_SMALL_BRICK = create("deepslate_cut_small_brick", "Small Deepslate Bricks").configure(DEEPSLATE_CONFIGURER).configure(regularBlockStairsSlab("create:small_deepslate_bricks", "create:small_deepslate_brick_stairs", "create:small_deepslate_brick_slab")).build();
    // Diorite
    private static final Consumer<BlockProperties> DIORITE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.5F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> DIORITE_CONFIGURER = b -> b.properties(DIORITE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DIORITE).recipe(RechiseledCreateRecipes.DIORITE);
    public static final RechiseledBlockType DIORITE_CUT_POLISHED = create("diorite_cut_polished", "Polished Cut Diorite").configure(DIORITE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_diorite")).build();
    public static final RechiseledBlockType DIORITE_CUT_SMALL_BRICK = create("diorite_cut_small_brick", "Small Diorite Bricks").configure(DIORITE_CONFIGURER).configure(regularBlockStairsSlab("create:small_diorite_bricks", "create:small_diorite_brick_stairs", "create:small_diorite_brick_slab")).build();
    // Dripstone
    private static final Consumer<BlockProperties> DRIPSTONE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectTool().destroyTime(1.5F).explosionResistance(1.0F);
    private static final Consumer<RechiseledBlockBuilder> DRIPSTONE_CONFIGURER = b -> b.properties(DRIPSTONE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DRIPSTONE_BLOCK).recipe(RechiseledCreateRecipes.DRIPSTONE);
    public static final RechiseledBlockType DRIPSTONE_CUT_POLISHED = create("dripstone_cut_polished", "Polished Cut Dripstone").configure(DRIPSTONE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_dripstone")).build();
    public static final RechiseledBlockType DRIPSTONE_CUT_SMALL_BRICK = create("dripstone_cut_small_brick", "Small Dripstone Bricks").configure(DRIPSTONE_CONFIGURER).configure(regularBlockStairsSlab("create:small_dripstone_bricks", "create:small_dripstone_brick_stairs", "create:small_dripstone_brick_slab")).build();
    // Granite
    private static final Consumer<BlockProperties> GRANITE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.5F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> GRANITE_CONFIGURER = b -> b.properties(GRANITE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.GRANITE).recipe(RechiseledCreateRecipes.GRANITE);
    public static final RechiseledBlockType GRANITE_CUT_POLISHED = create("granite_cut_polished", "Polished Cut Granite").configure(GRANITE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_granite")).build();
    public static final RechiseledBlockType GRANITE_CUT_SMALL_BRICK = create("granite_cut_small_brick", "Small Granite Bricks").configure(GRANITE_CONFIGURER).configure(regularBlockStairsSlab("create:small_granite_bricks", "create:small_granite_brick_stairs", "create:small_granite_brick_slab")).build();
    // Jungle window
    private static final Consumer<BlockProperties> JUNGLE_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> JUNGLE_WINDOW_CONFIGURER = b -> b.properties(JUNGLE_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.JUNGLE_PLANKS).recipe(RechiseledCreateRecipes.JUNGLE_WINDOW);
    public static final RechiseledBlockType JUNGLE_WINDOW_BARS = createWindow("jungle_window_bars", "Jungle Window Bars").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_COVERED = createWindow("jungle_window_covered", "Covered Jungle Window").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_DIAGONAL = createWindow("jungle_window_diagonal", "Diagonal Jungle Window").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_LARGE = createWindow("jungle_window_large", "Large Jungle Window").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_PANES = createWindow("jungle_window_panes", "Jungle Window Panes").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_ROUNDED = createWindow("jungle_window_rounded", "Rounded Jungle Window").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_SWIRLING = createWindow("jungle_window_swirling", "Swirling Jungle Window").configure(JUNGLE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType JUNGLE_WINDOW_TILES = createWindow("jungle_window_tiles", "Jungle Window Tiles").configure(JUNGLE_WINDOW_CONFIGURER).build();
    // Limestone
    private static final Consumer<BlockProperties> LIMESTONE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.25F).explosionResistance(0.8F);
    private static final Consumer<RechiseledBlockBuilder> LIMESTONE_CONFIGURER = b -> b.properties(LIMESTONE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.SANDSTONE).recipe(RechiseledCreateRecipes.LIMESTONE);
    public static final RechiseledBlockType LIMESTONE_CUT_POLISHED = create("limestone_cut_polished", "Polished Cut Limestone").configure(LIMESTONE_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_limestone")).build();
    public static final RechiseledBlockType LIMESTONE_CUT_SMALL_BRICK = create("limestone_cut_small_brick", "Small Limestone Bricks").configure(LIMESTONE_CONFIGURER).configure(regularBlockStairsSlab("create:small_limestone_bricks", "create:small_limestone_brick_stairs", "create:small_limestone_brick_slab")).build();
    // Mangrove window
    private static final Consumer<BlockProperties> MANGROVE_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> MANGROVE_WINDOW_CONFIGURER = b -> b.properties(MANGROVE_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.MANGROVE_PLANKS).recipe(RechiseledCreateRecipes.MANGROVE_WINDOW);
    public static final RechiseledBlockType MANGROVE_WINDOW_BARS = createWindow("mangrove_window_bars", "Mangrove Window Bars").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_COVERED = createWindow("mangrove_window_covered", "Covered Mangrove Window").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_DIAGONAL = createWindow("mangrove_window_diagonal", "Diagonal Mangrove Window").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_LARGE = createWindow("mangrove_window_large", "Large Mangrove Window").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_SLIM = createWindow("mangrove_window_slim", "Slim Mangrove Window").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_PANES = createWindow("mangrove_window_panes", "Mangrove Window Panes").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_SWIRLING = createWindow("mangrove_window_swirling", "Swirling Mangrove Window").configure(MANGROVE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType MANGROVE_WINDOW_TILES = createWindow("mangrove_window_tiles", "Mangrove Window Tiles").configure(MANGROVE_WINDOW_CONFIGURER).build();
    // Oak window
    private static final Consumer<BlockProperties> OAK_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> OAK_WINDOW_CONFIGURER = b -> b.properties(OAK_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.OAK_PLANKS).recipe(RechiseledCreateRecipes.OAK_WINDOW);
    public static final RechiseledBlockType OAK_WINDOW_BARS = createWindow("oak_window_bars", "Oak Window Bars").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_COVERED = createWindow("oak_window_covered", "Covered Oak Window").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_DIAGONAL = createWindow("oak_window_diagonal", "Diagonal Oak Window").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_LARGE = createWindow("oak_window_large", "Large Oak Window").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_ROUNDED = createWindow("oak_window_rounded", "Rounded Oak Window").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_SLIM = createWindow("oak_window_slim", "Slim Oak Window").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_SWIRLING = createWindow("oak_window_swirling", "Swirling Oak Window").configure(OAK_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType OAK_WINDOW_TILES = createWindow("oak_window_tiles", "Oak Window Tiles").configure(OAK_WINDOW_CONFIGURER).build();
    // Ochrum
    private static final Consumer<BlockProperties> OCHRUM_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectTool().destroyTime(1.25f).explosionResistance(0.75F);
    private static final Consumer<RechiseledBlockBuilder> OCHRUM_CONFIGURER = b -> b.properties(OCHRUM_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.CALCITE).recipe(RechiseledCreateRecipes.OCHRUM);
    public static final RechiseledBlockType OCHRUM_CUT_POLISHED = create("ochrum_cut_polished", "Polished Cut Ochrum").configure(OCHRUM_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_ochrum")).build();
    public static final RechiseledBlockType OCHRUM_CUT_SMALL_BRICK = create("ochrum_cut_small_brick", "Small Ochrum Bricks").configure(OCHRUM_CONFIGURER).configure(regularBlockStairsSlab("create:small_ochrum_bricks", "create:small_ochrum_brick_stairs", "create:small_ochrum_brick_slab")).build();
    // Polished rose quartz
    private static final Consumer<BlockProperties> ROSE_QUARTZ_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(3.0F).explosionResistance(6.0F).sound(SoundType.DEEPSLATE);
    private static final Consumer<RechiseledBlockBuilder> ROSE_QUARTZ_CONFIGURER = b -> b.properties(ROSE_QUARTZ_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.DEEPSLATE).recipe(RechiseledCreateRecipes.POLISHED_ROSE_QUARTZ);
    public static final RechiseledBlockType ROSE_QUARTZ_BRICKS = create("rose_quartz_bricks", "Rose Quartz Bricks").configure(ROSE_QUARTZ_CONFIGURER).build();
    public static final RechiseledBlockType ROSE_QUARTZ_CHISELED = create("rose_quartz_chiseled", "Chiseled Rose Quartz").configure(ROSE_QUARTZ_CONFIGURER).build();
    public static final RechiseledBlockType ROSE_QUARTZ_CRUSHED = create("rose_quartz_crushed", "Crushed Rose Quartz").configure(ROSE_QUARTZ_CONFIGURER).build();
    public static final RechiseledBlockType ROSE_QUARTZ_POLISHED_BLOCK = create("rose_quartz_polished_block", "Polished Block of Rose Quartz").configure(ROSE_QUARTZ_CONFIGURER).build();
    public static final RechiseledBlockType ROSE_QUARTZ_SQUARES = create("rose_quartz_squares", "Rose Quartz Squares").configure(ROSE_QUARTZ_CONFIGURER).build();
    public static final RechiseledBlockType ROSE_QUARTZ_TILES = create("rose_quartz_tiles", "Rose Quartz Tiles").configure(ROSE_QUARTZ_CONFIGURER).regularVariant(AllBlocks.ROSE_QUARTZ_TILES).build();
    // Scorchia
    private static final Consumer<BlockProperties> SCORCHIA_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.5F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> SCORCHIA_CONFIGURER = b -> b.properties(SCORCHIA_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.BLACKSTONE).recipe(RechiseledCreateRecipes.SCORCHIA);
    public static final RechiseledBlockType SCORCHIA_CUT_POLISHED = create("scorchia_cut_polished", "Polished Cut Scorchia").configure(SCORCHIA_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_scorchia")).build();
    public static final RechiseledBlockType SCORCHIA_CUT_SMALL_BRICK = create("scorchia_cut_small_brick", "Small Scorchia Bricks").configure(SCORCHIA_CONFIGURER).configure(regularBlockStairsSlab("create:small_scorchia_bricks", "create:small_scorchia_brick_stairs", "create:small_scorchia_brick_slab")).build();
    // Scoria
    private static final Consumer<BlockProperties> SCORIA_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectTool().destroyTime(1.5F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> SCORIA_CONFIGURER = b -> b.properties(SCORIA_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.BLACKSTONE).recipe(RechiseledCreateRecipes.SCORIA);
    public static final RechiseledBlockType SCORIA_CUT_POLISHED = create("scoria_cut_polished", "Polished Cut Scoria").configure(SCORIA_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_scoria")).build();
    public static final RechiseledBlockType SCORIA_CUT_SMALL_BRICK = create("scoria_cut_small_brick", "Small Scoria Bricks").configure(SCORIA_CONFIGURER).configure(regularBlockStairsSlab("create:small_scoria_bricks", "create:small_scoria_brick_stairs", "create:small_scoria_brick_slab")).build();
    // Spruce window
    private static final Consumer<BlockProperties> SPRUCE_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> SPRUCE_WINDOW_CONFIGURER = b -> b.properties(SPRUCE_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.SPRUCE_PLANKS).recipe(RechiseledCreateRecipes.SPRUCE_WINDOW);
    public static final RechiseledBlockType SPRUCE_WINDOW_BARS = createWindow("spruce_window_bars", "Spruce Window Bars").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_COVERED = createWindow("spruce_window_covered", "Covered Spruce Window").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_DIAGONAL = createWindow("spruce_window_diagonal", "Diagonal Spruce Window").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_LARGE = createWindow("spruce_window_large", "Large Spruce Window").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_PANES = createWindow("spruce_window_panes", "Spruce Window Panes").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_ROUNDED = createWindow("spruce_window_rounded", "Rounded Spruce Window").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_SLIM = createWindow("spruce_window_slim", "Slim Spruce Window").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_SWIRLING = createWindow("spruce_window_swirling", "Swirling Spruce Window").configure(SPRUCE_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType SPRUCE_WINDOW_TILES = createWindow("spruce_window_tiles", "Spruce Window Tiles").configure(SPRUCE_WINDOW_CONFIGURER).build();
    // Tuff
    private static final Consumer<BlockProperties> TUFF_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectTool().destroyTime(1.5F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> TUFF_CONFIGURER = b -> b.properties(TUFF_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.TUFF).recipe(RechiseledCreateRecipes.TUFF);
    public static final RechiseledBlockType TUFF_CUT_POLISHED = create("tuff_cut_polished", "Polished Cut Tuff").configure(TUFF_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_tuff")).build();
    public static final RechiseledBlockType TUFF_CUT_SMALL_BRICK = create("tuff_cut_small_brick", "Small Tuff Bricks").configure(TUFF_CONFIGURER).configure(regularBlockStairsSlab("create:small_tuff_bricks", "create:small_tuff_brick_stairs", "create:small_tuff_brick_slab")).build();
    // Veridium
    private static final Consumer<BlockProperties> VERIDIUM_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectTool().destroyTime(1.25F).explosionResistance(6.0F);
    private static final Consumer<RechiseledBlockBuilder> VERIDIUM_CONFIGURER = b -> b.properties(VERIDIUM_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.TUFF).recipe(RechiseledCreateRecipes.VERIDIUM);
    public static final RechiseledBlockType VERIDIUM_CUT_POLISHED = create("veridium_cut_polished", "Polished Cut Veridium").configure(VERIDIUM_CONFIGURER).configure(regularBlockStairsSlab("create:polished_cut_veridium")).build();
    public static final RechiseledBlockType VERIDIUM_CUT_SMALL_BRICK = create("veridium_cut_small_brick", "Small Veridium Bricks").configure(VERIDIUM_CONFIGURER).configure(regularBlockStairsSlab("create:small_veridium_bricks", "create:small_veridium_brick_stairs", "create:small_veridium_brick_slab")).build();
    // Warped window
    private static final Consumer<BlockProperties> WARPED_WINDOW_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.WARPED_STEM).instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never);
    private static final Consumer<RechiseledBlockBuilder> WARPED_WINDOW_CONFIGURER = b -> b.properties(WARPED_WINDOW_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.WARPED_PLANKS).recipe(RechiseledCreateRecipes.WARPED_WINDOW);
    public static final RechiseledBlockType WARPED_WINDOW_BARS = createWindow("warped_window_bars", "Warped Window Bars").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_COVERED = createWindow("warped_window_covered", "Covered Warped Window").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_DIAGONAL = createWindow("warped_window_diagonal", "Diagonal Warped Window").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_LARGE = createWindow("warped_window_large", "Large Warped Window").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_PANES = createWindow("warped_window_panes", "Warped Window Panes").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_ROUNDED = createWindow("warped_window_rounded", "Rounded Warped Window").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_SLIM = createWindow("warped_window_slim", "Slim Warped Window").configure(WARPED_WINDOW_CONFIGURER).build();
    public static final RechiseledBlockType WARPED_WINDOW_TILES = createWindow("warped_window_tiles", "Warped Window Tiles").configure(WARPED_WINDOW_CONFIGURER).build();

    private static RechiseledBlockBuilder createWindow(String identifier, String translation){
        return create(identifier, translation).specification(GLASS_PILLAR);
    }

    private static RechiseledBlockBuilder create(String identifier, String translation){
        return RechiseledCreate.REGISTRATION.block(identifier).translation(translation);
    }

    private static Consumer<RechiseledBlockBuilder> regularBlockStairsSlab(String blockIdentifier, String stairsIdentifier, String slabIdentifier){
        Supplier<Block> block = getBlock(blockIdentifier);
        Supplier<Block> stairs = getBlock(stairsIdentifier);
        Supplier<Block> slab = getBlock(slabIdentifier);
        return builder -> builder.regularVariant(block, stairs, slab);
    }

    private static Consumer<RechiseledBlockBuilder> regularBlockStairsSlab(String identifier){
        return regularBlockStairsSlab(identifier, identifier + "_stairs", identifier + "_slab");
    }

    private static Supplier<Block> getBlock(String identifier){
        ResourceLocation location = ResourceLocation.parse(identifier);
        return () -> {
            if(!Registries.BLOCKS.hasIdentifier(location))
                throw new RuntimeException("Unknown block '" + identifier + "'!");
            return Registries.BLOCKS.getValue(location);
        };
    }

    public static void init(){
        // Cause this class to be initialized
    }
}
