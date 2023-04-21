package net.repook.beachbounty.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.repook.beachbounty.BeachBountyMod;

public class ModSounds {

        public static SoundEvent TOOT_CONCH = registerSound("toot_conch");

        static SoundEvent registerSound (String id){
                SoundEvent sound = new SoundEvent(new Identifier(BeachBountyMod.MOD_ID,id));
                return Registry.register(Registry.SOUND_EVENT, new Identifier(BeachBountyMod.MOD_ID,id),sound);
        }
        public static void initializeSounds() {
                BeachBountyMod.LOGGER.info("Registering " + BeachBountyMod.MOD_ID + " Sounds");
        }}

//public static final SoundEvent TOOT_CONCH = registerSoundEvent("toot_conch");

//private static SoundEvent registerSoundEvent(String name) {
//Identifier id = new Identifier(BeachBountyMod.MOD_ID, name);
//Registry.register(Registry.SOUND_EVENT, id, soundEvent);
//return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));


