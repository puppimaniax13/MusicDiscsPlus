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
        return new ItemStack(Items.AGAINST_THE_SUN);
    });

    public static final ItemGroup LOFI = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "lofi"), () ->
    {
        return new ItemStack(Items.MIDNIGHT);
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