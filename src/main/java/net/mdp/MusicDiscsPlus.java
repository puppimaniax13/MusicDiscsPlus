package net.mdp;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mdp.common.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MusicDiscsPlus implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();


    public static final String MOD_ID = "mdp";
    public static final String MOD_NAME = "MusicDiscs+";

    public static final ItemGroup NCS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "ncs"), () ->
    {
        return new ItemStack(Items.PARADISE);
    });

    public static final ItemGroup MONSTERCAT = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "monstercat"), () ->
    {
        return new ItemStack(Items.RAINBOW_ROAD);
    });

    public static final ItemGroup THROWBACKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "throwbacks"), () ->
    {
        return new ItemStack(Items.HAPPY);
    });

    public static final ItemGroup POP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "pop"), () ->
    {
        return new ItemStack(Items.BLUEBERRY_FAYGO);
    });

    public static final ItemGroup REQUESTS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "requests"), () ->
    {
        return new ItemStack(Items.NEVER_GONNA_GIVE_YOU_UP);
    });


    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        Items.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}