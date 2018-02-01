package com.pckuijper.buildwithbricks;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = BuildWithBricks.MODID,
    name = BuildWithBricks.NAME,
    version = BuildWithBricks.VERSION
)
public class BuildWithBricks
{
    public static final String MODID = "buildwithbricks";
    public static final String NAME = "Build with Bricks";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //
    }
}
