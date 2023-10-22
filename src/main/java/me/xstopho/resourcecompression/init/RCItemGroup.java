package me.xstopho.resourcecompression.init;

import me.xstopho.resourcecompression.ResourceCompression;
import me.xstopho.resourcecompression.enums.CompressedBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RCItemGroup {

    public static final ItemGroup RESOURCE_COMPRESSION_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ResourceCompression.MOD_ID, "item_group"),
            FabricItemGroup.builder().displayName(Text.literal("Resource Compression"))
                    .icon(() -> new ItemStack(RCBlocks.BLOCKS.get("diamond_block_compressed_5"))).entries((displayContext, entries) -> {

                        for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
                            for (int i = 1; i <= 9; i++) {
                                entries.add(compressedBlocks.getBlock(i));
                            }
                        }

                    }).build());

    public static void init() {

    }
}
