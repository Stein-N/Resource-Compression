package net.xstopho.resourcecompression;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.renderer.RenderType;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.registries.BlockRegistry;

public class ResourceCompressionClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        for (CompressedBlocks block : CompressedBlocks.values()) {
            for (int i = 1; i <= Constants.COMPRESSION; i++) {
                BlockRenderLayerMapImpl.INSTANCE.putBlock(block.getBlock(BlockRegistry.BLOCKS, i), RenderType.translucent());
            }
        }
    }
}
