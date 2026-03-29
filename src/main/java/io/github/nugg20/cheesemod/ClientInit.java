package io.github.nugg20.cheesemod;

import net.fabricmc.api.ClientModInitializer;
import net.glasslauncher.mods.gcapi3.api.GCAPI;

public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Client init running");

        Config.stationConfigData.toString();
    }

}