package ru.dusn1z.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import ru.dusn1z.MakeEmeraldsMoreThanJustCurrency;

public class ModItemIds {

    public static ResourceKey<Item> createKey(String name) {
        return ResourceKey.create(Registries.ITEM, MakeEmeraldsMoreThanJustCurrency.id(name));
    }
}