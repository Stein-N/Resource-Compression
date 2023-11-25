package net.xstopho.resourcecompression.registries;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.xstopho.resourcecompression.Constants;
import net.xstopho.resourcecompression.block.*;
import net.xstopho.resourcecompression.config.ConstantConfig;

import java.util.HashMap;

public class BlockRegistry {
    public static final HashMap<String, Block> BLOCKS = new HashMap<>();

    private static void register(String id, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, id), new BlockItem(block, new Item.Properties()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, id), block);
        BLOCKS.put(id, block);
    }

    public static void init() {
        for (CompressedBlocks blocks : CompressedBlocks.values()) {
            for (int i = 1; i <= ConstantConfig.COMPRESSION_LEVEL.get(); i++) {

                if (blocks.getCopyBlock() instanceof FallingBlock) register(blocks.getName(i), new ConFallingBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof GlazedTerracottaBlock) register(blocks.getName(i), new ConGlazedTerracottaBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof IceBlock) register(blocks.getName(i), new ConIceBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof LeavesBlock) register(blocks.getName(i), new ConLeavesBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof MagmaBlock) register(blocks.getName(i), new ConMagmaBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof RotatedPillarBlock) register(blocks.getName(i), new ConPillarBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof PoweredBlock) register(blocks.getName(i), new ConRedstoneBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof RedStoneOreBlock) register(blocks.getName(i), new ConRedstoneOreBlock(blocks.getCopyBlock(), i));

                if (!BLOCKS.containsKey(blocks.getName(i))) {
                    register(blocks.getName(i), new ConBlock(blocks.getCopyBlock(), i));
                }
            }
        }
    }
}
