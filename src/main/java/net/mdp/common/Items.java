package net.mdp.common;

import net.mdp.MusicDiscsPlus;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Items {
    //Settings
    private static final Item.Settings NCS_SETTINGS = new Item.Settings().maxCount(1).group(MusicDiscsPlus.NCS).rarity(Rarity.RARE).maxCount(1);
    private static final Item.Settings MONSTERCAT_SETTINGS = new Item.Settings().maxCount(1).group(MusicDiscsPlus.MONSTERCAT).rarity(Rarity.RARE).maxCount(1);
    private static final Item.Settings THROWBACKS_SETTINGS = new Item.Settings().maxCount(1).group(MusicDiscsPlus.THROWBACKS).rarity(Rarity.RARE).maxCount(1);
    private static final Item.Settings TIKTOK_SETTINGS = new Item.Settings().maxCount(1).group(MusicDiscsPlus.TIKTOK).rarity(Rarity.RARE).maxCount(1);
    private static final Item.Settings REQUESTS_SETTINGS = new Item.Settings().maxCount(1).group(MusicDiscsPlus.REQUESTS).rarity(Rarity.RARE).maxCount(1);

    //NCS
    public static final Item ABOUT_ME = register("ncs.about_me", new mdpDisc(14, mdpSoundEvents.ABOUT_ME, NCS_SETTINGS));
    public static final Item ABOUT_YOU = register("ncs.about_you", new mdpDisc(14, mdpSoundEvents.ABOUT_YOU, NCS_SETTINGS));
    public static final Item BLUE_EYED_DEMON = register("ncs.blue_eyed_demon", new mdpDisc(14, mdpSoundEvents.BLUE_EYED_DEMON, NCS_SETTINGS));
    public static final Item CASTLE = register("ncs.castle", new mdpDisc(14, mdpSoundEvents.CASTLE, NCS_SETTINGS));
    public static final Item COOL = register("ncs.cool", new mdpDisc(14, mdpSoundEvents.COOL, NCS_SETTINGS));
    public static final Item CRADLES = register("ncs.cradles", new mdpDisc(14, mdpSoundEvents.CRADLES, NCS_SETTINGS));
    public static final Item DEMONS = register("ncs.demons", new mdpDisc(14, mdpSoundEvents.DEMONS, NCS_SETTINGS));
    public static final Item FEARLESS = register("ncs.fearless", new mdpDisc(14, mdpSoundEvents.FEARLESS, NCS_SETTINGS));
    public static final Item FEARLESS_PT2 = register("ncs.fearless_pt2", new mdpDisc(14, mdpSoundEvents.FEARLESS_PT2, NCS_SETTINGS));
    public static final Item FEEL_GOOD = register("ncs.feel_good", new mdpDisc(14, mdpSoundEvents.FEEL_GOOD, NCS_SETTINGS));
    public static final Item FIND_YOU = register("ncs.find_you", new mdpDisc(14, mdpSoundEvents.FIND_YOU, NCS_SETTINGS));
    public static final Item GRAVITY = register("ncs.gravity", new mdpDisc(14, mdpSoundEvents.GRAVITY, NCS_SETTINGS));
    public static final Item HEART_AFIRE = register("ncs.heart_afire", new mdpDisc(14, mdpSoundEvents.HEART_AFIRE, NCS_SETTINGS));
    public static final Item HOWLING = register("ncs.howling", new mdpDisc(14, mdpSoundEvents.HOWLING, NCS_SETTINGS));
    public static final Item ISLAND = register("ncs.island", new mdpDisc(14, mdpSoundEvents.ISLAND, NCS_SETTINGS));
    public static final Item LIGHT_IT_UP = register("ncs.light_it_up", new mdpDisc(14, mdpSoundEvents.LIGHT_IT_UP, NCS_SETTINGS));
    public static final Item LIVE_A_LIE = register("ncs.live_a_lie", new mdpDisc(14, mdpSoundEvents.LIVE_A_LIE, NCS_SETTINGS));
    public static final Item LOVE_ME = register("ncs.love_me", new mdpDisc(14, mdpSoundEvents.LOVE_ME, NCS_SETTINGS));
    public static final Item MAS_Y_MAS = register("ncs.mas_y_mas", new mdpDisc(14, mdpSoundEvents.MAS_Y_MAS, NCS_SETTINGS));
    public static final Item ON_AND_ON = register("ncs.on_and_on", new mdpDisc(14, mdpSoundEvents.ON_AND_ON, NCS_SETTINGS));
    public static final Item PARADISE = register("ncs.paradise", new mdpDisc(14, mdpSoundEvents.PARADISE, NCS_SETTINGS));
    public static final Item SAY_GOODBYE = register("ncs.say_goodbye", new mdpDisc(14, mdpSoundEvents.SAY_GOODBYE, NCS_SETTINGS));
    public static final Item SUN_GOES_DOWN = register("ncs.sun_goes_down", new mdpDisc(14, mdpSoundEvents.SUN_GOES_DOWN, NCS_SETTINGS));
    public static final Item SUPERHERO = register("ncs.superhero", new mdpDisc(14, mdpSoundEvents.SUPERHERO, NCS_SETTINGS));
    public static final Item WALK_AWAY = register("ncs.walk_away", new mdpDisc(14, mdpSoundEvents.WALK_AWAY, NCS_SETTINGS));
    public static final Item WE_STARTED = register("ncs.we_started", new mdpDisc(14, mdpSoundEvents.WE_STARTED, NCS_SETTINGS));
    public static final Item WHY_DO_I = register("ncs.why_do_i", new mdpDisc(14, mdpSoundEvents.WHY_DO_I, NCS_SETTINGS));

    //Monstercat
    public static final Item AGAINST_THE_SUN = register("monstercat.against_the_sun", new mdpDisc(15, mdpSoundEvents.AGAINST_THE_SUN, MONSTERCAT_SETTINGS));
    public static final Item ALONE = register("monstercat.alone", new mdpDisc(15, mdpSoundEvents.ALONE, MONSTERCAT_SETTINGS));
    public static final Item ATLANTIC = register("monstercat.atlantic", new mdpDisc(15, mdpSoundEvents.ATLANTIC, MONSTERCAT_SETTINGS));
    public static final Item BELIEVE_HER = register("monstercat.believe_her", new mdpDisc(15, mdpSoundEvents.BELIEVE_HER, MONSTERCAT_SETTINGS));
    public static final Item BREAKDOWN_VIP = register("monstercat.breakdown_vip", new mdpDisc(15, mdpSoundEvents.BREAKDOWN_VIP, MONSTERCAT_SETTINGS));
    public static final Item CANVAS = register("monstercat.canvas", new mdpDisc(15, mdpSoundEvents.CANVAS, MONSTERCAT_SETTINGS));
    public static final Item CHAMPIONS = register("monstercat.champions", new mdpDisc(15, mdpSoundEvents.CHAMPIONS, MONSTERCAT_SETTINGS));
    public static final Item DISCONNECTED = register("monstercat.disconnected", new mdpDisc(15, mdpSoundEvents.DISCONNECTED, MONSTERCAT_SETTINGS));
    public static final Item EVERCHANGING = register("monstercat.everchanging", new mdpDisc(15, mdpSoundEvents.EVERCHANGING, MONSTERCAT_SETTINGS));
    public static final Item FRAME_OF_MIND = register("monstercat.frame_of_mind", new mdpDisc(15, mdpSoundEvents.FRAME_OF_MIND, MONSTERCAT_SETTINGS));
    public static final Item FTW = register("monstercat.ftw", new mdpDisc(15, mdpSoundEvents.FTW, MONSTERCAT_SETTINGS));
    public static final Item HERE_WITH_YOU_NOW = register("monstercat.here_with_you_now", new mdpDisc(15, mdpSoundEvents.HERE_WITH_YOU_NOW, MONSTERCAT_SETTINGS));
    public static final Item HERO = register("monstercat.hero", new mdpDisc(15, mdpSoundEvents.HERO, MONSTERCAT_SETTINGS));
    public static final Item INTERSTELLAR = register("monstercat.interstellar", new mdpDisc(15, mdpSoundEvents.INTERSTELLAR, MONSTERCAT_SETTINGS));
    public static final Item NEW_GAME = register("monstercat.new_game", new mdpDisc(15, mdpSoundEvents.NEW_GAME, MONSTERCAT_SETTINGS));
    public static final Item ONCE_AGAIN = register("monstercat.once_again", new mdpDisc(15, mdpSoundEvents.ONCE_AGAIN, MONSTERCAT_SETTINGS));
    public static final Item ONE_LOOK = register("monstercat.one_look", new mdpDisc(15, mdpSoundEvents.ONE_LOOK, MONSTERCAT_SETTINGS));
    public static final Item ORBIT = register("monstercat.orbit", new mdpDisc(15, mdpSoundEvents.ORBIT, MONSTERCAT_SETTINGS));
    public static final Item RAINBOW_ROAD = register("monstercat.rainbow_road", new mdpDisc(15, mdpSoundEvents.RAINBOW_ROAD, MONSTERCAT_SETTINGS));
    public static final Item SAVAGE = register("monstercat.savage", new mdpDisc(15, mdpSoundEvents.SAVAGE, MONSTERCAT_SETTINGS));
    public static final Item SCRIBBLE = register("monstercat.scribble", new mdpDisc(15, mdpSoundEvents.SCRIBBLE, MONSTERCAT_SETTINGS));
    public static final Item SKYBREAKER = register("monstercat.skybreaker", new mdpDisc(15, mdpSoundEvents.SKYBREAKER, MONSTERCAT_SETTINGS));
    public static final Item SNOWBLIND = register("monstercat.snowblind", new mdpDisc(15, mdpSoundEvents.SNOWBLIND, MONSTERCAT_SETTINGS));
    public static final Item SURFACE = register("monstercat.surface", new mdpDisc(15, mdpSoundEvents.SURFACE, MONSTERCAT_SETTINGS));
    public static final Item THE_MUNSTA = register("monstercat.the_munsta", new mdpDisc(15, mdpSoundEvents.THE_MUNSTA, MONSTERCAT_SETTINGS));
    public static final Item THIS_IS_FOREVER = register("monstercat.this_is_forever", new mdpDisc(15, mdpSoundEvents.THIS_IS_FOREVER, MONSTERCAT_SETTINGS));
    public static final Item VALKYRIE = register("monstercat.valkyrie", new mdpDisc(15, mdpSoundEvents.VALKYRIE, MONSTERCAT_SETTINGS));

    //Throwbacks
    public static final Item AM_I_WRONG = register("throwbacks.am_i_wrong", new mdpDisc(1, mdpSoundEvents.AM_I_WRONG, THROWBACKS_SETTINGS));
    public static final Item BOOM_CLAP = register("throwbacks.boom_clap", new mdpDisc(1, mdpSoundEvents.BOOM_CLAP, THROWBACKS_SETTINGS));
    public static final Item CAKE_BY_THE_OCEAN = register("throwbacks.cake_by_the_ocean", new mdpDisc(1, mdpSoundEvents.CAKE_BY_THE_OCEAN, THROWBACKS_SETTINGS));
    public static final Item CLOCKS = register("throwbacks.clocks", new mdpDisc(1, mdpSoundEvents.CLOCKS, THROWBACKS_SETTINGS));
    public static final Item FIRE_BURNING = register("throwbacks.fire_burning", new mdpDisc(1, mdpSoundEvents.FIRE_BURNING, THROWBACKS_SETTINGS));
    public static final Item GDFR = register("throwbacks.gdfr", new mdpDisc(1, mdpSoundEvents.GDFR, THROWBACKS_SETTINGS));
    public static final Item GRENADE = register("throwbacks.grenade", new mdpDisc(1, mdpSoundEvents.GRENADE, THROWBACKS_SETTINGS));
    public static final Item HAPPY = register("throwbacks.happy", new mdpDisc(1, mdpSoundEvents.HAPPY, THROWBACKS_SETTINGS));
    public static final Item HIGH_HOPES = register("throwbacks.high_hopes", new mdpDisc(1, mdpSoundEvents.HIGH_HOPES, THROWBACKS_SETTINGS));
    public static final Item I_KNEW_YOU_WERE_TROUBLE = register("throwbacks.i_knew_you_were_trouble", new mdpDisc(1, mdpSoundEvents.I_KNEW_YOU_WERE_TROUBLE, THROWBACKS_SETTINGS));
    public static final Item LET_HER_GO = register("throwbacks.let_her_go", new mdpDisc(1, mdpSoundEvents.LET_HER_GO, THROWBACKS_SETTINGS));
    public static final Item LIKE_A_G6 = register("throwbacks.like_a_g6", new mdpDisc(1, mdpSoundEvents.LIKE_A_G6, THROWBACKS_SETTINGS));
    public static final Item LIVE_YOUR_LIFE = register("throwbacks.live_your_life", new mdpDisc(1, mdpSoundEvents.LIVE_YOUR_LIFE, THROWBACKS_SETTINGS));
    public static final Item LOCKED_OUT_OF_HEAVEN = register("throwbacks.locked_out_of_heaven", new mdpDisc(1, mdpSoundEvents.LOCKED_OUT_OF_HEAVEN, THROWBACKS_SETTINGS));
    public static final Item LOVE_ME_AGAIN = register("throwbacks.love_me_again", new mdpDisc(1, mdpSoundEvents.LOVE_ME_AGAIN, THROWBACKS_SETTINGS));
    public static final Item MAGIC = register("throwbacks.magic", new mdpDisc(1, mdpSoundEvents.MAGIC, THROWBACKS_SETTINGS));
    public static final Item MAPS = register("throwbacks.maps", new mdpDisc(1, mdpSoundEvents.MAPS, THROWBACKS_SETTINGS));
    public static final Item REPLAY = register("throwbacks.replay", new mdpDisc(1, mdpSoundEvents.REPLAY, THROWBACKS_SETTINGS));
    public static final Item RIGHT_ROUND = register("throwbacks.right_round", new mdpDisc(1, mdpSoundEvents.RIGHT_ROUND, THROWBACKS_SETTINGS));
    public static final Item SCREAM_AND_SHOUT = register("throwbacks.scream_and_shout", new mdpDisc(1, mdpSoundEvents.SCREAM_AND_SHOUT, THROWBACKS_SETTINGS));
    public static final Item SEXY_AND_I_KNOW_IT = register("throwbacks.sexy_and_i_know_it", new mdpDisc(1, mdpSoundEvents.SEXY_AND_I_KNOW_IT, THROWBACKS_SETTINGS));
    public static final Item STOLEN_DANCE = register("throwbacks.stolen_dance", new mdpDisc(1, mdpSoundEvents.STOLEN_DANCE, THROWBACKS_SETTINGS));
    public static final Item THE_SHOW_GOES_ON = register("throwbacks.the_show_goes_on", new mdpDisc(1, mdpSoundEvents.THE_SHOW_GOES_ON, THROWBACKS_SETTINGS));
    public static final Item TOOTHBRUSH = register("throwbacks.toothbrush", new mdpDisc(1, mdpSoundEvents.TOOTHBRUSH, THROWBACKS_SETTINGS));
    public static final Item WAKA_WAKA = register("throwbacks.waka_waka", new mdpDisc(1, mdpSoundEvents.WAKA_WAKA, THROWBACKS_SETTINGS));
    public static final Item WHERE_ARE_YOU_NOW = register("throwbacks.where_are_you_now", new mdpDisc(1, mdpSoundEvents.WHERE_ARE_YOU_NOW, THROWBACKS_SETTINGS));
    public static final Item WHERE_THEM_GIRLS_AT = register("throwbacks.where_them_girls_at", new mdpDisc(1, mdpSoundEvents.WHERE_THEM_GIRLS_AT, THROWBACKS_SETTINGS));

    //TikTok
    public static final Item AFTER_PARTY = register("tiktok.after_party", new mdpDisc(2, mdpSoundEvents.AFTER_PARTY, TIKTOK_SETTINGS));
    public static final Item BE_HAPPY = register("tiktok.be_happy", new mdpDisc(2, mdpSoundEvents.BE_HAPPY, TIKTOK_SETTINGS));
    public static final Item BLUEBERRY_FAYGO = register("tiktok.blueberry_faygo", new mdpDisc(2, mdpSoundEvents.BLUEBERRY_FAYGO, TIKTOK_SETTINGS));
    public static final Item BOSS_BITCH = register("tiktok.boss_bitch", new mdpDisc(2, mdpSoundEvents.BOSS_BITCH, TIKTOK_SETTINGS));
    public static final Item BRING_IT_AROUND = register("tiktok.bring_it_around", new mdpDisc(2, mdpSoundEvents.BRING_IT_AROUND, TIKTOK_SETTINGS));
    public static final Item BROKE_BITCH = register("tiktok.broke_bitch", new mdpDisc(2, mdpSoundEvents.BROKE_BITCH, TIKTOK_SETTINGS));
    public static final Item COSTA_RICA = register("tiktok.costa_rica", new mdpDisc(2, mdpSoundEvents.COSTA_RICA, TIKTOK_SETTINGS));
    public static final Item CRYSTAL_DOLPHIN = register("tiktok.crystal_dolphin", new mdpDisc(2, mdpSoundEvents.CRYSTAL_DOLPHIN, TIKTOK_SETTINGS));
    public static final Item DEATH = register("tiktok.death", new mdpDisc(2, mdpSoundEvents.DEATH, TIKTOK_SETTINGS));
    public static final Item DEEP_END_FREESTYLE = register("tiktok.deep_end_freestyle", new mdpDisc(2, mdpSoundEvents.DEEP_END_FREESTYLE, TIKTOK_SETTINGS));
    public static final Item DO_MY_DANCE = register("tiktok.do_my_dance", new mdpDisc(2, mdpSoundEvents.DO_MY_DANCE, TIKTOK_SETTINGS));
    public static final Item FAST = register("tiktok.fast", new mdpDisc(2, mdpSoundEvents.FAST, TIKTOK_SETTINGS));
    public static final Item FML = register("tiktok.fml", new mdpDisc(2, mdpSoundEvents.FML, TIKTOK_SETTINGS));
    public static final Item FURTHER_UP = register("tiktok.further_up", new mdpDisc(2, mdpSoundEvents.FURTHER_UP, TIKTOK_SETTINGS));
    public static final Item GO_STUPID = register("tiktok.go_stupid", new mdpDisc(2, mdpSoundEvents.GO_STUPID, TIKTOK_SETTINGS));
    public static final Item I_WANNA_ROCK = register("tiktok.i_wanna_rock", new mdpDisc(2, mdpSoundEvents.I_WANNA_ROCK, TIKTOK_SETTINGS));
    public static final Item LEVEL_UP = register("tiktok.level_up", new mdpDisc(2, mdpSoundEvents.LEVEL_UP, TIKTOK_SETTINGS));
    public static final Item LO_MEIN = register("tiktok.lo_mein", new mdpDisc(2, mdpSoundEvents.LO_MEIN, TIKTOK_SETTINGS));
    public static final Item LOSE_CONTROL = register("tiktok.lose_control", new mdpDisc(2, mdpSoundEvents.LOSE_CONTROL, TIKTOK_SETTINGS));
    public static final Item MY_TYPE = register("tiktok.my_type", new mdpDisc(2, mdpSoundEvents.MY_TYPE, TIKTOK_SETTINGS));
    public static final Item NIKE_TICKS = register("tiktok.nike_ticks", new mdpDisc(2, mdpSoundEvents.NIKE_TICKS, TIKTOK_SETTINGS));
    public static final Item NONSTOP = register("tiktok.nonstop", new mdpDisc(2, mdpSoundEvents.NONSTOP, TIKTOK_SETTINGS));
    public static final Item OUT_WEST = register("tiktok.out_west", new mdpDisc(2, mdpSoundEvents.OUT_WEST, TIKTOK_SETTINGS));
    public static final Item PARTY_GIRL = register("tiktok.party_girl", new mdpDisc(2, mdpSoundEvents.PARTY_GIRL, TIKTOK_SETTINGS));
    public static final Item ROCKSTAR = register("tiktok.rockstar", new mdpDisc(2, mdpSoundEvents.ROCKSTAR, TIKTOK_SETTINGS));
    public static final Item RODEO = register("tiktok.rodeo", new mdpDisc(2, mdpSoundEvents.RODEO, TIKTOK_SETTINGS));
    public static final Item ROSCOES = register("tiktok.roscoes", new mdpDisc(2, mdpSoundEvents.ROSCOES, TIKTOK_SETTINGS));
    public static final Item ROSES = register("tiktok.roses", new mdpDisc(2, mdpSoundEvents.ROSES, TIKTOK_SETTINGS));
    public static final Item ROXANNE = register("tiktok.roxanne", new mdpDisc(2, mdpSoundEvents.ROXANNE, TIKTOK_SETTINGS));
    public static final Item SAVAGE_TIKTOK = register("tiktok.savage", new mdpDisc(2, mdpSoundEvents.SAVAGE_TIKTOK, TIKTOK_SETTINGS));
    public static final Item SAY_SO = register("tiktok.say_so", new mdpDisc(2, mdpSoundEvents.SAY_SO, TIKTOK_SETTINGS));
    public static final Item SKETCHERS = register("tiktok.sketchers", new mdpDisc(2, mdpSoundEvents.SKETCHERS, TIKTOK_SETTINGS));
    public static final Item SNAKE = register("tiktok.snake", new mdpDisc(2, mdpSoundEvents.SNAKE, TIKTOK_SETTINGS));
    public static final Item SOMETHING_FOR_YOUR_MIND = register("tiktok.something_for_your_mind", new mdpDisc(2, mdpSoundEvents.SOMETHING_FOR_YOUR_MIND, TIKTOK_SETTINGS));
    public static final Item STARDUST = register("tiktok.stardust", new mdpDisc(2, mdpSoundEvents.STARDUST, TIKTOK_SETTINGS));
    public static final Item STUNNIN = register("tiktok.stunnin", new mdpDisc(2, mdpSoundEvents.STUNNIN, TIKTOK_SETTINGS));
    public static final Item STUPID = register("tiktok.stupid", new mdpDisc(2, mdpSoundEvents.STUPID, TIKTOK_SETTINGS));
    public static final Item SUNDAY_BEST = register("tiktok.sunday_best", new mdpDisc(2, mdpSoundEvents.SUNDAY_BEST, TIKTOK_SETTINGS));
    public static final Item THE_BOX = register("tiktok.the_box", new mdpDisc(2, mdpSoundEvents.THE_BOX, TIKTOK_SETTINGS));
    public static final Item THEY_CALL_ME_TIAGO = register("tiktok.they_call_me_tiago", new mdpDisc(2, mdpSoundEvents.THEY_CALL_ME_TIAGO, TIKTOK_SETTINGS));
    public static final Item TOOSIE_SLIDE = register("tiktok.toosie_slide", new mdpDisc(2, mdpSoundEvents.TOOSIE_SLIDE, TIKTOK_SETTINGS));
    public static final Item WHATS_POPPIN = register("tiktok.whats_poppin", new mdpDisc(2, mdpSoundEvents.WHATS_POPPIN, TIKTOK_SETTINGS));
    public static final Item WHERES_MY_JUUL = register("tiktok.wheres_my_juul", new mdpDisc(2, mdpSoundEvents.WHERES_MY_JUUL, TIKTOK_SETTINGS));
    public static final Item WOAH = register("tiktok.woah", new mdpDisc(2, mdpSoundEvents.WOAH, TIKTOK_SETTINGS));
    public static final Item YOU = register("tiktok.you", new mdpDisc(2, mdpSoundEvents.YOU, TIKTOK_SETTINGS));


    //Requests
    public static final Item NEVER_GONNA_GIVE_YOU_UP = register("requests.never_gonna_give_you_up", new mdpDisc(3, mdpSoundEvents.NEVER_GONNA_GIVE_YOU_UP, REQUESTS_SETTINGS));

    public static Item register(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier("mdp", name), item);
    }

    public static void init(){}
}
