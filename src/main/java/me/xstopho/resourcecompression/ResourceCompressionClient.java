package me.xstopho.resourcecompression;

import me.xstopho.resourcecompression.enums.CompressedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

public class ResourceCompressionClient implements ClientModInitializer {


	@Override
	public void onInitializeClient() {
		for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
			ItemColorProvider itemColor = null;
			BlockColorProvider blockColor = null;

			switch(compressedBlocks) {
				case OAK_LEAVES, DARK_OAK_LEAVES, ACACIA_LEAVES, JUNGLE_LEAVES, MANGROVE_LEAVES -> {
					blockColor = (state, world, pos, tintIndex) ->
							world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor();
					itemColor = (stack, tintIndex) -> FoliageColors.getDefaultColor();
				}
				case SPRUCE_LEAVES -> {
					blockColor =(state, world, pos, tintIndex) -> FoliageColors.getSpruceColor();
					itemColor = (stack, tintIndex) -> FoliageColors.getSpruceColor();
				}
				case BIRCH_LEAVES -> {
					blockColor =(state, world, pos, tintIndex) -> FoliageColors.getBirchColor();
					itemColor = (stack, tintIndex) -> FoliageColors.getSpruceColor();
				}
				case GRASS_BLOCK-> {
					blockColor = (state, world, pos, tintIndex) ->
							world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0);
					itemColor = (stack, tintIndex) -> GrassColors.getDefaultColor();
				}
			}

			for (int i = 1; i <= 9; i++) {
				BlockRenderLayerMap.INSTANCE.putBlock(compressedBlocks.getBlock(i), RenderLayer.getCutout());
				if (blockColor == null && itemColor == null) {
					ColorProviderRegistryImpl.BLOCK.register((state, world, pos, tintIndex) -> 0x4a4a48, compressedBlocks.getBlock(i));
					ColorProviderRegistryImpl.ITEM.register((stack, tintIndex) -> 0x4a4a48, compressedBlocks.getBlock(i));
				} else {
					ColorProviderRegistryImpl.BLOCK.register(blockColor, compressedBlocks.getBlock(i));
					ColorProviderRegistryImpl.ITEM.register(itemColor, compressedBlocks.getBlock(i).asItem());
				}
			}
		}
	}
}