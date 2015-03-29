package com.NotoriousPark.runes;

import com.NotoriousPark.runes.configuration.ConfigurationHandler;
import com.NotoriousPark.runes.proxy.IProxy;
import com.NotoriousPark.runes.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Runes {

    @Mod.Instance(Reference.MOD_ID)
    public static Runes instance;

    @SidedProxy(clientSide = "com.NotoriousPark.runes.proxy.ClientProxy", serverSide = "com.NotoriousPark.runes.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInitialization(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Initialization(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void PostInitialization(FMLPostInitializationEvent event) {

    }
}