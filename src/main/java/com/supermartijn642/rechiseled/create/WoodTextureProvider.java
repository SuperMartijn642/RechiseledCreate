package com.supermartijn642.rechiseled.create;

import com.supermartijn642.rechiseled.api.ChiseledTextureProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;
import java.util.List;

/**
 * Created 07/07/2023 by SuperMartijn642
 */
@SuppressWarnings("removal")
public class WoodTextureProvider extends ChiseledTextureProvider {

    private static final ResourceLocation ACACIA = ResourceLocation.withDefaultNamespace("block/acacia_planks");
    private static final ResourceLocation BIRCH = ResourceLocation.withDefaultNamespace("block/birch_planks");
    private static final ResourceLocation CRIMSON = ResourceLocation.withDefaultNamespace("block/crimson_planks");
    private static final ResourceLocation DARK_OAK = ResourceLocation.withDefaultNamespace("block/dark_oak_planks");
    private static final ResourceLocation JUNGLE = ResourceLocation.withDefaultNamespace("block/jungle_planks");
    private static final ResourceLocation MANGROVE = ResourceLocation.withDefaultNamespace("block/mangrove_planks");
    private static final ResourceLocation OAK = ResourceLocation.withDefaultNamespace("block/oak_planks");
    private static final ResourceLocation SPRUCE = ResourceLocation.withDefaultNamespace("block/spruce_planks");
    private static final ResourceLocation WARPED = ResourceLocation.withDefaultNamespace("block/warped_planks");
    private static final List<ResourceLocation> PLANKS = Arrays.asList(ACACIA, BIRCH, CRIMSON, DARK_OAK, JUNGLE, MANGROVE, OAK, SPRUCE, WARPED);

    public WoodTextureProvider(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(RechiseledCreate.MODID, generator, existingFileHelper);
    }

    @Override
    protected void createTextures(){
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/acacia_window_bars_side"), ACACIA, "_window_bars_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_bars_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/birch_window_covered_side"), BIRCH, "_window_covered_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_covered_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/crimson_window_diagonal_side"), CRIMSON, "_window_diagonal_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_diagonal_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/dark_oak_window_large_side"), DARK_OAK, "_window_large_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_large_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/jungle_window_slim_side"), JUNGLE, "_window_slim_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_slim_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/mangrove_window_rounded_side"), MANGROVE, "_window_rounded_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_rounded_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/oak_window_panes_side"), OAK, "_window_panes_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_panes_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/oak_window_tiles_side"), OAK, "_window_tiles_side", true);
        this.mapPlankTexture(OAK, OAK, "_window_tiles_end", false);
        this.mapPlankTexture(ResourceLocation.fromNamespaceAndPath("rechiseledcreate", "block/warped_window_swirling_side"), WARPED, "_window_swirling_side", true);
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
