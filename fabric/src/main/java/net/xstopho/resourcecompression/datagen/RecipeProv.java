package net.xstopho.resourcecompression.datagen;

import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.xstopho.resourcecompression.Constants;
import net.xstopho.resourcecompression.block.CompressedBlocks;
import net.xstopho.resourcecompression.registries.BlockRegistry;
import net.xstopho.resourcecompression.registries.OldBlockRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class RecipeProv extends FabricRecipeProvider {

    private static Consumer<FinishedRecipe> exporter;

    public RecipeProv(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        RecipeProv.exporter = exporter;

        for (CompressedBlocks block : CompressedBlocks.values()) {
            for (int i = 1; i < Constants.COMPRESSION; i++) {

                compress(block.getBlock(BlockRegistry.BLOCKS, i), block.getBlock(BlockRegistry.BLOCKS, i+1));
                decompress(block.getBlock(BlockRegistry.BLOCKS, i+1), block.getBlock(BlockRegistry.BLOCKS, i));
                convert(block.getOldBlock(OldBlockRegistry.BLOCKS, i), block.getBlock(BlockRegistry.BLOCKS, i));
            }
        }
    }


    private static void compress(ItemLike input, ItemLike output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 1)
                .pattern("III").pattern("III").pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(exporter, new ResourceLocation("compress/" + getSimpleRecipeName(input)));
    }

    private static void decompress(ItemLike input, ItemLike output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
                .requires(input).unlockedBy(getHasName(input),has(input))
                .save(exporter, new ResourceLocation("decompress/" + getSimpleRecipeName(output)));
    }

    private static void convert(ItemLike input, ItemLike output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 1)
                .requires(input).unlockedBy(getHasName(input), has(input))
                .save(exporter, new ResourceLocation("convert/" + getSimpleRecipeName(output)));
    }
}
