package me.xstopho.resourcecompression.enums;

import me.xstopho.resourcecompression.init.RCBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum CompressedBlocks {

    STONE(Blocks.STONE, BlockTags.PICKAXE_MINEABLE),
    GRANITE(Blocks.GRANITE, BlockTags.PICKAXE_MINEABLE),
    POLISHED_GRANITE(Blocks.POLISHED_GRANITE, BlockTags.PICKAXE_MINEABLE),
    DIORITE(Blocks.DIORITE, BlockTags.PICKAXE_MINEABLE),
    POLISHED_DIORITE(Blocks.POLISHED_DIORITE, BlockTags.PICKAXE_MINEABLE),
    ANDESITE(Blocks.ANDESITE, BlockTags.PICKAXE_MINEABLE),
    POLISHED_ANDESITE(Blocks.POLISHED_ANDESITE, BlockTags.PICKAXE_MINEABLE),
    GRASS_BLOCK(Blocks.GRASS_BLOCK, BlockTags.SHOVEL_MINEABLE),
    DIRT(Blocks.DIRT, BlockTags.SHOVEL_MINEABLE),
    COARSE_DIRT(Blocks.COARSE_DIRT, BlockTags.SHOVEL_MINEABLE),
    PODZOL(Blocks.PODZOL, BlockTags.SHOVEL_MINEABLE),
    COBBLESTONE(Blocks.COBBLESTONE, BlockTags.PICKAXE_MINEABLE),
    OAK_PLANKS(Blocks.OAK_PLANKS, BlockTags.AXE_MINEABLE),
    SPRUCE_PLANKS(Blocks.SPRUCE_PLANKS, BlockTags.AXE_MINEABLE),
    BIRCH_PLANKS(Blocks.BIRCH_PLANKS, BlockTags.AXE_MINEABLE),
    JUNGLE_PLANKS(Blocks.JUNGLE_PLANKS, BlockTags.AXE_MINEABLE),
    ACACIA_PLANKS(Blocks.ACACIA_PLANKS, BlockTags.AXE_MINEABLE),
    CHERRY_PLANKS(Blocks.CHERRY_PLANKS, BlockTags.AXE_MINEABLE),
    DARK_OAK_PLANKS(Blocks.DARK_OAK_PLANKS, BlockTags.AXE_MINEABLE),
    MANGROVE_PLANKS(Blocks.MANGROVE_PLANKS, BlockTags.AXE_MINEABLE),
    BAMBOO_PLANKS(Blocks.BAMBOO_PLANKS, BlockTags.AXE_MINEABLE),
    BAMBOO_MOSAIC(Blocks.BAMBOO_MOSAIC, BlockTags.AXE_MINEABLE),
    SAND(Blocks.SAND, BlockTags.SHOVEL_MINEABLE),
    RED_SAND(Blocks.RED_SAND, BlockTags.SHOVEL_MINEABLE),
    GRAVEL(Blocks.GRAVEL, BlockTags.SHOVEL_MINEABLE),
    GOLD_ORE(Blocks.GOLD_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_GOLD_ORE(Blocks.DEEPSLATE_GOLD_ORE, BlockTags.PICKAXE_MINEABLE),
    IRON_ORE(Blocks.IRON_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_IRON_ORE(Blocks.DEEPSLATE_IRON_ORE, BlockTags.PICKAXE_MINEABLE),
    COAL_ORE(Blocks.COAL_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_COAL_ORE(Blocks.DEEPSLATE_COAL_ORE, BlockTags.PICKAXE_MINEABLE),
    NETHER_GOLD_ORE(Blocks.NETHER_GOLD_ORE, BlockTags.PICKAXE_MINEABLE),
    OAK_LOG(Blocks.OAK_LOG, BlockTags.AXE_MINEABLE),
    SPRUCE_LOG(Blocks.SPRUCE_LOG, BlockTags.AXE_MINEABLE),
    BIRCH_LOG(Blocks.BIRCH_LOG, BlockTags.AXE_MINEABLE),
    JUNGLE_LOG(Blocks.JUNGLE_LOG, BlockTags.AXE_MINEABLE),
    ACACIA_LOG(Blocks.ACACIA_LOG, BlockTags.AXE_MINEABLE),
    CHERRY_LOG(Blocks.CHERRY_LOG, BlockTags.AXE_MINEABLE),
    DARK_OAK_LOG(Blocks.DARK_OAK_LOG, BlockTags.AXE_MINEABLE),
    MANGROVE_LOG(Blocks.MANGROVE_LOG, BlockTags.AXE_MINEABLE),
    MANGROVE_ROOTS(Blocks.MANGROVE_ROOTS, BlockTags.AXE_MINEABLE),
    MUDDY_MANGROVE_ROOTS(Blocks.MUDDY_MANGROVE_ROOTS, BlockTags.SHOVEL_MINEABLE),
    BAMBOO_BLOCK(Blocks.BAMBOO_BLOCK, BlockTags.AXE_MINEABLE),
    STRIPPED_SPRUCE_LOG(Blocks.STRIPPED_SPRUCE_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_BIRCH_LOG(Blocks.STRIPPED_BIRCH_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_JUNGLE_LOG(Blocks.STRIPPED_JUNGLE_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_ACACIA_LOG(Blocks.STRIPPED_ACACIA_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_CHERRY_LOG(Blocks.STRIPPED_CHERRY_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_DARK_OAK_LOG(Blocks.STRIPPED_DARK_OAK_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_OAK_LOG(Blocks.STRIPPED_OAK_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_MANGROVE_LOG(Blocks.STRIPPED_MANGROVE_LOG, BlockTags.AXE_MINEABLE),
    STRIPPED_BAMBOO_BLOCK(Blocks.STRIPPED_BAMBOO_BLOCK, BlockTags.AXE_MINEABLE),
    OAK_WOOD(Blocks.OAK_WOOD, BlockTags.AXE_MINEABLE),
    SPRUCE_WOOD(Blocks.SPRUCE_WOOD, BlockTags.AXE_MINEABLE),
    BIRCH_WOOD(Blocks.BIRCH_WOOD, BlockTags.AXE_MINEABLE),
    JUNGLE_WOOD(Blocks.JUNGLE_WOOD, BlockTags.AXE_MINEABLE),
    ACACIA_WOOD(Blocks.ACACIA_WOOD, BlockTags.AXE_MINEABLE),
    CHERRY_WOOD(Blocks.CHERRY_WOOD, BlockTags.AXE_MINEABLE),
    DARK_OAK_WOOD(Blocks.DARK_OAK_WOOD, BlockTags.AXE_MINEABLE),
    MANGROVE_WOOD(Blocks.MANGROVE_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_OAK_WOOD(Blocks.STRIPPED_OAK_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_SPRUCE_WOOD(Blocks.STRIPPED_SPRUCE_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_BIRCH_WOOD(Blocks.STRIPPED_BIRCH_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_JUNGLE_WOOD(Blocks.STRIPPED_JUNGLE_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_ACACIA_WOOD(Blocks.STRIPPED_ACACIA_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_CHERRY_WOOD(Blocks.STRIPPED_CHERRY_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_DARK_OAK_WOOD(Blocks.STRIPPED_DARK_OAK_WOOD, BlockTags.AXE_MINEABLE),
    STRIPPED_MANGROVE_WOOD(Blocks.STRIPPED_MANGROVE_WOOD, BlockTags.AXE_MINEABLE),
    OAK_LEAVES(Blocks.OAK_LEAVES, BlockTags.HOE_MINEABLE),
    SPRUCE_LEAVES(Blocks.SPRUCE_LEAVES, BlockTags.HOE_MINEABLE),
    BIRCH_LEAVES(Blocks.BIRCH_LEAVES, BlockTags.HOE_MINEABLE),
    JUNGLE_LEAVES(Blocks.JUNGLE_LEAVES, BlockTags.HOE_MINEABLE),
    ACACIA_LEAVES(Blocks.ACACIA_LEAVES, BlockTags.HOE_MINEABLE),
    CHERRY_LEAVES(Blocks.CHERRY_LEAVES, BlockTags.HOE_MINEABLE),
    DARK_OAK_LEAVES(Blocks.DARK_OAK_LEAVES, BlockTags.HOE_MINEABLE),
    MANGROVE_LEAVES(Blocks.MANGROVE_LEAVES, BlockTags.HOE_MINEABLE),
    AZALEA_LEAVES(Blocks.AZALEA_LEAVES, BlockTags.HOE_MINEABLE),
    FLOWERING_AZALEA_LEAVES(Blocks.FLOWERING_AZALEA_LEAVES, BlockTags.HOE_MINEABLE),
    SPONGE(Blocks.SPONGE, BlockTags.HOE_MINEABLE),
    LAPIS_ORE(Blocks.LAPIS_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_LAPIS_ORE(Blocks.DEEPSLATE_LAPIS_ORE, BlockTags.PICKAXE_MINEABLE),
    LAPIS_BLOCK(Blocks.LAPIS_BLOCK, BlockTags.PICKAXE_MINEABLE),
    SANDSTONE(Blocks.SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    CHISELED_SANDSTONE(Blocks.CHISELED_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    CUT_SANDSTONE(Blocks.CUT_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    WHITE_WOOL(Blocks.WHITE_WOOL, BlockTags.WOOL),
    ORANGE_WOOL(Blocks.ORANGE_WOOL, BlockTags.WOOL),
    MAGENTA_WOOL(Blocks.MAGENTA_WOOL, BlockTags.WOOL),
    LIGHT_BLUE_WOOL(Blocks.LIGHT_BLUE_WOOL, BlockTags.WOOL),
    YELLOW_WOOL(Blocks.YELLOW_WOOL, BlockTags.WOOL),
    LIME_WOOL(Blocks.LIME_WOOL, BlockTags.WOOL),
    PINK_WOOL(Blocks.PINK_WOOL, BlockTags.WOOL),
    GRAY_WOOL(Blocks.GRAY_WOOL, BlockTags.WOOL),
    LIGHT_GRAY_WOOL(Blocks.LIGHT_GRAY_WOOL, BlockTags.WOOL),
    CYAN_WOOL(Blocks.CYAN_WOOL, BlockTags.WOOL),
    PURPLE_WOOL(Blocks.PURPLE_WOOL, BlockTags.WOOL),
    BLUE_WOOL(Blocks.BLUE_WOOL, BlockTags.WOOL),
    BROWN_WOOL(Blocks.BROWN_WOOL, BlockTags.WOOL),
    GREEN_WOOL(Blocks.GREEN_WOOL, BlockTags.WOOL),
    RED_WOOL(Blocks.RED_WOOL, BlockTags.WOOL),
    BLACK_WOOL(Blocks.BLACK_WOOL, BlockTags.WOOL),
    GOLD_BLOCK(Blocks.GOLD_BLOCK, BlockTags.PICKAXE_MINEABLE),
    IRON_BLOCK(Blocks.IRON_BLOCK, BlockTags.PICKAXE_MINEABLE),
    BRICKS(Blocks.BRICKS, BlockTags.PICKAXE_MINEABLE),
    MOSSY_COBBLESTONE(Blocks.MOSSY_COBBLESTONE, BlockTags.PICKAXE_MINEABLE),
    OBSIDIAN(Blocks.OBSIDIAN, BlockTags.PICKAXE_MINEABLE),
    DIAMOND_ORE(Blocks.DIAMOND_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_DIAMOND_ORE(Blocks.DEEPSLATE_DIAMOND_ORE, BlockTags.PICKAXE_MINEABLE),
    DIAMOND_BLOCK(Blocks.DIAMOND_BLOCK, BlockTags.PICKAXE_MINEABLE),
    REDSTONE_ORE(Blocks.REDSTONE_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_REDSTONE_ORE(Blocks.DEEPSLATE_REDSTONE_ORE, BlockTags.PICKAXE_MINEABLE),
    ICE(Blocks.ICE, BlockTags.PICKAXE_MINEABLE),
    SNOW_BLOCK(Blocks.SNOW_BLOCK, BlockTags.SHOVEL_MINEABLE),
    CLAY(Blocks.CLAY, BlockTags.SHOVEL_MINEABLE),
    NETHERRACK(Blocks.NETHERRACK, BlockTags.PICKAXE_MINEABLE),
    SOUL_SOIL(Blocks.SOUL_SOIL, BlockTags.SHOVEL_MINEABLE),
    BASALT(Blocks.BASALT, BlockTags.PICKAXE_MINEABLE),
    POLISHED_BASALT(Blocks.POLISHED_BASALT, BlockTags.PICKAXE_MINEABLE),
    CARVED_PUMPKIN(Blocks.CARVED_PUMPKIN, BlockTags.AXE_MINEABLE),
    STONE_BRICKS(Blocks.STONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    MOSSY_STONE_BRICKS(Blocks.MOSSY_STONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CRACKED_STONE_BRICKS(Blocks.CRACKED_STONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CHISELED_STONE_BRICKS(Blocks.CHISELED_STONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    PACKED_MUD(Blocks.PACKED_MUD, BlockTags.PICKAXE_MINEABLE),
    MUD_BRICKS(Blocks.MUD_BRICKS, BlockTags.PICKAXE_MINEABLE),
    BROWN_MUSHROOM_BLOCK(Blocks.BROWN_MUSHROOM_BLOCK, BlockTags.MUSHROOM_GROW_BLOCK),
    RED_MUSHROOM_BLOCK(Blocks.RED_MUSHROOM_BLOCK, BlockTags.MUSHROOM_GROW_BLOCK),
    MUSHROOM_STEM(Blocks.MUSHROOM_STEM, BlockTags.MUSHROOM_GROW_BLOCK),
    MELON(Blocks.MELON, BlockTags.AXE_MINEABLE),
    MYCELIUM(Blocks.MYCELIUM, BlockTags.SHOVEL_MINEABLE),
    NETHER_BRICKS(Blocks.NETHER_BRICKS, BlockTags.PICKAXE_MINEABLE),
    END_STONE(Blocks.END_STONE, BlockTags.PICKAXE_MINEABLE),
    EMERALD_ORE(Blocks.EMERALD_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_EMERALD_ORE(Blocks.DEEPSLATE_EMERALD_ORE, BlockTags.PICKAXE_MINEABLE),
    EMERALD_BLOCK(Blocks.EMERALD_BLOCK, BlockTags.PICKAXE_MINEABLE),
    REDSTONE_BLOCK(Blocks.REDSTONE_BLOCK, BlockTags.PICKAXE_MINEABLE),
    NETHER_QUARTZ_ORE(Blocks.NETHER_QUARTZ_ORE, BlockTags.PICKAXE_MINEABLE),
    QUARTZ_BLOCK(Blocks.QUARTZ_BLOCK, BlockTags.PICKAXE_MINEABLE),
    CHISELED_QUARTZ_BLOCK(Blocks.CHISELED_QUARTZ_BLOCK, BlockTags.PICKAXE_MINEABLE),
    QUARTZ_PILLAR(Blocks.QUARTZ_PILLAR, BlockTags.PICKAXE_MINEABLE),
    WHITE_TERRACOTTA(Blocks.WHITE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    ORANGE_TERRACOTTA(Blocks.ORANGE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    MAGENTA_TERRACOTTA(Blocks.MAGENTA_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIGHT_BLUE_TERRACOTTA(Blocks.LIGHT_BLUE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    YELLOW_TERRACOTTA(Blocks.YELLOW_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIME_TERRACOTTA(Blocks.LIME_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PINK_TERRACOTTA(Blocks.PINK_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    GRAY_TERRACOTTA(Blocks.GRAY_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIGHT_GRAY_TERRACOTTA(Blocks.LIGHT_GRAY_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    CYAN_TERRACOTTA(Blocks.CYAN_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PURPLE_TERRACOTTA(Blocks.PURPLE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BLUE_TERRACOTTA(Blocks.BLUE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BROWN_TERRACOTTA(Blocks.BROWN_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    GREEN_TERRACOTTA(Blocks.GREEN_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    RED_TERRACOTTA(Blocks.RED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BLACK_TERRACOTTA(Blocks.BLACK_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PRISMARINE(Blocks.PRISMARINE, BlockTags.PICKAXE_MINEABLE),
    PRISMARINE_BRICKS(Blocks.PRISMARINE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    DARK_PRISMARINE(Blocks.DARK_PRISMARINE, BlockTags.PICKAXE_MINEABLE),
    TERRACOTTA(Blocks.TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    COAL_BLOCK(Blocks.COAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    PACKED_ICE(Blocks.PACKED_ICE, BlockTags.PICKAXE_MINEABLE),
    RED_SANDSTONE(Blocks.RED_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    CHISELED_RED_SANDSTONE(Blocks.CHISELED_RED_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    CUT_RED_SANDSTONE(Blocks.CUT_RED_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    SMOOTH_STONE(Blocks.SMOOTH_STONE, BlockTags.PICKAXE_MINEABLE),
    SMOOTH_SANDSTONE(Blocks.SMOOTH_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    SMOOTH_QUARTZ(Blocks.SMOOTH_QUARTZ, BlockTags.PICKAXE_MINEABLE),
    SMOOTH_RED_SANDSTONE(Blocks.SMOOTH_RED_SANDSTONE, BlockTags.PICKAXE_MINEABLE),
    PURPUR_BLOCK(Blocks.PURPUR_BLOCK, BlockTags.PICKAXE_MINEABLE),
    PURPUR_PILLAR(Blocks.PURPUR_PILLAR, BlockTags.PICKAXE_MINEABLE),
    END_STONE_BRICKS(Blocks.END_STONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    MAGMA_BLOCK(Blocks.MAGMA_BLOCK, BlockTags.PICKAXE_MINEABLE),
    NETHER_WART_BLOCK(Blocks.NETHER_WART_BLOCK, BlockTags.HOE_MINEABLE),
    RED_NETHER_BRICKS(Blocks.RED_NETHER_BRICKS, BlockTags.PICKAXE_MINEABLE),
    BONE_BLOCK(Blocks.BONE_BLOCK, BlockTags.PICKAXE_MINEABLE),
    WHITE_GLAZED_TERRACOTTA(Blocks.WHITE_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    ORANGE_GLAZED_TERRACOTTA(Blocks.ORANGE_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    MAGENTA_GLAZED_TERRACOTTA(Blocks.MAGENTA_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIGHT_BLUE_GLAZED_TERRACOTTA(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    YELLOW_GLAZED_TERRACOTTA(Blocks.YELLOW_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIME_GLAZED_TERRACOTTA(Blocks.LIME_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PINK_GLAZED_TERRACOTTA(Blocks.PINK_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    GRAY_GLAZED_TERRACOTTA(Blocks.GRAY_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIGHT_GRAY_GLAZED_TERRACOTTA(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    CYAN_GLAZED_TERRACOTTA(Blocks.CYAN_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PURPLE_GLAZED_TERRACOTTA(Blocks.PURPLE_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BLUE_GLAZED_TERRACOTTA(Blocks.BLUE_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BROWN_GLAZED_TERRACOTTA(Blocks.BROWN_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    GREEN_GLAZED_TERRACOTTA(Blocks.GREEN_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    RED_GLAZED_TERRACOTTA(Blocks.RED_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BLACK_GLAZED_TERRACOTTA(Blocks.BLACK_GLAZED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    WHITE_CONCRETE(Blocks.WHITE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    ORANGE_CONCRETE(Blocks.ORANGE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    MAGENTA_CONCRETE(Blocks.MAGENTA_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    LIGHT_BLUE_CONCRETE(Blocks.LIGHT_BLUE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    YELLOW_CONCRETE(Blocks.YELLOW_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    LIME_CONCRETE(Blocks.LIME_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    PINK_CONCRETE(Blocks.PINK_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    GRAY_CONCRETE(Blocks.GRAY_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    LIGHT_GRAY_CONCRETE(Blocks.LIGHT_GRAY_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    CYAN_CONCRETE(Blocks.CYAN_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    PURPLE_CONCRETE(Blocks.PURPLE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    BLUE_CONCRETE(Blocks.BLUE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    BROWN_CONCRETE(Blocks.BROWN_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    GREEN_CONCRETE(Blocks.GREEN_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    RED_CONCRETE(Blocks.RED_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    BLACK_CONCRETE(Blocks.BLACK_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    WHITE_CONCRETE_POWDER(Blocks.WHITE_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    ORANGE_CONCRETE_POWDER(Blocks.ORANGE_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    MAGENTA_CONCRETE_POWDER(Blocks.MAGENTA_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    LIGHT_BLUE_CONCRETE_POWDER(Blocks.LIGHT_BLUE_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    YELLOW_CONCRETE_POWDER(Blocks.YELLOW_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    LIME_CONCRETE_POWDER(Blocks.LIME_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    PINK_CONCRETE_POWDER(Blocks.PINK_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    GRAY_CONCRETE_POWDER(Blocks.GRAY_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    LIGHT_GRAY_CONCRETE_POWDER(Blocks.LIGHT_GRAY_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    CYAN_CONCRETE_POWDER(Blocks.CYAN_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    PURPLE_CONCRETE_POWDER(Blocks.PURPLE_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    BLUE_CONCRETE_POWDER(Blocks.BLUE_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    BROWN_CONCRETE_POWDER(Blocks.BROWN_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    GREEN_CONCRETE_POWDER(Blocks.GREEN_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    RED_CONCRETE_POWDER(Blocks.RED_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    BLACK_CONCRETE_POWDER(Blocks.BLACK_CONCRETE_POWDER, BlockTags.SHOVEL_MINEABLE),
    DRIED_KELP_BLOCK(Blocks.DRIED_KELP_BLOCK, BlockTags.HOE_MINEABLE),
    DEAD_TUBE_CORAL_BLOCK(Blocks.DEAD_TUBE_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    DEAD_BRAIN_CORAL_BLOCK(Blocks.DEAD_BRAIN_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    DEAD_BUBBLE_CORAL_BLOCK(Blocks.DEAD_BUBBLE_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    DEAD_FIRE_CORAL_BLOCK(Blocks.DEAD_FIRE_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    DEAD_HORN_CORAL_BLOCK(Blocks.DEAD_HORN_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    TUBE_CORAL_BLOCK(Blocks.TUBE_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    BRAIN_CORAL_BLOCK(Blocks.BRAIN_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    BUBBLE_CORAL_BLOCK(Blocks.BUBBLE_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    FIRE_CORAL_BLOCK(Blocks.FIRE_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    HORN_CORAL_BLOCK(Blocks.HORN_CORAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    BLUE_ICE(Blocks.BLUE_ICE, BlockTags.PICKAXE_MINEABLE),
    WARPED_STEM(Blocks.WARPED_STEM, BlockTags.AXE_MINEABLE),
    STRIPPED_WARPED_STEM(Blocks.STRIPPED_WARPED_STEM, BlockTags.AXE_MINEABLE),
    WARPED_HYPHAE(Blocks.WARPED_HYPHAE, BlockTags.AXE_MINEABLE),
    STRIPPED_WARPED_HYPHAE(Blocks.STRIPPED_WARPED_HYPHAE, BlockTags.AXE_MINEABLE),
    WARPED_NYLIUM(Blocks.WARPED_NYLIUM, BlockTags.PICKAXE_MINEABLE),
    WARPED_WART_BLOCK(Blocks.WARPED_WART_BLOCK, BlockTags.HOE_MINEABLE),
    CRIMSON_STEM(Blocks.CRIMSON_STEM, BlockTags.AXE_MINEABLE),
    STRIPPED_CRIMSON_STEM(Blocks.STRIPPED_CRIMSON_STEM, BlockTags.AXE_MINEABLE),
    CRIMSON_HYPHAE(Blocks.CRIMSON_HYPHAE, BlockTags.AXE_MINEABLE),
    STRIPPED_CRIMSON_HYPHAE(Blocks.STRIPPED_CRIMSON_HYPHAE, BlockTags.AXE_MINEABLE),
    CRIMSON_NYLIUM(Blocks.CRIMSON_NYLIUM, BlockTags.PICKAXE_MINEABLE),
    SHROOMLIGHT(Blocks.SHROOMLIGHT, BlockTags.HOE_MINEABLE),
    CRIMSON_PLANKS(Blocks.CRIMSON_PLANKS, BlockTags.AXE_MINEABLE),
    WARPED_PLANKS(Blocks.WARPED_PLANKS, BlockTags.AXE_MINEABLE),
    NETHERITE_BLOCK(Blocks.NETHERITE_BLOCK, BlockTags.PICKAXE_MINEABLE),
    ANCIENT_DEBRIS(Blocks.ANCIENT_DEBRIS, BlockTags.PICKAXE_MINEABLE),
    CRYING_OBSIDIAN(Blocks.CRYING_OBSIDIAN, BlockTags.PICKAXE_MINEABLE),
    BLACKSTONE(Blocks.BLACKSTONE, BlockTags.PICKAXE_MINEABLE),
    POLISHED_BLACKSTONE(Blocks.POLISHED_BLACKSTONE, BlockTags.PICKAXE_MINEABLE),
    POLISHED_BLACKSTONE_BRICKS(Blocks.POLISHED_BLACKSTONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CRACKED_POLISHED_BLACKSTONE_BRICKS(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CHISELED_POLISHED_BLACKSTONE(Blocks.CHISELED_POLISHED_BLACKSTONE, BlockTags.PICKAXE_MINEABLE),
    GILDED_BLACKSTONE(Blocks.GILDED_BLACKSTONE, BlockTags.PICKAXE_MINEABLE),
    CHISELED_NETHER_BRICKS(Blocks.CHISELED_NETHER_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CRACKED_NETHER_BRICKS(Blocks.CRACKED_NETHER_BRICKS, BlockTags.PICKAXE_MINEABLE),
    QUARTZ_BRICKS(Blocks.QUARTZ_BRICKS, BlockTags.PICKAXE_MINEABLE),
    AMETHYST_BLOCK(Blocks.AMETHYST_BLOCK, BlockTags.PICKAXE_MINEABLE),
    BUDDING_AMETHYST(Blocks.BUDDING_AMETHYST, BlockTags.PICKAXE_MINEABLE),
    TUFF(Blocks.TUFF, BlockTags.PICKAXE_MINEABLE),
    CALCITE(Blocks.CALCITE, BlockTags.PICKAXE_MINEABLE),
    OXIDIZED_COPPER(Blocks.OXIDIZED_COPPER, BlockTags.PICKAXE_MINEABLE),
    WEATHERED_COPPER(Blocks.WEATHERED_COPPER, BlockTags.PICKAXE_MINEABLE),
    EXPOSED_COPPER(Blocks.EXPOSED_COPPER, BlockTags.PICKAXE_MINEABLE),
    COPPER_BLOCK(Blocks.COPPER_BLOCK, BlockTags.PICKAXE_MINEABLE),
    COPPER_ORE(Blocks.COPPER_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_COPPER_ORE(Blocks.DEEPSLATE_COPPER_ORE, BlockTags.PICKAXE_MINEABLE),
    OXIDIZED_CUT_COPPER(Blocks.OXIDIZED_CUT_COPPER, BlockTags.PICKAXE_MINEABLE),
    WEATHERED_CUT_COPPER(Blocks.WEATHERED_CUT_COPPER, BlockTags.PICKAXE_MINEABLE),
    EXPOSED_CUT_COPPER(Blocks.EXPOSED_CUT_COPPER, BlockTags.PICKAXE_MINEABLE),
    CUT_COPPER(Blocks.CUT_COPPER, BlockTags.PICKAXE_MINEABLE),
    DRIPSTONE_BLOCK(Blocks.DRIPSTONE_BLOCK, BlockTags.PICKAXE_MINEABLE),
    MOSS_BLOCK(Blocks.MOSS_BLOCK, BlockTags.HOE_MINEABLE),
    ROOTED_DIRT(Blocks.ROOTED_DIRT, BlockTags.SHOVEL_MINEABLE),
    DEEPSLATE(Blocks.DEEPSLATE, BlockTags.PICKAXE_MINEABLE),
    COBBLED_DEEPSLATE(Blocks.COBBLED_DEEPSLATE, BlockTags.PICKAXE_MINEABLE),
    POLISHED_DEEPSLATE(Blocks.POLISHED_DEEPSLATE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_TILES(Blocks.DEEPSLATE_TILES, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_BRICKS(Blocks.DEEPSLATE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CHISELED_DEEPSLATE(Blocks.CHISELED_DEEPSLATE, BlockTags.PICKAXE_MINEABLE),
    CRACKED_DEEPSLATE_BRICKS(Blocks.CRACKED_DEEPSLATE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    CRACKED_DEEPSLATE_TILES(Blocks.CRACKED_DEEPSLATE_TILES, BlockTags.PICKAXE_MINEABLE),
    SMOOTH_BASALT(Blocks.SMOOTH_BASALT, BlockTags.PICKAXE_MINEABLE),
    RAW_IRON_BLOCK(Blocks.RAW_IRON_BLOCK, BlockTags.PICKAXE_MINEABLE),
    RAW_COPPER_BLOCK(Blocks.RAW_COPPER_BLOCK, BlockTags.PICKAXE_MINEABLE),
    RAW_GOLD_BLOCK(Blocks.RAW_GOLD_BLOCK, BlockTags.PICKAXE_MINEABLE);


    private final Block block;
    private final TagKey<Block> tagKey;

    CompressedBlocks(Block block, TagKey<Block> tagKey) {
        this.block = block;
        this.tagKey = tagKey;
    }

    public Block getCopyBlock() {
        return block;
    }

    public TagKey<Block> getTagKey() {
        return tagKey;
    }

    public Block getBlock(int level)  {
        return RCBlocks.BLOCKS.get(getName(level));
    }

    public String getLangName() {
        String[] parts = this.toString().toLowerCase().split("_");
        StringBuilder builder = new StringBuilder();
        for (String part : parts) {
            builder.append(part.substring(0,1).toUpperCase()).append(part.substring(1).toLowerCase()).append(" ");
        }
        return builder.toString().substring(0, builder.toString().length() -1);
    }

    public String getName(int level) {
        return this.toString().toLowerCase() + "_compressed_" + level;
    }
}
