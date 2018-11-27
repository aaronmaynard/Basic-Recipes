package com.aaronmaynard.Basic_Recipes.Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import com.aaronmaynard.Basic_Recipes.Main;

public class Wool implements Listener {
	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void customRecipe() {

		ItemStack item = new ItemStack(Material.WHITE_WOOL, 1);
		ShapedRecipe r = new ShapedRecipe(item);

		r.shape("###", "###", "###");
		r.setIngredient('#', Material.STRING);

		plugin.getServer().addRecipe(r);
	}

}
