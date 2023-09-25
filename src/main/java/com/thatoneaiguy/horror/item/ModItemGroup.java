package com.thatoneaiguy.horror.item;

import com.thatoneaiguy.horror.Horror;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HORROR = FabricItemGroupBuilder.build(
            new Identifier(Horror.MOD_ID, "horror"), () -> new ItemStack(ModItems.CASSETTE));
}
