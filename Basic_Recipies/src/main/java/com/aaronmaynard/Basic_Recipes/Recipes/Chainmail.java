package com.aaronmaynard.Basic_Recipes.Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import com.aaronmaynard.Basic_Recipes.Main;

public class Chainmail implements Listener {
	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void customRecipe() {

		/*
		 * Chainmail Boots
		 */
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		
		ShapedRecipe b = new ShapedRecipe(boots);
		b.shape("   ", "# #", "# #");
		b.setIngredient('#', Material.IRON_NUGGET);
		plugin.getServer().addRecipe(b);
		
		ShapedRecipe b2 = new ShapedRecipe(boots);
		b2.shape("# #", "# #", "   ");
		b2.setIngredient('#', Material.IRON_NUGGET);
		plugin.getServer().addRecipe(b2);

		/*
		 * Chainmail Helmet
		 */
		ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		
		ShapedRecipe h = new ShapedRecipe(helmet);
		h.shape("   ", "###", "# #");
		h.setIngredient('#', Material.IRON_NUGGET);
		plugin.getServer().addRecipe(h);
		
		ShapedRecipe h2 = new ShapedRecipe(helmet);
		h2.shape("###", "# #", "   ");
		h2.setIngredient('#', Material.IRON_NUGGET);
		plugin.getServer().addRecipe(h2);

		/*
		 * Chainmail Chestplate
		 */
		ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		
		ShapedRecipe c = new ShapedRecipe(chestplate);
		c.shape("# #", "###", "###");
		c.setIngredient('#', Material.IRON_NUGGET);
		plugin.getServer().addRecipe(c);

		/*
		 * Chainmail Leggings
		 */
		ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		
		ShapedRecipe l = new ShapedRecipe(leggings);
		l.shape("###", "# #", "# #");
		l.setIngredient('#', Material.IRON_NUGGET);
		plugin.getServer().addRecipe(l);

	}

}
