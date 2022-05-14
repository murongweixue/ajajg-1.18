package net.hongye.rickroll;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {

	// an instance of our new item
	public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Logger LOGGER = LoggerFactory.getLogger("rickroll");
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
		LOGGER.info("Hello Fabric world!");
	}
}