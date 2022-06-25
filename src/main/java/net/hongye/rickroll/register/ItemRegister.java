package net.hongye.rickroll.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hongye.rickroll.CustomItem;
import net.hongye.rickroll.items.Bow;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {

    public static final CustomItem CUSTOM_ITEM = new CustomItem(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Bow BOW =new Bow(new FabricItemSettings().group(ItemGroup.MISC));

        public static void registerItems() {

            Registry.register(Registry.ITEM, new Identifier("rickroll", "custom_item"), CUSTOM_ITEM);

            Registry.register(Registry.ITEM, new Identifier("rickroll","boooow"),BOW);

        }
}

