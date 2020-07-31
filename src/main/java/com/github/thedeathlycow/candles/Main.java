package com.github.thedeathlycow.candles;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "candles";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Main() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        LOGGER.debug("HELLO from CANDLES");
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup method registered.");
    }

}
