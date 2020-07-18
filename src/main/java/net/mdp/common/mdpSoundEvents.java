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
    public static final SoundEvent AGAINST_THE_SUN = register("against_the_sun");
    public static final SoundEvent ALONE = register("alone");
    public static final SoundEvent ATLANTIC = register("atlantic");
    public static final SoundEvent BELIEVE_HER = register("believe_her");
    public static final SoundEvent BREAKDOWN_VIP = register("breakdown_vip");
    public static final SoundEvent CANVAS = register("canvas");
    public static final SoundEvent CHAMPIONS = register("champions");
    public static final SoundEvent DISCONNECTED = register("disconnected");
    public static final SoundEvent EVERCHANGING = register("everchanging");
    public static final SoundEvent FRAME_OF_MIND = register("frame_of_mind");
    public static final SoundEvent FTW = register("ftw");
    public static final SoundEvent HERE_WITH_YOU_NOW = register("here_with_you_now");
    public static final SoundEvent HERO = register("hero");
    public static final SoundEvent INTERSTELLAR = register("interstellar");
    public static final SoundEvent NEW_GAME = register("new_game");
    public static final SoundEvent ONCE_AGAIN = register("once_again");
    public static final SoundEvent ONE_LOOK = register("one_look");
    public static final SoundEvent ORBIT = register("orbit");
    public static final SoundEvent RAINBOW_ROAD = register("rainbow_road");
    public static final SoundEvent SAVAGE = register("savage");
    public static final SoundEvent SCRIBBLE = register("scribble");
    public static final SoundEvent SKYBREAKER = register("skybreaker");
    public static final SoundEvent SNOWBLIND = register("snowblind");
    public static final SoundEvent SURFACE = register("surface");
    public static final SoundEvent THE_MUNSTA = register("the_munsta");
    public static final SoundEvent THIS_IS_FOREVER = register("this_is_forever");
    public static final SoundEvent VALKYRIE = register("valkyrie");

    //Throwbacks
    public static final SoundEvent AM_I_WRONG = register("am_i_wrong");
    public static final SoundEvent BOOM_CLAP = register("boom_clap");
    public static final SoundEvent CAKE_BY_THE_OCEAN = register("cake_by_the_ocean");
    public static final SoundEvent CLOCKS = register("clocks");
    public static final SoundEvent FIRE_BURNING = register("fire_burning");
    public static final SoundEvent GDFR = register("gdfr");
    public static final SoundEvent GRENADE = register("grenade");
    public static final SoundEvent HAPPY = register("happy");
    public static final SoundEvent HIGH_HOPES = register("high_hopes");
    public static final SoundEvent I_KNEW_YOU_WERE_TROUBLE = register("i_knew_you_were_trouble");
    public static final SoundEvent LET_HER_GO = register("let_her_go");
    public static final SoundEvent LIKE_A_G6 = register("like_a_g6");
    public static final SoundEvent LIVE_YOUR_LIFE = register("live_your_life");
    public static final SoundEvent LOCKED_OUT_OF_HEAVEN = register("locked_out_of_heaven");
    public static final SoundEvent LOVE_ME_AGAIN = register("love_me_again");
    public static final SoundEvent MAGIC = register("magic");
    public static final SoundEvent MAPS = register("maps");
    public static final SoundEvent REPLAY = register("replay");
    public static final SoundEvent RIGHT_ROUND = register("right_round");
    public static final SoundEvent SCREAM_AND_SHOUT = register("scream_and_shout");
    public static final SoundEvent SEXY_AND_I_KNOW_IT = register("sexy_and_i_know_it");
    public static final SoundEvent STOLEN_DANCE = register("stolen_dance");
    public static final SoundEvent THE_SHOW_GOES_ON = register("the_show_goes_on");
    public static final SoundEvent TOOTHBRUSH = register("toothbrush");
    public static final SoundEvent WAKA_WAKA = register("waka_waka");
    public static final SoundEvent WHERE_ARE_YOU_NOW = register("where_are_you_now");
    public static final SoundEvent WHERE_THEM_GIRLS_AT = register("where_them_girls_at");

    //Pop
    public static final SoundEvent BLUEBERRY_FAYGO = register("blueberry_faygo");

    //Requests
    public static final SoundEvent NEVER_GONNA_GIVE_YOU_UP = register("never_gonna_give_you_up");


    private static SoundEvent register(String name) {
        Identifier id = new Identifier(MusicDiscsPlus.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}