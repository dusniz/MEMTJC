package ru.dusn1z.item.tool;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.level.block.Block;
import ru.dusn1z.MakeEmeraldsMoreThanJustCurrency;

public class ModToolMaterial {

    public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = TagKey.create(Registries.BLOCK,
            MakeEmeraldsMoreThanJustCurrency.id("incorrect_for_emerald_tool"));

    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(),
            MakeEmeraldsMoreThanJustCurrency.id("repairs_emerald_armor"));

    public static final ToolMaterial EMERALD_TOOL_MATERIAL = new ToolMaterial(
            INCORRECT_FOR_EMERALD_TOOL,
            455,
            5.0F,
            1.5F,
            22,
            REPAIRS_EMERALD_ARMOR
    );
}
