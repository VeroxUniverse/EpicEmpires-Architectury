package net.vpixelstudio.epicempires.forge;

import dev.architectury.platform.forge.EventBuses;
import net.vpixelstudio.epicempires.EpicEmpires;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EpicEmpires.MOD_ID)
public class EpicEmpiresForge {
    public EpicEmpiresForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(EpicEmpires.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        EpicEmpires.init();
    }
}