package ru.dusn1z.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import ru.dusn1z.MakeEmeraldsMoreThanJustCurrency;
import ru.dusn1z.item.tool.ModTools;

import java.util.function.Function;

public class ModItems {

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));

        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModTools.EMERALD_SWORD));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModTools.EMERALD_AXE));
    }
}