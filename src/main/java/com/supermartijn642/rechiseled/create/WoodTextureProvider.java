package com.supermartijn642.rechiseled.create;

import com.supermartijn642.rechiseled.api.ChiseledTextureProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;
import java.util.List;

/**
 * Created 07/07/2023 by SuperMartijn642
 */
public class WoodTextureProvider extends ChiseledTextureProvider {

    private static final ResourceLocation ACACIA = new ResourceLocation("block/acacia_planks");
    private static final ResourceLocation BIRCH = new ResourceLocation("block/birch_planks");
    private static final ResourceLocation CRIMSON = new ResourceLocation("block/crimson_planks");
    private static final ResourceLocation DARK_OAK = new ResourceLocation("block/dark_oak_planks");
    private static final ResourceLocation JUNGLE = new ResourceLocation("block/jungle_planks");
    private static final ResourceLocation MANGROVE = new ResourceLocation("block/mangrove_planks");
    private static final ResourceLocation OAK = new ResourceLocation("block/oak_planks");
    private static final ResourceLocation SPRUCE = new ResourceLocation("block/spruce_planks");
    private static final ResourceLocation WARPED = new ResourceLocation("block/warped_planks");
    private static final List<ResourceLocation> PLANKS = Arrays.asList(ACACIA, BIRCH, CRIMSON, DARK_OAK, JUNGLE, MANGROVE, OAK, SPRUCE, WARPED);

    public WoodTextureProvider(FabricDataOutput output){
        super(RechiseledCreate.MODID, output);
    }

    @Override
    protected void createTextures(){
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/acacia_window_bars_side"), ACACIA, "_window_bars_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_bars_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/birch_window_covered_side"), BIRCH, "_window_covered_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_covered_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/crimson_window_diagonal_side"), CRIMSON, "_window_diagonal_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_diagonal_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/dark_oak_window_large_side"), DARK_OAK, "_window_large_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_large_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/jungle_window_slim_side"), JUNGLE, "_window_slim_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_slim_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/mangrove_window_rounded_side"), MANGROVE, "_window_rounded_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_rounded_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/oak_window_panes_side"), OAK, "_window_panes_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_panes_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/oak_window_tiles_side"), OAK, "_window_tiles_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_tiles_end", false);
        this.mapPlankTexture(new ResourceLocation("rechiseledcreate", "block/warped_window_swirling_side"), WARPED, "_window_swirling_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_swirling_end", false);
    }

    private void mapPlankTexture(ResourceLocation texture, ResourceLocation base, String name, boolean ignoreSelf){
        for(ResourceLocation plank : PLANKS){
            if(ignoreSelf && plank == base)
                continue;
            String plankName = plank.getPath().substring("block/".length()).split("_planks")[0];
            this.createPaletteMap(base, plank).ignoreMissing().applyToTexture(texture, "block/" + plankName + name);
        }
    }
}
