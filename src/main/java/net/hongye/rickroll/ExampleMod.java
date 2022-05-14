package net.hongye.rickroll;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hongye.rickroll.register.ItemRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {

	// an instance of our new item


	public static final Logger LOGGER = LoggerFactory.getLogger("rickroll");

	@Override
	public void onInitialize() {

		ItemRegister.registerItems();

		LOGGER.info("Hello Fabric world!");

	}
}