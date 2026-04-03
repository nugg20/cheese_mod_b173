package io.github.nugg20.cheesemod;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;
import net.modificationstation.stationapi.config.StationConfigData;


public final class Config {



    //sets the value and name of the config
    @ConfigRoot(
            value = "config",
            visibleName = "miscellaneous"
    )

    //creates a new config
    public static final CheeseConfigData CheeseConfigData = new CheeseConfigData();

    //creates a config class
    public static class CheeseConfigData extends StationConfigData {

        //creates a config entry
        @ConfigEntry(
                name = "Minecart Max Speed",
                comment = "Maximum horizontal speed of minecarts.\nVanilla is 0.4",
                description = "Maximum horizontal speed of minecarts. Vanilla is 0.4"
        )
        public Float minecartMaxSpeed = 0.4F;
    }

    @ConfigRoot(value ="food", visibleName = "food stuff")
    public static final FoodConfigData FoodConfigData = new FoodConfigData();

    public static class FoodConfigData extends StationConfigData {

        @ConfigEntry(name = "cheese stack size", description = "stack size of the item")
        public Integer cheeseStackSize = 16;

        @ConfigEntry(name = "cheese heal amount", description = "healing amount of the item. 2 points corresponds to 1 in-game heart")
        public Integer cheeseHealAmount = 4;

        @ConfigEntry(name = "Ultimate Sandwich stack size", description = "stack size of the item")
        public Integer UltimateSandwichStackSize = 1;

        @ConfigEntry(name = "Ultimate Sandwich amount", description = "healing amount of the item. 2 points corresponds to 1 in-game heart")
        public Integer UltimateSandwichHealAmount = 16;

        //@ConfigEntry(name = "hello", description = "hello")
        //public String hello = "hello";

        // debug stuff // static {System.out.println("CONFIG CLASS LOADED");}
    }
}
