package net.xstopho.resourcecompression;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.registries.BlockRegistry;

public class ResourceCompressionClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        Colors();
        for (CompressedBlocks block : CompressedBlocks.values()) {
            for (int i = 1; i <= Constants.COMPRESSION; i++) {
                BlockRenderLayerMap.INSTANCE.putBlock(block.getBlock(BlockRegistry.BLOCKS, i), RenderType.translucent());
            }
        }
    }

    private void Colors(){
        for (CompressedBlocks compressedBlock: CompressedBlocks.values()) {
            ItemColor itemColor = null;
            BlockColor blockColor = null;

            switch (compressedBlock){
                case OAK_LEAVES, JUNGLE_LEAVES, ACACIA_LEAVES, DARK_OAK_LEAVES, MANGROVE_LEAVES -> {
                    blockColor = ((state, world, pos, tintIndex) ->
                            world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor());
                    itemColor = (stack, tintIndex) -> FoliageColor.getDefaultColor();

                }
                case SPRUCE_LEAVES -> {
                    blockColor = (state, world, pos, tintIndex) -> FoliageColor.getEvergreenColor();
                    itemColor = (stack, tintIndex) -> FoliageColor.getEvergreenColor();
                }
                case BIRCH_LEAVES -> {
                    blockColor = (state, world, pos, tintIndex) -> FoliageColor.getBirchColor();
                    itemColor = (stack, tintIndex) -> FoliageColor.getBirchColor();
                }
                case GRASS_BLOCK -> {
                    blockColor = (state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : GrassColor.get(0.5, 1.0);
                    itemColor = (stack, tintIndex) -> GrassColor.get(0.5, 1.0);
                }
            }

            for (int i = 1; i < Constants.COMPRESSION; i++) {
                ColorProviderRegistry.BLOCK.register(blockColor, compressedBlock.getBlock(BlockRegistry.BLOCKS, i));
                ColorProviderRegistry.ITEM.register(itemColor, compressedBlock.getBlock(BlockRegistry.BLOCKS, i).asItem());
            }

        }



    }
}
