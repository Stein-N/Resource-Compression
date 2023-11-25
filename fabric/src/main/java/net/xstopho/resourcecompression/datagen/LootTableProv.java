package net.xstopho.resourcecompression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.xstopho.resourcecompression.Constants;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.registries.BlockRegistry;

public class LootTableProv extends FabricBlockLootTableProvider {
    public LootTableProv(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (CompressedBlocks blocks : CompressedBlocks.values()) {
            for (int i = 1; i <= Constants.COMPRESSION; i++) {
                dropSelf(blocks.getBlock(BlockRegistry.BLOCKS, i));
            }
        }
    }
}
