package io.github.nugg20.cheesemod;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Namespace;

public class ModBlocks {

    // Namespace Utility Field
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    // creates static objects holding the block
    public static Block cheeseBlock;

    // registers the blocks
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        cheeseBlock = new TemplateBlock(NAMESPACE.id("cheeseBlock"), Material.CLAY)
                .setSoundGroup(Block.WOOL_SOUND_GROUP)
                .setTranslationKey(NAMESPACE, "cheeseBlock");
    }

}
