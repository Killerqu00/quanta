package com.killerqu.item;

import com.killerqu.QConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class QItems {
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QConstants.MODID);

    //public static final RegistryObject<Item> ZIRCON = ITEM_REGISTRY.register("zircon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        QItems.ITEM_REGISTRY.register(eventBus);
    }
}
