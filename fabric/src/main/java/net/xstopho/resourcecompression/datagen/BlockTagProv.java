package net.xstopho.resourcecompression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.config.ConstantConfig;
import net.xstopho.resourcecompression.registries.BlockRegistry;

import java.util.concurrent.CompletableFuture;

public class BlockTagProv extends FabricTagProvider.BlockTagProvider {
    public BlockTagProv(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        for (CompressedBlocks blocks : CompressedBlocks.values()) {
            for (int i = 1; i <= ConstantConfig.COMPRESSION_LEVEL.get(); i++) {
                if (blocks.getTagKey() != null) {
                    getOrCreateTagBuilder(blocks.getTagKey()).add(blocks.getBlock(BlockRegistry.BLOCKS, i));
                }
            }
        }
    }
}
