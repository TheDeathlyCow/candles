package com.github.thedeathlycow.candles;

import com.github.thedeathlycow.candles.init.ModBlocks;
import com.github.thedeathlycow.candles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS);
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS);
    }   

    @SubscribeEvent
    public static void FMLClientSetupEvent(final FMLClientSetupEvent event) {
        if (FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(ModBlocks.BEESWAX_CANDLE, RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_CANDLE, RenderType.getCutout());
        }
    }

//    @SubscribeEvent
//    public static void FMLLoadCompleteEvent(FMLLoadCompleteEvent event) {
//        Biomes.SWAMP.addFeature(
//                GenerationStage.Decoration.VEGETAL_DECORATION,
//                ModFeatures.RICE_PLANT.withConfiguration(new NoFeatureConfig()).withPlacement(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(100.0f, 60, 0, 65)))
//        );
//    }

}
