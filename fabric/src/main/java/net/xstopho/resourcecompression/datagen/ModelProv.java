package net.xstopho.resourcecompression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.xstopho.resourcecompression.Constants;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.registries.BlockRegistry;

import java.util.Optional;

public class ModelProv extends FabricModelProvider {

    private BlockModelGenerators generator;

    public ModelProv(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        this.generator = generator;

        for (CompressedBlocks block : CompressedBlocks.values()) {
            for (int i = 1; i <= Constants.COMPRESSION; i++) {
                switch (block) {
                    case OAK_LOG, ACACIA_LOG, BIRCH_LOG, DARK_OAK_LOG, JUNGLE_LOG,
                            MANGROVE_LOG, SPRUCE_LOG, CHERRY_LOG, STRIPPED_OAK_LOG,
                            STRIPPED_ACACIA_LOG, STRIPPED_BIRCH_LOG, STRIPPED_DARK_OAK_LOG,
                            STRIPPED_JUNGLE_LOG, STRIPPED_MANGROVE_LOG, STRIPPED_SPRUCE_LOG,
                            STRIPPED_CHERRY_LOG, WARPED_STEM, STRIPPED_WARPED_STEM, CRIMSON_STEM,
                            STRIPPED_CRIMSON_STEM
                            -> createLog(block, i);

                    case OAK_WOOD, ACACIA_WOOD, BIRCH_WOOD, DARK_OAK_WOOD, JUNGLE_WOOD, MANGROVE_WOOD,
                            SPRUCE_WOOD, CHERRY_WOOD, STRIPPED_OAK_WOOD, STRIPPED_ACACIA_WOOD, STRIPPED_BIRCH_WOOD,
                            STRIPPED_DARK_OAK_WOOD, STRIPPED_JUNGLE_WOOD, STRIPPED_MANGROVE_WOOD, STRIPPED_SPRUCE_WOOD,
                            STRIPPED_CHERRY_WOOD, WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE, CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE
                            -> createWood(block, i);

                    case BASALT, BONE_BLOCK, HAY_BLOCK
                            -> createAxisRotated(block, i);

                    case OAK_LEAVES, ACACIA_LEAVES, BIRCH_LEAVES, DARK_OAK_LEAVES,
                            JUNGLE_LEAVES, MANGROVE_LEAVES, SPRUCE_LEAVES, CHERRY_LEAVES
                            -> createLeaves(block, i);

                    case MELON, PUMPKIN, DRIED_KELP_BLOCK, POLISHED_BASALT, ANCIENT_DEBRIS
                            -> crateColumn(block, i);

                    case GRASS_BLOCK, MYCELIUM, PODZOL, WARPED_NYLIUM, CRIMSON_NYLIUM
                            -> createGrass(block, i);

                    case MANGROVE_ROOTS, MUDDY_MANGROVE_ROOTS -> createRoots(block, i);

                    case CARVED_PUMPKIN -> createOrientable(block, i);

                    default -> createSimpleCube(block, i);
                }
            }
        }
    }

    public void createSimpleCube(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.cube(block.getCopyBlock());
        map.put(TextureSlot.LAYER0, getLayer0(level));
        Optional<ResourceLocation> parent = Optional.of(getParent("simple_cube"));

        switch(block) {
            case MAGMA_BLOCK -> map.put(TextureSlot.ALL, getVanilla("magma"));
            case SNOW_BLOCK -> map.put(TextureSlot.ALL, getVanilla("snow"));
            case QUARTZ_BLOCK -> map.put(TextureSlot.ALL, getVanilla("quartz_block_side"));
            case HONEY_BLOCK -> map.put(TextureSlot.ALL, getVanilla("honey_block_bottom"));
            case SMOOTH_SANDSTONE -> map.put(TextureSlot.ALL, getVanilla("sandstone_top"));
            case SMOOTH_QUARTZ -> map.put(TextureSlot.ALL, getVanilla("quartz_block_bottom"));
            case SMOOTH_RED_SANDSTONE -> map.put(TextureSlot.ALL, getVanilla("red_sandstone_top"));
        }

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(), TextureSlot.ALL, TextureSlot.LAYER0)
                .create(getResource(block.getName(level)), map, generator.modelOutput);

        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }

    private void createRoots(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.cubeTop(block.getCopyBlock());
        map.put(TextureSlot.LAYER0, getLayer0(level));
        Optional<ResourceLocation> parent = Optional.of(getParent("roots"));

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(), TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.TOP)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }

    private void createGrass(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.cubeBottomTop(block.getCopyBlock());
        Optional<ResourceLocation> parent = Optional.of(getParent("grass"));
        map.put(TextureSlot.LAYER0, getLayer0(level));
        map.put(TextureSlot.BOTTOM, getVanilla("dirt"));

        switch(block) {
            case GRASS_BLOCK -> map.put(TextureSlot.EDGE, getVanilla("grass_block_side_overlay"));
            case PODZOL, MYCELIUM -> map.put(TextureSlot.EDGE, map.get(TextureSlot.SIDE));
            case CRIMSON_NYLIUM, WARPED_NYLIUM -> {
                map.put(TextureSlot.BOTTOM, getVanilla("netherrack"));
                map.put(TextureSlot.TOP, getVanilla(block.toString().toLowerCase()));
                map.put(TextureSlot.EDGE, map.get(TextureSlot.SIDE));
            }
        }

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(),
                TextureSlot.LAYER0, TextureSlot.EDGE, TextureSlot.SIDE, TextureSlot.TOP, TextureSlot.BOTTOM)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }


    private void crateColumn(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.column(block.getCopyBlock());
        Optional<ResourceLocation> parent = Optional.of(getParent("pillar_vertical"));
        map.put(TextureSlot.LAYER0, getLayer0(level));

        switch (block) {
            case DRIED_KELP_BLOCK -> {
                map.put(TextureSlot.END, getVanilla("dried_kelp_top"));
                map.put(TextureSlot.SIDE, getVanilla("dried_kelp_side"));
            }
        }

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(),
                TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.END)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }

    private void createLog(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.column(block.getCopyBlock());
        Optional<ResourceLocation> parentVertical = Optional.of(getParent("pillar_vertical"));
        Optional<ResourceLocation> parentHorizontal = Optional.of(getParent("pillar_horizontal"));
        map.put(TextureSlot.LAYER0, getLayer0(level));
        map.put(TextureSlot.SIDE, getVanilla(block.toString().toLowerCase()));

        ResourceLocation modelVertical = new ModelTemplate(parentVertical, Optional.empty(), TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.END)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        ResourceLocation modelHorizontal = new ModelTemplate(parentHorizontal, Optional.of("_horizontal"), TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.END)
                .create(getResource(block.getName(level) + "_horizontal"), map, generator.modelOutput);

        generator.blockStateOutput.accept(BlockModelGenerators.createRotatedPillarWithHorizontalVariant(block.getBlock(BlockRegistry.BLOCKS, level),
                modelVertical, modelHorizontal));
    }

    private void createWood(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.column(block.getCopyBlock());
        Optional<ResourceLocation> parent = Optional.of(getParent("pillar_vertical"));
        map.put(TextureSlot.LAYER0, getLayer0(level));

        String name = block.toString().toLowerCase();

        switch (block) {
            case WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE, CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE -> {
                String id = name.substring(0, name.length() - 6);
                map.put(TextureSlot.SIDE, getVanilla(id + "stem"));
                map.put(TextureSlot.END, getVanilla(id + "stem"));
            }
            default -> {
                String id = name.substring(0, name.length() - 4);
                map.put(TextureSlot.SIDE, getVanilla(id + "log"));
                map.put(TextureSlot.END, getVanilla(id + "log"));
            }
        }

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(),
                TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.END)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }

    private void createAxisRotated(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.column(block.getCopyBlock());
        Optional<ResourceLocation> parentVertical = Optional.of(getParent("pillar_vertical"));
        Optional<ResourceLocation> parentHorizontal = Optional.of(getParent("pillar_horizontal"));
        map.put(TextureSlot.LAYER0, getLayer0(level));
        map.put(TextureSlot.SIDE, map.get(TextureSlot.SIDE));

        ResourceLocation modelVertical = new ModelTemplate(parentVertical, Optional.empty(), TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.END)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        ResourceLocation modelHorizontal = new ModelTemplate(parentHorizontal, Optional.of("_horizontal"), TextureSlot.LAYER0, TextureSlot.SIDE, TextureSlot.END)
                .create(getResource(block.getName(level) + "_horizontal"), map, generator.modelOutput);

        generator.blockStateOutput.accept(BlockModelGenerators.createRotatedPillarWithHorizontalVariant(block.getBlock(BlockRegistry.BLOCKS, level),
                modelVertical, modelHorizontal));
    }

    private void createLeaves(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.cube(block.getCopyBlock());
        Optional<ResourceLocation> parent = Optional.of(getParent("leaves"));
        map.put(TextureSlot.LAYER0, getLayer0(level));

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(), TextureSlot.ALL, TextureSlot.LAYER0)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }

    private void createOrientable(CompressedBlocks block, int level) {
        TextureMapping map = TextureMapping.orientableCube(block.getCopyBlock());
        Optional<ResourceLocation> parent = Optional.of(getParent("orientable"));
        map.put(TextureSlot.LAYER0, getLayer0(level));

        switch (block) {
            case CARVED_PUMPKIN -> {
                String name = block.toString().toLowerCase();
                String id = name.substring(7, name.length());
                map.put(TextureSlot.FRONT, getVanilla("carved_pumpkin"));
                map.put(TextureSlot.SIDE, getVanilla(id + "_side"));
                map.put(TextureSlot.TOP, getVanilla(id + "_top"));
            }
        }

        ResourceLocation model = new ModelTemplate(parent, Optional.empty(), TextureSlot.FRONT, TextureSlot.SIDE, TextureSlot.TOP, TextureSlot.LAYER0)
                .create(getResource(block.getName(level)), map, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.getBlock(BlockRegistry.BLOCKS, level), model));
    }

    private ResourceLocation getParent(String id) {
        return new ResourceLocation(Constants.MOD_ID, "block/parents/" + id);
    }

    private ResourceLocation getLayer0(int level) {
        return new ResourceLocation(Constants.MOD_ID, "block/level_" + level);
    }

    private ResourceLocation getResource(String id) {
        return new ResourceLocation(Constants.MOD_ID, "block/" + id);
    }

    private ResourceLocation getVanilla(String id) {
        return new ResourceLocation("minecraft", "block/" + id);
    }
}
