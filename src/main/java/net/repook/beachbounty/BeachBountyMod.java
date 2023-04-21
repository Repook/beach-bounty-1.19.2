package net.repook.beachbounty;

import net.fabricmc.api.ModInitializer;
import net.repook.beachbounty.item.ModItems;
import net.repook.beachbounty.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BeachBountyMod implements ModInitializer {

	public static final String MOD_ID = "beachbounty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.initializeSounds();
	}
}