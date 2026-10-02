package ru.dusn1z.item.tool;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
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
            p -> new AxeItem(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, p),
            new Item.Properties()
    );

    public static final Item EMERALD_PICKAXE = ModItems.register(
            ModToolIds.EMERALD_PICKAXE,
            Item::new,
            new Item.Properties().pickaxe(ToolMaterial.DIAMOND, 5.0F, -3.0F)
    );

    public static final Item EMERALD_SHOVEL = ModItems.register(
            ModToolIds.EMERALD_SHOVEL,
            p -> new ShovelItem(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, p),
            new Item.Properties()
    );

    public static final Item EMERALD_HOE = ModItems.register(
            ModToolIds.EMERALD_HOE,
            p -> new HoeItem(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, p),
            new Item.Properties()
    );

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> {
                    creativeTab.accept(ModTools.EMERALD_AXE);
                    creativeTab.accept(ModTools.EMERALD_PICKAXE);
                    creativeTab.accept(ModTools.EMERALD_SHOVEL);
                    creativeTab.accept(ModTools.EMERALD_HOE);
                });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register((creativeTab) -> {
                    creativeTab.accept(ModTools.EMERALD_SWORD);
                });
    }
}
