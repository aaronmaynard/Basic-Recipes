package com.aaronmaynard.Basic_Recipes.Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import com.aaronmaynard.Basic_Recipes.Main;

public class HorseArmor implements Listener {
	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void customRecipe() {

		ItemStack dha = new ItemStack(Material.DIAMOND_HORSE_ARMOR, 1);
		ItemStack gha = new ItemStack(Material.GOLDEN_HORSE_ARMOR, 1);
		ItemStack iha = new ItemStack(Material.IRON_HORSE_ARMOR, 1);
		
		ShapedRecipe s1 = new ShapedRecipe(dha);
		s1.shape("  @", "@#@", "@ @");
		s1.setIngredient('#', Material.SADDLE);
		s1.setIngredient('@', Material.DIAMOND);
		plugin.getServer().addRecipe(s1);

		ShapedRecipe s2 = new ShapedRecipe(gha);
		s2.shape("  @", "@#@", "@ @");
		s2.setIngredient('#', Material.SADDLE);
		s2.setIngredient('@', Material.GOLD_INGOT);
		plugin.getServer().addRecipe(s2);

		ShapedRecipe s3 = new ShapedRecipe(iha);
		s3.shape("  @", "@#@", "@ @");
		s3.setIngredient('#', Material.SADDLE);
		s3.setIngredient('@', Material.IRON_INGOT);
		plugin.getServer().addRecipe(s3);
		
	}

}
