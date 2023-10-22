package me.xstopho.resourcecompression.datagen;

import me.xstopho.resourcecompression.enums.CompressedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RCBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RCBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
            for (int i = 1; i <= 9; i++) {
                getOrCreateTagBuilder(compressedBlocks.getTagKey()).add(compressedBlocks.getBlock(i));
            }
        }
    }
}
