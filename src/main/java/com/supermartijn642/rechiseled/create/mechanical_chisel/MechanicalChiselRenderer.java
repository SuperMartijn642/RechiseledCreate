package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.jozufozu.flywheel.backend.Backend;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.base.KineticBlockEntityRenderer;
import com.simibubi.create.content.kinetics.saw.SawBlock;
import com.simibubi.create.foundation.blockEntity.behaviour.filtering.FilteringRenderer;
import com.simibubi.create.foundation.blockEntity.renderer.SafeBlockEntityRenderer;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import com.supermartijn642.core.ClientUtils;
import com.supermartijn642.rechiseled.Rechiseled;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.FACING;

/**
 * Created 16/05/2023 by SuperMartijn642
 */
public class MechanicalChiselRenderer extends SafeBlockEntityRenderer<MechanicalChiselBlockEntity> {

    @Override
    protected void renderSafe(MechanicalChiselBlockEntity be, float partialTicks, PoseStack ms, MultiBufferSource buffer, int light, int overlay){
        this.renderItems(be, partialTicks, ms, buffer, light, overlay);
        FilteringRenderer.renderOnBlockEntity(be, partialTicks, ms, buffer, light, overlay);

        if(Backend.canUseInstancing(be.getLevel()))
            return;

        this.renderShaft(be, ms, buffer, light, overlay);
    }

    protected void renderShaft(MechanicalChiselBlockEntity be, PoseStack ms, MultiBufferSource buffer, int light, int overlay){
        KineticBlockEntityRenderer.renderRotatingBuffer(be, this.getRotatedModel(be), ms, buffer.getBuffer(RenderType.solid()), light);
    }

    protected void renderItems(MechanicalChiselBlockEntity be, float partialTicks, PoseStack ms, MultiBufferSource buffer, int light, int overlay){
        boolean processingMode = be.getBlockState().getValue(SawBlock.FACING) == Direction.UP;
        if(processingMode && !be.inventory.isEmpty()){
            boolean alongZ = !be.getBlockState().getValue(SawBlock.AXIS_ALONG_FIRST_COORDINATE);
            ms.pushPose();

            boolean moving = be.inventory.recipeDuration != 0;
            float offset = moving ? 1 - be.inventory.remainingTime / be.inventory.recipeDuration : 0;
            if(be.inventory.appliedRecipe)
                offset += 1;
            if(moving){
                float processingSpeed = Mth.clamp(Math.abs(be.getSpeed()) / 24, 1, 128);
                offset = Mth.clamp(offset + (partialTicks + .5f) * processingSpeed / be.inventory.recipeDuration, 0.125f, 2f);
                offset /= 2;
            }

            float chiselProgress = offset > 0.4f ? offset > 0.6f ? Math.max(1 - (offset - 0.6f) / 0.2f, 0) : (offset - 0.4f) / 0.2f : 0;
            this.renderChisel(be, ms, buffer, light, overlay, chiselProgress);

            if(offset < 0.4f || offset > 0.6f)
                offset = offset < 0.4f ? offset / 0.8f : 0.5f + (offset - 0.6f) / 0.8f;
            else
                offset = 0.5f;

            if(be.getSpeed() == 0)
                offset = .5f;
            if(be.getSpeed() > 0 ^ alongZ)
                offset = 1 - offset;

            for(int i = 0; i < be.inventory.getSlots(); i++){
                ItemStack stack = be.inventory.getStackInSlot(i);
                if(stack.isEmpty())
                    continue;

                ItemRenderer itemRenderer = Minecraft.getInstance()
                    .getItemRenderer();
                BakedModel modelWithOverrides = itemRenderer.getModel(stack, be.getLevel(), null, 0);
                boolean blockItem = modelWithOverrides.isGui3d();

                ms.translate(alongZ ? offset : .5, blockItem ? .925f : 13f / 16f, alongZ ? .5 : offset);

                ms.scale(.5f, .5f, .5f);
                if(alongZ)
                    ms.mulPose(Vector3f.YP.rotationDegrees(90));
                ms.mulPose(Vector3f.XP.rotationDegrees(90));
                itemRenderer.renderStatic(stack, ItemTransforms.TransformType.FIXED, light, overlay, ms, buffer, 0);
                break;
            }

            ms.popPose();
        }else
            this.renderChisel(be, ms, buffer, light, overlay, 0);
    }

    private void renderChisel(MechanicalChiselBlockEntity be, PoseStack poseStack, MultiBufferSource buffer, int light, int overlay, float progress){
        Direction facing = be.getBlockState().getValue(SawBlock.FACING);
        if(facing.getAxis() != Direction.Axis.Y)
            return;
        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);
        if(be.getBlockState().getValue(SawBlock.FLIPPED))
            poseStack.mulPose(Vector3f.YP.rotationDegrees(180));
        if(be.getBlockState().getValue(SawBlock.AXIS_ALONG_FIRST_COORDINATE))
            poseStack.mulPose(Vector3f.YP.rotationDegrees(180));
        else
            poseStack.mulPose(Vector3f.YP.rotationDegrees(90));
        if(facing == Direction.DOWN)
            poseStack.mulPose(Vector3f.ZP.rotationDegrees(180));
        poseStack.translate(0.25, 0.6, 0);
        poseStack.scale(0.5f, 0.5f, 0.5f);
        poseStack.translate(0.2, -0.2, 0);
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(progress * 90));
        poseStack.translate(-0.2, 0.2, 0);
        ClientUtils.getItemRenderer().renderStatic(Rechiseled.chisel.getDefaultInstance(), ItemTransforms.TransformType.FIXED, light, overlay, poseStack, buffer, 0);
        poseStack.popPose();
    }

    protected SuperByteBuffer getRotatedModel(KineticBlockEntity be){
        BlockState state = be.getBlockState();
        if(state.getValue(FACING).getAxis().isHorizontal())
            return CachedBufferer.partialFacing(AllPartialModels.SHAFT_HALF, state.rotate(Rotation.CLOCKWISE_180));
        return CachedBufferer.block(KineticBlockEntityRenderer.KINETIC_BLOCK, this.getRenderedBlockState(be));
    }

    protected BlockState getRenderedBlockState(KineticBlockEntity be){
        return KineticBlockEntityRenderer.shaft(KineticBlockEntityRenderer.getRotationAxisOf(be));
    }
}
