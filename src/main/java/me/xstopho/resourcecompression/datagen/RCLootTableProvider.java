package me.xstopho.resourcecompression.datagen;

import me.xstopho.resourcecompression.enums.CompressedBlocks;
import me.xstopho.resourcecompression.init.RCBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class RCLootTableProvider extends FabricBlockLootTableProvider {
    public RCLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
            for (int i = 1; i <= 9; i++) {
                addDrop(RCBlocks.BLOCKS.get(compressedBlocks.getName(i)));
            }
        }
    }
}
