package net.vpixelstudio.epicempires.item.armor;

import net.minecraft.resources.ResourceLocation;
import net.vpixelstudio.epicempires.registry.ItemsRegistry;

public class ModItemProperties {

    public static void addCustomItemProperties(){
        net.minecraft.client.renderer.item.ItemProperties.register(ItemsRegistry.SPARTAN_SHIELD.get(), new ResourceLocation("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });
    }

}
