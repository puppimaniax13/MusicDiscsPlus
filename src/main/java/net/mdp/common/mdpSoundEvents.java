package net.mdp.common;

import net.mdp.MusicDiscsPlus;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class mdpSoundEvents {

    //NCS
    public static final SoundEvent ABOUT_YOU = register("about_you");
    public static final SoundEvent BLUE_EYED_DEMON = register("blue_eyed_demon");
    public static final SoundEvent CASTLE = register("castle");
    public static final SoundEvent COOL = register("cool");
    public static final SoundEvent FIND_YOU = register("find_you");
    public static final SoundEvent GRAVITY = register("gravity");
    public static final SoundEvent HOWLING = register("howling");
    public static final SoundEvent ISLAND = register("island");
    public static final SoundEvent LIGHT_IT_UP = register("light_it_up");
    public static final SoundEvent LIVE_A_LIE = register("live_a_lie");
    public static final SoundEvent LOVE_ME = register("love_me");
    public static final SoundEvent MAS_Y_MAS = register("mas_y_mas");
    public static final SoundEvent PARADISE = register("paradise");
    public static final SoundEvent SAY_GOODBYE = register("say_goodbye");
    public static final SoundEvent SUN_GOES_DOWN = register("sun_goes_down");
    public static final SoundEvent SUPERHERO = register("superhero");
    public static final SoundEvent WE_STARTED = register("we_started");
    public static final SoundEvent WHY_DO_I = register("why_do_i");

    //Monstercat
    public static final SoundEvent CHASING_CLOUDS = register("chasing_clouds");
    public static final SoundEvent ROCK_IT = register("rock_it");
    //LoFi
    public static final SoundEvent MIDNIGHT = register("midnight");



    private static SoundEvent register(String name) {
        Identifier id = new Identifier(MusicDiscsPlus.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}