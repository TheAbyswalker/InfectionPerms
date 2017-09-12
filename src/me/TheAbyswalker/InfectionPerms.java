package me.TheAbyswalker;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class InfectionPerms extends JavaPlugin implements Listener{
	
	public static InfectionPerms plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
}
