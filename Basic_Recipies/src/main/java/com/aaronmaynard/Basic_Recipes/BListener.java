package com.aaronmaynard.Basic_Recipes;

import java.util.Random;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class BListener implements Listener {
	Random random = new Random();
	int eatCounter = 0;

	public BListener(Main instance) {
	}

	/*
	 * SUNFLOWERSEEDS
	 */
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		// Event called when a player interacts with something, AKA right click or left
		// click
		Player player = e.getPlayer();
		ItemStack hand = player.getInventory().getItemInMainHand();
		if (hand.getItemMeta().getDisplayName().equalsIgnoreCase("sunflower seeds")) {

			if (player.getFoodLevel() < 20) {
				Location location = player.getEyeLocation();
				location.getWorld().playEffect(location, Effect.STEP_SOUND, Material.DARK_OAK_LOG);
				location.getWorld().playSound(location, Sound.ENTITY_GENERIC_EAT, 1f, 0.7f + random.nextFloat() * 0.3f);
				if (eatCounter < 4) {
					eatCounter++;
				} else {
					player.setFoodLevel(player.getFoodLevel() + 1);
					hand.setAmount(hand.getAmount() - 1);
					eatCounter = 0;
				}
			}
			
		}
	}
}
