package com.aaronmaynard.Basic_Recipes.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.aaronmaynard.Basic_Recipes.Main;

import java.util.Iterator;

public class SunflowerSeeds {

	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void customRecipe() {

		Iterator<Recipe> it = Bukkit.getServer().recipeIterator();
		Recipe recipe;
		while (it.hasNext()) {
			recipe = it.next();
			if (recipe != null && recipe.getResult().getType() == Material.DANDELION_YELLOW) {
				it.remove();
			}
		}

		ItemStack item = new ItemStack(Material.MELON_SEEDS, 3);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.WHITE + "Sunflower Seeds");

		item.setItemMeta(meta);

		ShapelessRecipe slr = new ShapelessRecipe(item);

		slr.addIngredient(1, Material.SUNFLOWER);
		plugin.getServer().addRecipe(slr);
	}
}
