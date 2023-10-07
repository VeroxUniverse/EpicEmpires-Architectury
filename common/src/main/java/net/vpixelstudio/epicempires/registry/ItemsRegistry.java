package net.vpixelstudio.epicempires.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.vpixelstudio.epicempires.EpicEmpires;
import net.vpixelstudio.epicempires.item.armor.custom.SpartanArmor;

public class ItemsRegistry {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(EpicEmpires.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(EpicEmpires.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<Item> SPARTAN_HELMET = REGISTRY.register("spartan_helmet", () ->
            new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistrySupplier<Item> SPARTAN_CHESTPLATE = REGISTRY.register("spartan_chestplate", () ->
            new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistrySupplier<Item> SPARTAN_LEGGINGS = REGISTRY.register("spartan_leggings", () ->
            new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistrySupplier<Item> SPARTAN_BOOTS = REGISTRY.register("spartan_boots", () ->
            new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistrySupplier<Item> SPARTAN_SWORD = REGISTRY.register("spartan_sword", () ->
            new SwordItem(ToolMaterialsRegistry.SPARTAN,2,-2.4f, new Item.Properties()));

    public static final RegistrySupplier<Item> SPARTAN_SHIELD = REGISTRY.register("spartan_shield", () ->
            new ShieldItem(new Item.Properties().durability(500)));

    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("items", () ->
            CreativeTabRegistry.create(Component.translatable("%s.creative_tab".formatted(EpicEmpires.MOD_ID)), () ->
                    new ItemStack(ItemsRegistry.SPARTAN_SHIELD.get())));

    public static void init()
    {
        CreativeTabRegistry.append(CREATIVE_TAB,
                SPARTAN_HELMET.get());
    }

}
