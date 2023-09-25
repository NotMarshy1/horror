package com.thatoneaiguy.horror.item;

import com.thatoneaiguy.horror.Horror;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CASSETTE = registerItem("cassette",
            new MusicDiscItem(6, Horror.ASTRAY_EVENT, new FabricItemSettings().maxCount(1).group(ModItemGroup.HORROR), 202));

    public static final Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Horror.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Horror.LOGGER.debug("Registering items for" + Horror.MOD_ID);
    }
}