package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.kinetics.saw.SawBlock;
import com.supermartijn642.core.generator.*;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.rechiseled.Rechiseled;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import net.minecraft.core.Direction;

/**
 * Created 16/05/2023 by SuperMartijn642
 */
public class MechanicalChiselDataGenerators {

    public static void register(){
        GeneratorRegistrationHandler handler = GeneratorRegistrationHandler.get(RechiseledCreate.MODID);
        handler.addGenerator(cache -> new BlockStateGenerator(RechiseledCreate.MODID, cache) {
            @Override
            public void generate(){
                this.blockState(RechiseledCreate.mechanical_chisel).variantsForAll((state, variant) -> {
                    boolean firstAxis = state.get(MechanicalChiselBlock.AXIS_ALONG_FIRST_COORDINATE);
                    Direction facing = state.get(MechanicalChiselBlock.FACING);
                    boolean flipped = state.get(SawBlock.FLIPPED);
                    variant.model(
                        "create", "block/mechanical_saw/" + (facing.getAxis().isVertical() ? "vertical" : "horizontal"),
                        facing == Direction.DOWN ? 180 : 0,
                        facing.getAxis().isVertical() ? (firstAxis ? 270 : 0) + (flipped ? 180 : 0) : (int)facing.toYRot()
                    );
                });
            }
        });
        handler.addGenerator(cache -> new LanguageGenerator(RechiseledCreate.MODID, cache, "en_us") {
            @Override
            public void generate(){
                this.block(RechiseledCreate.mechanical_chisel, "Mechanical Chisel");
            }
        });
        handler.addGenerator(cache -> new RecipeGenerator(RechiseledCreate.MODID, cache) {
            @Override
            public void generate(){
                this.shapeless(RechiseledCreate.mechanical_chisel)
                    .input(AllBlocks.ANDESITE_CASING.get())
                    .input(Rechiseled.chisel)
                    .unlockedBy(AllBlocks.ANDESITE_CASING.get(), Rechiseled.chisel);
            }
        });
        handler.addGenerator(cache -> new LootTableGenerator(RechiseledCreate.MODID, cache) {
            @Override
            public void generate(){
                this.dropSelf(RechiseledCreate.mechanical_chisel);
            }
        });
        handler.addGenerator(cache -> new TagGenerator(RechiseledCreate.MODID, cache) {
            @Override
            public void generate(){
                this.blockMineableWithAxe().add(RechiseledCreate.mechanical_chisel);
                this.blockMineableWithPickaxe().add(RechiseledCreate.mechanical_chisel);
            }
        });
    }
}
