package me.xstopho.resourcecompression.init;

import me.xstopho.resourcecompression.ResourceCompression;
import me.xstopho.resourcecompression.custom.*;
import me.xstopho.resourcecompression.enums.CompressedBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class RCBlocks {

    public static HashMap<String, Block> BLOCKS = new HashMap<>();

    public static void init() {
        for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
            //ResourceCompression.LOGGER.info(compressedBlocks.getLangName());
            for (int i = 1; i <= 9; i++) {
                Block block = switch(compressedBlocks) {
                    case ACACIA_LOG, BIRCH_LOG, OAK_LOG, DARK_OAK_LOG, JUNGLE_LOG, SPRUCE_LOG, MANGROVE_LOG,
                            BONE_BLOCK, BASALT, CRIMSON_STEM, WARPED_STEM, CHERRY_LOG, BAMBOO_BLOCK, STRIPPED_BAMBOO_BLOCK,
                            STRIPPED_SPRUCE_LOG, STRIPPED_ACACIA_LOG, STRIPPED_ACACIA_WOOD, STRIPPED_BIRCH_LOG, STRIPPED_BIRCH_WOOD,
                            STRIPPED_CHERRY_LOG, STRIPPED_CHERRY_WOOD, STRIPPED_JUNGLE_LOG, STRIPPED_JUNGLE_WOOD, STRIPPED_MANGROVE_LOG,
                            STRIPPED_CRIMSON_HYPHAE, STRIPPED_CRIMSON_STEM, STRIPPED_DARK_OAK_LOG, STRIPPED_DARK_OAK_WOOD, STRIPPED_MANGROVE_WOOD,
                            STRIPPED_OAK_LOG, STRIPPED_OAK_WOOD, STRIPPED_SPRUCE_WOOD, STRIPPED_WARPED_HYPHAE, STRIPPED_WARPED_STEM
                            -> new CPillarBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case SAND, GRAVEL, RED_SAND
                            -> new CFallingBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case MAGMA_BLOCK
                            -> new CMagmaBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case REDSTONE_BLOCK
                            -> new CRedstoneBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case REDSTONE_ORE, DEEPSLATE_REDSTONE_ORE
                            -> new CRedstoneOreBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case ICE -> new IceBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()));

                    case WHITE_GLAZED_TERRACOTTA, ORANGE_GLAZED_TERRACOTTA, MAGENTA_GLAZED_TERRACOTTA, LIGHT_BLUE_GLAZED_TERRACOTTA,
                            YELLOW_GLAZED_TERRACOTTA, LIME_GLAZED_TERRACOTTA, PINK_GLAZED_TERRACOTTA, GRAY_GLAZED_TERRACOTTA, LIGHT_GRAY_GLAZED_TERRACOTTA,
                            CYAN_GLAZED_TERRACOTTA, PURPLE_GLAZED_TERRACOTTA, BLUE_GLAZED_TERRACOTTA, BROWN_GLAZED_TERRACOTTA, GREEN_GLAZED_TERRACOTTA,
                            RED_GLAZED_TERRACOTTA, BLACK_GLAZED_TERRACOTTA
                            -> new CGlazedTerracottaBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case ACACIA_LEAVES, BIRCH_LEAVES, OAK_LEAVES, DARK_OAK_LEAVES, AZALEA_LEAVES, CHERRY_LEAVES, SPRUCE_LEAVES,
                            JUNGLE_LEAVES, MANGROVE_LEAVES, FLOWERING_AZALEA_LEAVES
                            -> new CLeavesBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);

                    case GRASS_BLOCK
                            -> new GrassBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()));

                    default -> new CBlock(FabricBlockSettings.copyOf(compressedBlocks.getCopyBlock()), i);
                };
                registerBlock(compressedBlocks.getName(i), block);
            }
        }
    }

    private static void registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        BLOCKS.put(name, block);
        Registry.register(Registries.BLOCK, new Identifier(ResourceCompression.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(ResourceCompression.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
}
