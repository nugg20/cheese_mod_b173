package io.github.nugg20.cheesemod;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.item.TemplateFoodItem;
import net.modificationstation.stationapi.api.util.Namespace;


public class ModItems{

    // Namespace Utility Field
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    // creates static objects holding the block
    public static Item cheese;
    public static Item ultimateSandwich;

    // registers the items
    //NOTE: HEAL AMOUNT 2 = 1 heart restored
    @EventListener
    public void registerItems(ItemRegistryEvent event) {

        cheese = new TemplateFoodItem(NAMESPACE.id("cheese"), 4, false)
                .setTranslationKey(NAMESPACE, "cheese");

        ultimateSandwich = new TemplateFoodItem(NAMESPACE.id("ultimateSandwich"), 16, false)
                .setTranslationKey(NAMESPACE, "ultimateSandwich");


    }
}