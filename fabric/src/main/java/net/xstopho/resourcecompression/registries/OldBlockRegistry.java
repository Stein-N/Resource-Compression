package net.xstopho.resourcecompression.registries;

import net.minecraft.client.telemetry.events.WorldLoadEvent;
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

public class OldBlockRegistry {
    public static final HashMap<String, Block> BLOCKS = new HashMap<>();

    private static void register(String id, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("resource-compression", id), new BlockItem(block, new Item.Properties()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation("resource-compression", id), block);
        BLOCKS.put(id, block);
    }

    public static void init() {
        for (CompressedBlocks blocks : CompressedBlocks.values()) {
            for (int i = 1; i <= ConstantConfig.COMPRESSION_LEVEL.get(); i++) {

                if (blocks.getCopyBlock() instanceof FallingBlock) register(blocks.getOldName(i), new ConFallingBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof GlazedTerracottaBlock) register(blocks.getOldName(i), new ConGlazedTerracottaBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof IceBlock) register(blocks.getOldName(i), new ConIceBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof LeavesBlock) register(blocks.getOldName(i), new ConLeavesBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof MagmaBlock) register(blocks.getOldName(i), new ConMagmaBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof RotatedPillarBlock) register(blocks.getOldName(i), new ConPillarBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof PoweredBlock) register(blocks.getOldName(i), new ConRedstoneBlock(blocks.getCopyBlock(), i));
                if (blocks.getCopyBlock() instanceof RedStoneOreBlock) register(blocks.getOldName(i), new ConRedstoneOreBlock(blocks.getCopyBlock(), i));

                if (!BLOCKS.containsKey(blocks.getOldName(i))) {
                    register(blocks.getOldName(i), new ConBlock(blocks.getCopyBlock(), i));
                }
            }
        }
    }
}
