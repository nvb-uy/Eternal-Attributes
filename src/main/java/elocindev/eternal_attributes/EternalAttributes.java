package elocindev.eternal_attributes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import elocindev.eternal_attributes.config.Configs;
import elocindev.eternal_attributes.registry.SpellSchoolRegistry;
import elocindev.eternal_attributes.registry.StatusEffectRegistry;
import elocindev.necronomicon.api.NecUtilsAPI;
//? if fabric {
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
//?}

//? if forge {
/*import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
*///?}


//? if neoforge {
/*import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
*///?}


//? if forge || neoforge {
/*@Mod(EternalAttributes.MODID)
*///?}
public class EternalAttributes
//? if fabric {
implements ModInitializer, ClientModInitializer
//?}
{
    public static final String MODNAME = "Eternal Attributes";
    public static final String MODID = "eternal_attributes";
    public static final Logger LOGGER = LogManager.getLogger(MODNAME);

    public EternalAttributes(
        //? if neoforge {
        /*IEventBus modEventBus, ModContainer modContainer
        *///?}
        ) {
        //? if forge {
        /*var context = FMLJavaModLoadingContext.get();
        var modEventBus = context.getModEventBus();
        *///?}

        //? if forge || neoforge {
        /*modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        *///?}

        if (NecUtilsAPI.isModLoaded("spell_power")) {
            StatusEffectRegistry.register();
            SpellSchoolRegistry.register();
        }
    }

    //? if fabric {
    @Override
    //?}
    public void onInitialize() {
        Configs.loadCommonConfigs();
    }

    //? if fabric {
    @Override
     //?}
    public void onInitializeClient() {
        Configs.loadClientConfigs();
    }
    
    //? if forge || neoforge {
    /*public void commonSetup(FMLCommonSetupEvent event) { onInitialize(); }
    public void clientSetup(FMLClientSetupEvent event) { onInitializeClient(); }
    *///?}
}
