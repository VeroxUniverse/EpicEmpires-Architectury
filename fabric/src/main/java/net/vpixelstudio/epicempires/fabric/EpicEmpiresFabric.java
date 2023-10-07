package net.vpixelstudio.epicempires.fabric;

import com.mojang.logging.LogUtils;
import net.vpixelstudio.epicempires.EpicEmpires;
import net.fabricmc.api.ModInitializer;
import net.vpixelstudio.epicempires.registry.ItemsRegistry;
import org.slf4j.Logger;

public class EpicEmpiresFabric implements ModInitializer {

    private static final Logger LOGGER = LogUtils.getLogger();
    @Override
    public void onInitialize() {
        EpicEmpires.init();
        ItemsRegistry.REGISTRY.register();
        ItemsRegistry.CREATIVE_MODE_TABS.register();
    }
}