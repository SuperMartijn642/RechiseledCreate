package com.supermartijn642.rechiseled.create.compat.rei;

import com.supermartijn642.rechiseled.compat.rei.ChiselingREIPlugin;
import com.supermartijn642.rechiseled.create.RechiseledCreate;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;

/**
 * Created 29/07/2025 by SuperMartijn642
 */
public class RechiseledCreateREIPlugin implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry){
        registry.addWorkstations(ChiselingREIPlugin.CHISELING_CATEGORY, EntryStacks.of(RechiseledCreate.mechanical_chisel));
    }
}
