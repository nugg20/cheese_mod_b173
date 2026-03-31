package io.github.nugg20.cheesemod;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;
import net.modificationstation.stationapi.config.StationConfigData;


public final class Config {

    //sets the value and name of the config
    @ConfigRoot(
            value = "config",
            visibleName = "Cheese Mod Configs"
    )

    //creates a new config
    public static final CheeseConfigData stationConfigData = new CheeseConfigData();

    //creates a config class
    public static class CheeseConfigData extends StationConfigData {

        //creates a config entry
        @ConfigEntry(
                name = "Minecart Max Speed",
                comment = "Maximum horizontal speed of minecarts"
        )
        public Float minecartMaxSpeed = 0.4F;

        // debug stuff // static {System.out.println("CONFIG CLASS LOADED");}
    }
}
