package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.base.SingleRotatingInstance;
import com.simibubi.create.content.kinetics.base.flwdata.RotatingData;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

/**
 * Created 21/06/2023 by SuperMartijn642
 */
public class MechanicalChiselRenderInstance extends SingleRotatingInstance<MechanicalChiselBlockEntity> {

    public MechanicalChiselRenderInstance(MaterialManager materialManager, MechanicalChiselBlockEntity entity){
        super(materialManager, entity);
    }

    @Override
    protected Instancer<RotatingData> getModel(){
        if(this.blockState.getValue(BlockStateProperties.FACING).getAxis().isHorizontal()){
            BlockState referenceState = this.blockState.rotate(Rotation.CLOCKWISE_180);
            Direction facing = referenceState.getValue(BlockStateProperties.FACING);
            return this.getRotatingMaterial().getModel(AllPartialModels.SHAFT_HALF, referenceState, facing);
        }
        return this.getRotatingMaterial().getModel(this.shaft());
    }
}
