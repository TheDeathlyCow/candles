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

    private static final CandleBlock CANDLE_TEMPLATE = new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME);

    public static final Block BEESWAX_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "beeswax_candle");

    // coloured candles
    public static final Block WHITE_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "white_candle");
    public static final Block ORANGE_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "orange_candle");
    public static final Block MAGENTA_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "magenta_candle");
    public static final Block LIGHT_BLUE_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "light_blue_candle");
    public static final Block YELLOW_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "yellow_candle");
    public static final Block LIME_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "lime_candle");
    public static final Block PINK_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "pink_candle");
    public static final Block GRAY_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "gray_candle");
    public static final Block LIGHT_GRAY_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "light_gray_candle");
    public static final Block CYAN_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "cyan_candle");
    public static final Block PURPLE_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "purple_candle");
    public static final Block BLUE_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "blue_candle");
    public static final Block BROWN_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "brown_candle");
    public static final Block GREEN_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "green_candle");
    public static final Block RED_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "red_candle");
    public static final Block BLACK_CANDLE = Setup.setup(new CandleBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.ADOBE).func_235838_a_((property) -> {
        return 3 + 3 * property.get(CandleBlock.CANDLES);
    }).zeroHardnessAndResistance().sound(SoundType.field_235602_z_),  ParticleTypes.FLAME), "black_candle");

    public static final Block[] BLOCKS = {
            BEESWAX_CANDLE,
            WHITE_CANDLE,
            ORANGE_CANDLE,
            MAGENTA_CANDLE,
            LIGHT_BLUE_CANDLE,
            YELLOW_CANDLE,
            LIME_CANDLE,
            PINK_CANDLE,
            GRAY_CANDLE,
            LIGHT_GRAY_CANDLE,
            CYAN_CANDLE,
            PURPLE_CANDLE,
            BLUE_CANDLE,
            BROWN_CANDLE,
            GREEN_CANDLE,
            RED_CANDLE,
            BLACK_CANDLE
    };
}

