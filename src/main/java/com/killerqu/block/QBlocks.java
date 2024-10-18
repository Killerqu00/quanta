package com.killerqu.block;

import com.killerqu.QConstants;
import com.killerqu.item.QCreativeTab;
import com.killerqu.item.QItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class QBlocks {
    public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, QConstants.MODID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCK_REGISTRY.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        QItems.ITEM_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(QCreativeTab.QCreativeTab)));
    }

    public static void register(IEventBus eventBus) {
        QBlocks.BLOCK_REGISTRY.register(eventBus);
    }
}
