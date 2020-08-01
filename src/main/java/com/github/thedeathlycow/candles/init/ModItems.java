package com.github.thedeathlycow.candles.init;

import com.github.thedeathlycow.candles.Main;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MODID)
public class ModItems {

    public static final Item BEESWAX_CANDLE = new BlockNamedItem(ModBlocks.BEESWAX_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.BEESWAX_CANDLE.getRegistryName());
    public static final Item BEESWAX = Setup.setup(new Item(new Item.Properties().group(ItemGroup.MISC)), "beeswax");

    public static final Item[] ITEMS = {
            BEESWAX_CANDLE,
            BEESWAX
    };

}
