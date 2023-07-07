package com.supermartijn642.rechiseled.create;

import com.simibubi.create.AllBlocks;
import com.supermartijn642.core.registry.Registries;
import com.supermartijn642.rechiseled.api.BaseChiselingRecipes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.lwjgl.opengl.GL;

import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.create.RechiseledCreate.REGISTRATION;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
public class Recipes {

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

    private static ResourceLocation rechiseledLocation(String name){
        return new ResourceLocation(RechiseledCreate.MODID, name);
    }

    private static Supplier<ItemLike> getBlock(String identifier){
        ResourceLocation location = new ResourceLocation(identifier);
        return () -> Registries.BLOCKS.getValue(location);
    }

    public static void init(){
        // Acacia window
        REGISTRATION.chiselingEntry(ACACIA_WINDOW, null, getBlock("create:acacia_window"));
        // Andesite
        REGISTRATION.chiselingEntry(ANDESITE, getBlock("create:cut_andesite"), null);
        REGISTRATION.chiselingEntry(ANDESITE, getBlock("create:cut_andesite_bricks"), null);
        REGISTRATION.chiselingEntry(ANDESITE, getBlock("create:layered_andesite"), null);
        REGISTRATION.chiselingEntry(ANDESITE, getBlock("create:andesite_pillar"), null);
        // Asurine
        REGISTRATION.chiselingEntry(ASURINE, getBlock("create:asurine"), null);
        REGISTRATION.chiselingEntry(ASURINE, getBlock("create:cut_asurine"), null);
        REGISTRATION.chiselingEntry(ASURINE, getBlock("create:cut_asurine_bricks"), null);
        REGISTRATION.chiselingEntry(ASURINE, getBlock("create:layered_asurine"), null);
        REGISTRATION.chiselingEntry(ASURINE, getBlock("create:asurine_pillar"), null);
        // Birch window
        REGISTRATION.chiselingEntry(BIRCH_WINDOW, null, getBlock("create:birch_window"));
        // Calcite
        REGISTRATION.chiselingEntry(CALCITE, () -> Items.CALCITE, null);
        REGISTRATION.chiselingEntry(CALCITE, getBlock("create:cut_calcite"), null);
        REGISTRATION.chiselingEntry(CALCITE, getBlock("create:cut_calcite_bricks"), null);
        REGISTRATION.chiselingEntry(CALCITE, getBlock("create:layered_calcite"), null);
        REGISTRATION.chiselingEntry(CALCITE, getBlock("create:calcite_pillar"), null);
        // Crimsite
        REGISTRATION.chiselingEntry(CRIMSITE, getBlock("create:crimsite"), null);
        REGISTRATION.chiselingEntry(CRIMSITE, getBlock("create:cut_crimsite"), null);
        REGISTRATION.chiselingEntry(CRIMSITE, getBlock("create:cut_crimsite_bricks"), null);
        REGISTRATION.chiselingEntry(CRIMSITE, getBlock("create:layered_crimsite"), null);
        REGISTRATION.chiselingEntry(CRIMSITE, getBlock("create:crimsite_pillar"), null);
        // Crimson window
        REGISTRATION.chiselingEntry(CRIMSON_WINDOW, null, getBlock("create:crimson_window"));
        // Dark oak window
        REGISTRATION.chiselingEntry(DARK_OAK_WINDOW, null, getBlock("create:dark_oak_window"));
        // Deepslate
        REGISTRATION.chiselingEntry(DEEPSLATE, () -> Items.DEEPSLATE, null);
        REGISTRATION.chiselingEntry(DEEPSLATE, getBlock("create:cut_deepslate"), null);
        REGISTRATION.chiselingEntry(DEEPSLATE, getBlock("create:cut_deepslate_bricks"), null);
        REGISTRATION.chiselingEntry(DEEPSLATE, getBlock("create:layered_deepslate"), null);
        REGISTRATION.chiselingEntry(DEEPSLATE, getBlock("create:deepslate_pillar"), null);
        // Diorite
        REGISTRATION.chiselingEntry(DIORITE, getBlock("create:cut_diorite"), null);
        REGISTRATION.chiselingEntry(DIORITE, getBlock("create:cut_diorite_bricks"), null);
        REGISTRATION.chiselingEntry(DIORITE, getBlock("create:layered_diorite"), null);
        REGISTRATION.chiselingEntry(DIORITE, getBlock("create:diorite_pillar"), null);
        // Dripstone
        REGISTRATION.chiselingEntry(DRIPSTONE, () -> Items.DRIPSTONE_BLOCK, null);
        REGISTRATION.chiselingEntry(DRIPSTONE, getBlock("create:cut_dripstone"), null);
        REGISTRATION.chiselingEntry(DRIPSTONE, getBlock("create:cut_dripstone_bricks"), null);
        REGISTRATION.chiselingEntry(DRIPSTONE, getBlock("create:layered_dripstone"), null);
        REGISTRATION.chiselingEntry(DRIPSTONE, getBlock("create:dripstone_pillar"), null);
        // Glass
        REGISTRATION.chiselingEntry(GLASS, () -> Items.GLASS, null);
        REGISTRATION.chiselingEntry(GLASS, getBlock("create:tiled_glass"), null);
        REGISTRATION.chiselingEntry(GLASS, null, getBlock("create:framed_glass"));
        REGISTRATION.chiselingEntry(GLASS, null, getBlock("create:horizontal_framed_glass"));
        REGISTRATION.chiselingEntry(GLASS, null, getBlock("create:vertical_framed_glass"));
        // Granite
        REGISTRATION.chiselingEntry(GRANITE, getBlock("create:cut_granite"), null);
        REGISTRATION.chiselingEntry(GRANITE, getBlock("create:cut_granite_bricks"), null);
        REGISTRATION.chiselingEntry(GRANITE, getBlock("create:layered_granite"), null);
        REGISTRATION.chiselingEntry(GRANITE, getBlock("create:granite_pillar"), null);
        // Jungle window
        REGISTRATION.chiselingEntry(JUNGLE_WINDOW, null, getBlock("create:jungle_window"));
        // Limestone
        REGISTRATION.chiselingEntry(LIMESTONE, getBlock("create:limestone"), null);
        REGISTRATION.chiselingEntry(LIMESTONE, getBlock("create:cut_limestone"), null);
        REGISTRATION.chiselingEntry(LIMESTONE, getBlock("create:cut_limestone_bricks"), null);
        REGISTRATION.chiselingEntry(LIMESTONE, getBlock("create:layered_limestone"), null);
        REGISTRATION.chiselingEntry(LIMESTONE, getBlock("create:limestone_pillar"), null);
        // Mangrove window
        REGISTRATION.chiselingEntry(MANGROVE_WINDOW, null, getBlock("create:mangrove_window"));
        // Oak window
        REGISTRATION.chiselingEntry(OAK_WINDOW, null, getBlock("create:oak_window"));
        // Ochrum
        REGISTRATION.chiselingEntry(OCHRUM, getBlock("create:ochrum"), null);
        REGISTRATION.chiselingEntry(OCHRUM, getBlock("create:cut_ochrum"), null);
        REGISTRATION.chiselingEntry(OCHRUM, getBlock("create:cut_ochrum_bricks"), null);
        REGISTRATION.chiselingEntry(OCHRUM, getBlock("create:layered_ochrum"), null);
        REGISTRATION.chiselingEntry(OCHRUM, getBlock("create:ochrum_pillar"), null);
        // Polished rose quartz
        REGISTRATION.chiselingEntry(POLISHED_ROSE_QUARTZ, AllBlocks.SMALL_ROSE_QUARTZ_TILES::get, null);
        // Scorchia
        REGISTRATION.chiselingEntry(SCORCHIA, getBlock("create:scorchia"), null);
        REGISTRATION.chiselingEntry(SCORCHIA, getBlock("create:cut_scorchia"), null);
        REGISTRATION.chiselingEntry(SCORCHIA, getBlock("create:cut_scorchia_bricks"), null);
        REGISTRATION.chiselingEntry(SCORCHIA, getBlock("create:layered_scorchia"), null);
        REGISTRATION.chiselingEntry(SCORCHIA, getBlock("create:scorchia_pillar"), null);
        // Scoria
        REGISTRATION.chiselingEntry(SCORIA, getBlock("create:scoria"), null);
        REGISTRATION.chiselingEntry(SCORIA, getBlock("create:cut_scoria"), null);
        REGISTRATION.chiselingEntry(SCORIA, getBlock("create:cut_scoria_bricks"), null);
        REGISTRATION.chiselingEntry(SCORIA, getBlock("create:layered_scoria"), null);
        REGISTRATION.chiselingEntry(SCORIA, getBlock("create:scoria_pillar"), null);
        // Spruce window
        REGISTRATION.chiselingEntry(SPRUCE_WINDOW, null, getBlock("create:spruce_window"));
        // Tuff
        REGISTRATION.chiselingEntry(TUFF, () -> Items.TUFF, null);
        REGISTRATION.chiselingEntry(TUFF, getBlock("create:cut_tuff"), null);
        REGISTRATION.chiselingEntry(TUFF, getBlock("create:cut_tuff_bricks"), null);
        REGISTRATION.chiselingEntry(TUFF, getBlock("create:layered_tuff"), null);
        REGISTRATION.chiselingEntry(TUFF, getBlock("create:tuff_pillar"), null);
        // Veridium
        REGISTRATION.chiselingEntry(VERIDIUM, getBlock("create:veridium"), null);
        REGISTRATION.chiselingEntry(VERIDIUM, getBlock("create:cut_veridium"), null);
        REGISTRATION.chiselingEntry(VERIDIUM, getBlock("create:cut_veridium_bricks"), null);
        REGISTRATION.chiselingEntry(VERIDIUM, getBlock("create:layered_veridium"), null);
        REGISTRATION.chiselingEntry(VERIDIUM, getBlock("create:veridium_pillar"), null);
        // Warped window
        REGISTRATION.chiselingEntry(WARPED_WINDOW, null, getBlock("create:warped_window"));
    }
}
