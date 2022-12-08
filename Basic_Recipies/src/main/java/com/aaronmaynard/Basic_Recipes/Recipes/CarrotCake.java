package com.aaronmaynard.Basic_Recipes.Recipes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.aaronmaynard.Basic_Recipes.Main;

public class CarrotCake implements Listener {
	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void customRecipe() {

		ItemStack item = new ItemStack(Material.CAKE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.WHITE + "Carrot Cake");
		item.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(item);

		r.shape("MMM", "SCS", "WWW");
		r.setIngredient('M', Material.MILK_BUCKET);
		r.setIngredient('C', Material.CARROT);
		r.setIngredient('S', Material.SUGAR);
		r.setIngredient('W', Material.WHEAT);

		plugin.getServer().addRecipe(r);
	}

}
