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
    private static final Item.Settings LOFI_SETTINGS = new Item.Settings().maxCount(1).group(MusicDiscsPlus.LOFI).rarity(Rarity.RARE).maxCount(1);
    //NCS
    public static final Item ABOUT_YOU = register("about_you", new mdpDisc(14, mdpSoundEvents.ABOUT_YOU, NCS_SETTINGS));
    public static final Item BLUE_EYED_DEMON = register("blue_eyed_demon", new mdpDisc(14, mdpSoundEvents.BLUE_EYED_DEMON, NCS_SETTINGS));
    public static final Item CASTLE = register("castle", new mdpDisc(14, mdpSoundEvents.CASTLE, NCS_SETTINGS));
    public static final Item COOL = register("cool", new mdpDisc(14, mdpSoundEvents.COOL, NCS_SETTINGS));
    public static final Item FIND_YOU = register("find_you", new mdpDisc(14, mdpSoundEvents.FIND_YOU, NCS_SETTINGS));
    public static final Item GRAVITY = register("gravity", new mdpDisc(14, mdpSoundEvents.GRAVITY, NCS_SETTINGS));
    public static final Item HOWLING = register("howling", new mdpDisc(14, mdpSoundEvents.HOWLING, NCS_SETTINGS));
    public static final Item ISLAND = register("island", new mdpDisc(14, mdpSoundEvents.ISLAND, NCS_SETTINGS));
    public static final Item LIGHT_IT_UP = register("light_it_up", new mdpDisc(14, mdpSoundEvents.LIGHT_IT_UP, NCS_SETTINGS));
    public static final Item LIVE_A_LIE = register("live_a_lie", new mdpDisc(14, mdpSoundEvents.LIVE_A_LIE, NCS_SETTINGS));
    public static final Item LOVE_ME = register("love_me", new mdpDisc(14, mdpSoundEvents.LOVE_ME, NCS_SETTINGS));
    public static final Item MAS_Y_MAS = register("mas_y_mas", new mdpDisc(14, mdpSoundEvents.MAS_Y_MAS, NCS_SETTINGS));
    public static final Item PARADISE = register("paradise", new mdpDisc(14, mdpSoundEvents.PARADISE, NCS_SETTINGS));
    public static final Item SAY_GOODBYE = register("say_goodbye", new mdpDisc(14, mdpSoundEvents.SAY_GOODBYE, NCS_SETTINGS));
    public static final Item SUN_GOES_DOWN = register("sun_goes_down", new mdpDisc(14, mdpSoundEvents.SUN_GOES_DOWN, NCS_SETTINGS));
    public static final Item SUPERHERO = register("superhero", new mdpDisc(14, mdpSoundEvents.SUPERHERO, NCS_SETTINGS));
    public static final Item WE_STARTED = register("we_started", new mdpDisc(14, mdpSoundEvents.WE_STARTED, NCS_SETTINGS));
    public static final Item WHY_DO_I = register("why_do_i", new mdpDisc(14, mdpSoundEvents.WHY_DO_I, NCS_SETTINGS));
    //RL
    public static final Item ROCK_IT = register("rock_it", new mdpDisc(15, mdpSoundEvents.ROCK_IT, MONSTERCAT_SETTINGS));
    //LoFi
    public static final Item MIDNIGHT = register("midnight", new mdpDisc(1, mdpSoundEvents.MIDNIGHT, LOFI_SETTINGS));



    public static Item register(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier("mdp", name), item);
    }

    public static void init(){}
}
