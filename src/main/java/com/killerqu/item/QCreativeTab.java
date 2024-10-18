package com.killerqu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class QCreativeTab {
    public static final CreativeModeTab QCreativeTab = new CreativeModeTab("quanta") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.CAKE.getDefaultInstance();
        }
    };
}