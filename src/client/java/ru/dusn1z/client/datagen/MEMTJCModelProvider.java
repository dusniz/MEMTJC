package ru.dusn1z.client.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.model.ModelTemplates;
import ru.dusn1z.item.tool.ModTools;

public class MEMTJCModelProvider extends FabricModelProvider {

    public MEMTJCModelProvider(FabricPackOutput output) { super(output); }

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.models.BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(net.minecraft.client.data.models.ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(
                ModTools.EMERALD_SWORD,
                ModelTemplates.FLAT_HANDHELD_ITEM
        );
        itemModelGenerators.generateFlatItem(
                ModTools.EMERALD_AXE,
                ModelTemplates.FLAT_HANDHELD_ITEM
        );
        itemModelGenerators.generateFlatItem(
                ModTools.EMERALD_PICKAXE,
                ModelTemplates.FLAT_HANDHELD_ITEM
        );
        itemModelGenerators.generateFlatItem(
                ModTools.EMERALD_SHOVEL,
                ModelTemplates.FLAT_HANDHELD_ITEM
        );
        itemModelGenerators.generateFlatItem(
                ModTools.EMERALD_HOE,
                ModelTemplates.FLAT_HANDHELD_ITEM
        );
    }

    @Override
    public String getName() {
        return "MEMTJCModelProvider";
    }
}
