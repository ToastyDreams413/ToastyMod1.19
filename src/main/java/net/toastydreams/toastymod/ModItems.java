package net.toastydreams.toastymod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.toastydreams.ToastyMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ToastyMod.MOD_ID);

    public static final RegistryObject<Item> RANDO = ITEMS.register("rando",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_RANDO = ITEMS.register("raw_rando",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
