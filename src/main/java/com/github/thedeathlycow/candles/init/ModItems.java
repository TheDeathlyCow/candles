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

    public static final Item WHITE_CANDLE = new BlockNamedItem(ModBlocks.WHITE_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.WHITE_CANDLE.getRegistryName());
    public static final Item ORANGE_CANDLE = new BlockNamedItem(ModBlocks.ORANGE_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.ORANGE_CANDLE.getRegistryName());
    public static final Item MAGENTA_CANDLE = new BlockNamedItem(ModBlocks.MAGENTA_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.MAGENTA_CANDLE.getRegistryName());
    public static final Item LIGHT_BLUE_CANDLE = new BlockNamedItem(ModBlocks.LIGHT_BLUE_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.LIGHT_BLUE_CANDLE.getRegistryName());
    public static final Item YELLOW_CANDLE = new BlockNamedItem(ModBlocks.YELLOW_CANDLE, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(ModBlocks.YELLOW_CANDLE.getRegistryName());


    public static final Item[] ITEMS = {
            BEESWAX_CANDLE,
            BEESWAX,
            WHITE_CANDLE,
            ORANGE_CANDLE,
            MAGENTA_CANDLE,
            LIGHT_BLUE_CANDLE,
            YELLOW_CANDLE
    };


}
