package com.magnus_shmagnus.items;

import com.magnus_shmagnus.MagnusMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS
            = DeferredRegister.createItems(MagnusMod.MODID);

    public static final DeferredItem<Item> cube_of_meat = ITEMS.register("cube_of_meat",
            () -> new Item(new Item.Properties().fireResistant()));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
