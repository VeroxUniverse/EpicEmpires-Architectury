package net.vpixelstudio.epicempires.item.armor.custom;

import mod.azure.azurelibarmor.animatable.client.RenderProvider;
import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import mod.azure.azurelibarmor.renderer.GeoItemRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.vpixelstudio.epicempires.item.armor.ModArmorItem;
import net.vpixelstudio.epicempires.item.armor.client.renderer.SpartanArmorRenderer;

import java.util.function.Consumer;

public class SpartanArmor extends ModArmorItem {

    public SpartanArmor(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;
            @Override
            public HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (this.renderer == null) {
                    this.renderer = new SpartanArmorRenderer();
                }
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }

}
