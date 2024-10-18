package com.killerqu.item;

import com.killerqu.QConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class QItems {
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QConstants.MODID);

    public static final RegistryObject<Item> RAW_ENRICHED_IRON = ITEM_REGISTRY.register("raw_enriched_iron", () -> new Item(new Item.Properties().tab(QCreativeTab.QCreativeTab)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEM_REGISTRY.register("steel_ingot", () -> new Item(new Item.Properties().tab(QCreativeTab.QCreativeTab)));

    public static void register(IEventBus eventBus) {
        QItems.ITEM_REGISTRY.register(eventBus);
    }
}
