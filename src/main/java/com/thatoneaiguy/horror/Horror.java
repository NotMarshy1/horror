package com.thatoneaiguy.horror;

import com.thatoneaiguy.horror.entity.HorrorEntities;
import com.thatoneaiguy.horror.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import static net.minecraft.server.command.CommandManager.*;

import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Horror implements ModInitializer {

	public static final String MOD_ID = "horror";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	public static final Identifier ASTRAY_ID = new Identifier("horror:astray");
	public static SoundEvent ASTRAY_EVENT = new SoundEvent(ASTRAY_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("jumpscare")
				.requires(source -> source.hasPermissionLevel(4))
				.then(CommandManager.argument("target", EntityArgumentType.player())
				.executes(context -> {
					context.getSource().sendMessage(Text.literal("HAHA FUNNY JUMPSCARE #1"));

					return 1;
				}

				))));

		HorrorEntities.registerDatEntity();

	}
}