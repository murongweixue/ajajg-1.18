package net.hongye.rickroll.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

        public static void registerItems() {
            Registry.register(Registry.ITEM, new Identifier("rickroll", "custom_item"), CUSTOM_ITEM);
        }
}

