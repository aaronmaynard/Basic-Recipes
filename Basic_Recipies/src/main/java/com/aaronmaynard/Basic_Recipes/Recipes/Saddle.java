package com.aaronmaynard.Basic_Recipes.Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import com.aaronmaynard.Basic_Recipes.Main;

public class Saddle implements Listener {
	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void customRecipe() {

		ItemStack item = new ItemStack(Material.SADDLE, 1);
		
		ShapedRecipe s1 = new ShapedRecipe(item);
		s1.shape("@@ ", "@# ", "   ");
		s1.setIngredient('#', Material.STRING);
		s1.setIngredient('@', Material.LEATHER);
		plugin.getServer().addRecipe(s1);
		
		ShapedRecipe s2 = new ShapedRecipe(item);
		s2.shape(" @@", " @#", "   ");
		s2.setIngredient('#', Material.STRING);
		s2.setIngredient('@', Material.LEATHER);
		plugin.getServer().addRecipe(s2);
		
		ShapedRecipe s3 = new ShapedRecipe(item);
		s3.shape("   ", "@@ ", "@# ");
		s3.setIngredient('#', Material.STRING);
		s3.setIngredient('@', Material.LEATHER);
		plugin.getServer().addRecipe(s3);
		
		ShapedRecipe s4 = new ShapedRecipe(item);
		s4.shape("   ", " @@", " @#");
		s4.setIngredient('#', Material.STRING);
		s4.setIngredient('@', Material.LEATHER);
		plugin.getServer().addRecipe(s4);
	}

}
