package com.aaronmaynard.Basic_Recipes;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.aaronmaynard.Basic_Recipes.BListener;
import com.aaronmaynard.Basic_Recipes.Recipes.*;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public static Main getPlugin() {
        return instance;
	}
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BListener(this), this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Basic_Recipes has been Enabled");
		//getServer().getPluginManager().registerEvents(new EventsClass(), this);

		Wool wool = new Wool();
		wool.customRecipe();
		
		SunflowerSeeds sfs = new SunflowerSeeds();
		sfs.customRecipe();
		
		NameTag nametag = new NameTag();
		nametag.customRecipe();
		
		Cobweb cobweb = new Cobweb();
		cobweb.customRecipe();
		
		Chainmail cm = new Chainmail();
		cm.customRecipe();
		
		Saddle saddle = new Saddle();
		saddle.customRecipe();
		
		HorseArmor ha = new HorseArmor();
		ha.customRecipe();
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Basic_Recipes has been Disabled");
	}

}
