package net.vpixelstudio.epicempires;

import net.vpixelstudio.epicempires.registry.ItemsRegistry;

public class EpicEmpires
{
	public static final String MOD_ID = "epicempires";

	public static void init() {

		ItemsRegistry.REGISTRY.register();
		ItemsRegistry.CREATIVE_MODE_TABS.register();

	}
}
