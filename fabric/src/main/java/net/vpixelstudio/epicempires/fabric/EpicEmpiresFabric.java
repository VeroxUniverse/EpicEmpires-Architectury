package net.vpixelstudio.epicempires.fabric;

import net.vpixelstudio.epicempires.EpicEmpires;
import net.fabricmc.api.ModInitializer;

public class EpicEmpiresFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        EpicEmpires.init();
    }
}