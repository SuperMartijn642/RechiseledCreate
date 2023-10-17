package com.supermartijn642.rechiseled.create;

import com.jozufozu.flywheel.backend.instancing.InstancedRenderRegistry;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import com.supermartijn642.core.registry.ClientRegistrationHandler;
import com.supermartijn642.core.render.CustomRendererBakedModelWrapper;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselItemRenderer;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselRenderInstance;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselRenderer;
import net.fabricmc.api.ClientModInitializer;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
public class RechiseledCreateClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        // Register mechanical chisel renderer
        ClientRegistrationHandler handler = ClientRegistrationHandler.get(RechiseledCreate.MODID);
        handler.registerBlockEntityRenderer(() -> RechiseledCreate.mechanical_chisel_entity, MechanicalChiselRenderer::new);
        InstancedRenderRegistry.configure(RechiseledCreate.mechanical_chisel_entity).factory(MechanicalChiselRenderInstance::new).apply();
        handler.registerCustomItemRenderer(() -> RechiseledCreate.mechanical_chisel.asItem(), MechanicalChiselItemRenderer::new);
        handler.registerItemModelOverwrite(() -> RechiseledCreate.mechanical_chisel.asItem(), CustomRendererBakedModelWrapper::wrap);
        TooltipModifier.REGISTRY.register(RechiseledCreate.mechanical_chisel.asItem(), KineticStats.create(RechiseledCreate.mechanical_chisel.asItem()));
    }
}
