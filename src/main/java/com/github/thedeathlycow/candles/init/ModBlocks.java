package com.github.thedeathlycow.candles.init;

import com.github.thedeathlycow.candles.Main;
import com.github.thedeathlycow.candles.blocks.CandleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MODID)
public class ModBlocks {

    // func_235838_a_ gives off light!

    public static final Block BEESWAX_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_), ParticleTypes.FLAME), "beeswax_candle");

    public static final Block[] BLOCKS = {
            BEESWAX_CANDLE
    };
}

