package ru.dusn1z.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import ru.dusn1z.item.tool.ModToolIds;
import ru.dusn1z.item.tool.ModTools;

import java.util.concurrent.CompletableFuture;

public class MEMTJCTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public MEMTJCTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModTools.EMERALD_SWORD);
        valueLookupBuilder(ItemTags.AXES)
                .add(ModTools.EMERALD_AXE);
    }
}
