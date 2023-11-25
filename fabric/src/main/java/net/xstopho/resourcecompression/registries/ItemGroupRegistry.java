package net.xstopho.resourcecompression.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.xstopho.resourcecompression.Constants;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.config.ConstantConfig;

public class ItemGroupRegistry {

    public static final CreativeModeTab RESOURCE_COMPRESSION = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, "item_group"),
            FabricItemGroup.builder().title(Component.translatable("item_group.resourcecompression.title")).icon(() -> new ItemStack(Blocks.STONE))
                    .displayItems((itemDisplayParameters, output) -> {

                        for (CompressedBlocks blocks : CompressedBlocks.values()) {
                            for (int i = 1; i <= ConstantConfig.COMPRESSION_LEVEL.get(); i++) {
                                output.accept(blocks.getBlock(BlockRegistry.BLOCKS, i));
                            }
                        }

                    }).build());

    public static void init() {

    }
}
