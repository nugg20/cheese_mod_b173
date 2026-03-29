package io.github.nugg20.cheesemod;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;
import net.modificationstation.stationapi.config.StationConfigData;


public final class Config {
    @ConfigRoot(
            value = "config",
            visibleName = "Cheese Mod Configs"
    )
    public static final CheeseConfigData stationConfigData = new CheeseConfigData();

    public static class CheeseConfigData extends StationConfigData {

        @ConfigEntry(
                name = "Minecart Max Speed",
                comment = "Maximum horizontal speed of minecarts"
        )
        public Float minecartMaxSpeed = 0.4F;


        static {
            System.out.println("CONFIG CLASS LOADED");
        }
    }
}
