package com.aaronmaynard.Basic_Recipies;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.aaronmaynard.Basic_Recipies.Recipies.*;
import com.aaronmaynard.Basic_Recipies.BListener;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public static Main getPlugin() {
        return instance;
	}
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BListener(this), this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Tutorial has been Enabled");
		//getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();

		Wool wool = new Wool();
		wool.customRecipe();
		
		SunflowerSeeds sfs = new SunflowerSeeds();
		sfs.customRecipe();
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Tutorial has been Disabled");
		}

		public void loadConfig(){
		getConfig().options().copyDefaults(true);
		saveConfig();
		}

}
