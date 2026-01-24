package com.supermartijn642.rechiseled.create.compat.jei;

import com.supermartijn642.rechiseled.compat.jei.ChiselingJEIPlugin;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

/**
 * Created 28/12/2021 by SuperMartijn642
 */
@JeiPlugin
public class RechiseledCreateJEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid(){
        return new ResourceLocation(RechiseledCreate.MODID, "chiseling_plugin");
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration){
        registration.addRecipeCatalyst(new ItemStack(RechiseledCreate.mechanical_chisel), ChiselingJEIPlugin.CHISELING_RECIPE_TYPE);
    }
}
