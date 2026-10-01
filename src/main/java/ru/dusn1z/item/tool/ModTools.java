package ru.dusn1z.item.tool;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import ru.dusn1z.item.ModItems;

import static ru.dusn1z.item.tool.ModToolMaterial.EMERALD_TOOL_MATERIAL;

public class ModTools {

    public static final Item EMERALD_SWORD = ModItems.register(
            ModToolIds.EMERALD_SWORD,
            Item::new,
            new Item.Properties().sword(EMERALD_TOOL_MATERIAL, 1f, 1f)
            );

    public static final Item EMERALD_AXE = ModItems.register(
            ModToolIds.EMERALD_AXE,
            settings -> new AxeItem(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, settings),
            new Item.Properties()
    );
}
