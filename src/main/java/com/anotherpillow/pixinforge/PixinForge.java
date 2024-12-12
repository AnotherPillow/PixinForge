package com.anotherpillow.pixinforge;

import com.google.common.collect.Lists;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import java.io.File;
import java.util.HashMap;
import java.util.List;

@Mod(
        modid = PixinForge.MODID,
        useMetadata = true,
        clientSideOnly = true
)
public class PixinForge {

    public static final String MODID = "pixinforge";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("PixinForge loaded");
    }

}
