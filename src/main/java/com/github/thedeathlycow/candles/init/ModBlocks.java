package com.github.thedeathlycow.candles.init;

import com.github.thedeathlycow.candles.Main;
import com.github.thedeathlycow.candles.blocks.BeeswaxCandle;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MODID)
public class ModBlocks {

    // func_235838_a_ gives off light!

    public static final Block BEESWAX_CANDLE = Setup.setup(new BeeswaxCandle(Block.Properties.create(Material.MISCELLANEOUS).func_235838_a_((property) -> {
        return 3 + 3 * property.get(BeeswaxCandle.CANDLES);
    }).zeroHardnessAndResistance(), ParticleTypes.FLAME), "beeswax_candle");

    public static final Block[] BLOCKS = {
            BEESWAX_CANDLE
    };


}

