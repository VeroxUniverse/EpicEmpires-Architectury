package net.vpixelstudio.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.vpixelstudio.epicempires.EpicEmpires;
import net.vpixelstudio.epicempires.item.armor.custom.SpartanArmor;

public class SpartanArmorModel extends GeoModel<SpartanArmor> {


    @Override
    public ResourceLocation getModelResource(SpartanArmor object) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/spartan_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpartanArmor armor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/spartan_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpartanArmor animatable) {
        return null;
    }
}