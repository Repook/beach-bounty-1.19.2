package net.repook.beachbounty.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.repook.beachbounty.BeachBountyMod;
import net.repook.beachbounty.item.custom.ConchShellItem;

public class ModItems {

    public static final Item CONCH_SHELL = registerItem("conch_shell",
            new ConchShellItem(new FabricItemSettings().group(ItemGroup.MISC)));




private static Item registerItem(String name,Item item){
    return Registry.register(Registry.ITEM,new Identifier(BeachBountyMod.MOD_ID,name),item);
}
    public static void registerModItems(){
        BeachBountyMod.LOGGER.debug("Registering Mod Items for "+ BeachBountyMod.MOD_ID);
    }
}
