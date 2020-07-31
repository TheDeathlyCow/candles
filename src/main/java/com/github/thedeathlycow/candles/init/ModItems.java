package com.github.thedeathlycow.candles.init;

import com.github.thedeathlycow.candles.Main;
import com.github.thedeathlycow.candles.blocks.BeeswaxCandle;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MODID)
public class ModItems {

    public static final Item BEESWAX_CANDLE = new BlockNamedItem(ModBlocks.BEESWAX_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.BEESWAX_CANDLE.getRegistryName());

    public static final Item[] ITEMS = {
            BEESWAX_CANDLE
    };

}
