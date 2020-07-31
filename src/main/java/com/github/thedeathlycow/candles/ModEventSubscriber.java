package com.github.thedeathlycow.candles;

import com.github.thedeathlycow.candles.init.ModBlocks;
import com.github.thedeathlycow.candles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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

//    @SubscribeEvent
//    public static void FMLClientSetupEvent(final FMLClientSetupEvent event) {
//        if (FMLEnvironment.dist == Dist.CLIENT) {
//            RenderTypeLookup.setRenderLayer(ModBlocks.RICE_PLANT, RenderType.getCutout());
//            RenderTypeLookup.setRenderLayer(ModBlocks.RICE_PLANT_TOP, RenderType.getCutout());
//            RenderTypeLookup.setRenderLayer(ModBlocks.WILD_RICE_BASE, RenderType.getCutout());
//            RenderTypeLookup.setRenderLayer(ModBlocks.WILD_RICE_TOP, RenderType.getCutout());
//        }
//    }
//
//    @SubscribeEvent
//    public static void FMLLoadCompleteEvent(FMLLoadCompleteEvent event) {
//        Biomes.SWAMP.addFeature(
//                GenerationStage.Decoration.VEGETAL_DECORATION,
//                ModFeatures.RICE_PLANT.withConfiguration(new NoFeatureConfig()).withPlacement(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(100.0f, 60, 0, 65)))
//        );
//    }

}
