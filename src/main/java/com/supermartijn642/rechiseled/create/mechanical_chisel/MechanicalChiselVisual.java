package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.base.KineticBlockEntityVisual;
import com.simibubi.create.content.kinetics.base.RotatingInstance;
import com.simibubi.create.content.kinetics.saw.SawBlock;
import com.simibubi.create.foundation.render.AllInstanceTypes;
import dev.engine_room.flywheel.api.instance.Instance;
import dev.engine_room.flywheel.api.instance.InstancerProvider;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.lib.model.Models;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.function.Consumer;

/**
 * Created 21/06/2023 by SuperMartijn642
 */
public class MechanicalChiselVisual extends KineticBlockEntityVisual<MechanicalChiselBlockEntity> {

    protected final RotatingInstance rotatingModel;

    public MechanicalChiselVisual(VisualizationContext context, MechanicalChiselBlockEntity blockEntity, float partialTick){
        super(context, blockEntity, partialTick);
        this.rotatingModel = shaft(this.instancerProvider(), this.blockState).setup(blockEntity).setPosition(this.getVisualPosition());
        this.rotatingModel.setChanged();
    }

    public static RotatingInstance shaft(InstancerProvider instancerProvider, BlockState state){
        var facing = state.getValue(BlockStateProperties.FACING);
        var axis = facing.getAxis();
        if(axis.isHorizontal()){
            Direction align = facing.getOpposite();
            return instancerProvider.instancer(AllInstanceTypes.ROTATING, Models.partial(AllPartialModels.SHAFT_HALF))
                .createInstance()
                .rotateTo(0, 0, 1, align.getStepX(), align.getStepY(), align.getStepZ());
        }else{
            return instancerProvider.instancer(AllInstanceTypes.ROTATING, Models.partial(AllPartialModels.SHAFT))
                .createInstance()
                .rotateToFace(state.getValue(SawBlock.AXIS_ALONG_FIRST_COORDINATE) ? Direction.Axis.X : Direction.Axis.Z);
        }
    }

    @Override
    public void update(float pt){
        this.rotatingModel.setup(this.blockEntity).setChanged();
    }

    @Override
    public void updateLight(float partialTick){
        this.relight(this.rotatingModel);
    }

    @Override
    protected void _delete(){
        this.rotatingModel.delete();
    }

    @Override
    public void collectCrumblingInstances(Consumer<Instance> consumer){
        consumer.accept(this.rotatingModel);
    }
}
