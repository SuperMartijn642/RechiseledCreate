package com.supermartijn642.rechiseled.create;

import com.supermartijn642.core.registry.ClientRegistrationHandler;
import com.supermartijn642.core.render.CustomRendererBakedModelWrapper;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselItemRenderer;
import com.supermartijn642.rechiseled.create.mechanical_chisel.MechanicalChiselRenderer;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
public class RechiseledCreateClient {

    public static void onInitializeClient(){
        // Register mechanical chisel renderer
        ClientRegistrationHandler handler = ClientRegistrationHandler.get(RechiseledCreate.MODID);
        handler.registerBlockEntityRenderer(() -> RechiseledCreate.mechanical_chisel_entity, MechanicalChiselRenderer::new);
        handler.registerCustomItemRenderer(() -> RechiseledCreate.mechanical_chisel.asItem(), MechanicalChiselItemRenderer::new);
        handler.registerItemModelOverwrite(() -> RechiseledCreate.mechanical_chisel.asItem(), CustomRendererBakedModelWrapper::wrap);
    }
}
