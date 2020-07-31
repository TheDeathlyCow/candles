package com.github.thedeathlycow.candles.init;

import com.github.thedeathlycow.candles.blocks.BeeswaxCandle;
import com.github.thedeathlycow.candles.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MODID)
public class ModBlocks {

    public static final Block BEESWAX_CANDLE = Setup.setup(new BeeswaxCandle(Block.Properties.create(Material.FIRE)), "beeswax_candle");


    public static final Block[] BLOCKS = {
            BEESWAX_CANDLE
    };
}
