package net.vpixelstudio.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.vpixelstudio.epicempires.item.armor.client.model.SpartanArmorModel;
import net.vpixelstudio.epicempires.item.armor.custom.SpartanArmor;

public class SpartanArmorRenderer extends GeoArmorRenderer<SpartanArmor> {
    public SpartanArmorRenderer() {
        super(new SpartanArmorModel());
    }
}