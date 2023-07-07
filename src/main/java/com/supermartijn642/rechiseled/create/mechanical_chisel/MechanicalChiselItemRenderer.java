package com.supermartijn642.rechiseled.create.mechanical_chisel;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.supermartijn642.core.ClientUtils;
import com.supermartijn642.core.render.CustomItemRenderer;
import com.supermartijn642.rechiseled.Rechiseled;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.world.item.ItemStack;

/**
 * Created 25/06/2023 by SuperMartijn642
 */
public class MechanicalChiselItemRenderer implements CustomItemRenderer {

    @Override
    public void render(ItemStack stack, ItemTransforms.TransformType transformType, PoseStack poseStack, MultiBufferSource bufferSource, int combinedLight, int combinedOverlay){
        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);
        poseStack.mulPose(Vector3f.YP.rotationDegrees(180));
        poseStack.translate(-0.5, -0.5, -0.5);
        // Render the block itself
        ClientUtils.getBlockRenderer().renderSingleBlock(RechiseledCreate.mechanical_chisel.defaultBlockState(), poseStack, bufferSource, combinedLight, combinedOverlay);
        // Render the chisel on top
        poseStack.translate(0.5, 0.5, 0.5);
        poseStack.mulPose(Vector3f.YP.rotationDegrees(180));
        poseStack.translate(0.25, 0.57, 0);
        poseStack.scale(0.8f, 0.8f, 0.8f);
        ClientUtils.getItemRenderer().renderStatic(Rechiseled.chisel.getDefaultInstance(), ItemTransforms.TransformType.FIXED, combinedLight, combinedOverlay, poseStack, bufferSource, 0);
        poseStack.popPose();
    }
}
