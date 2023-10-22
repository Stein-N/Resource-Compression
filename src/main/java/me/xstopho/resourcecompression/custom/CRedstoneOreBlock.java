package me.xstopho.resourcecompression.custom;

import net.minecraft.block.RedstoneBlock;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CRedstoneOreBlock extends RedstoneOreBlock {

    private final int level;

    public CRedstoneOreBlock(Settings settings, int level) {
        super(settings);
        this.level = level;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.literal("§6Compression Level: " + level));

        super.appendTooltip(stack, world, tooltip, options);
    }
}
