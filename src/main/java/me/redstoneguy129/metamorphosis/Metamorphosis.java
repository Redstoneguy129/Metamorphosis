package me.redstoneguy129.metamorphosis;

import me.redstoneguy129.metamorphosis.common.item.SyringeItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Metamorphosis.MOD_ID)
public class Metamorphosis {
    public static final String MOD_ID = "metamorphosis";

    public Metamorphosis() {
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        ITEMS.register("syringe", SyringeItem::new);
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
