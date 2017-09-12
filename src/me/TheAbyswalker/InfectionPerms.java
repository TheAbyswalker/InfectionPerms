package me.TheAbyswalker;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

public class InfectionPerms extends JavaPlugin implements Listener{
	
	public static InfectionPerms plugin;
	public HashMap<UUID, PermissionAttachment> playerPerm = new HashMap<>();
	
	@Override
	public void onEnable() {
		plugin = this;
		
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {
		playerPerm.clear();
	}
	
	
	//This is puerly for eas of testing the plugin. It will be removed when finished.
	@EventHandler
	public void breakBlock(BlockBreakEvent e) {
		Player player = e.getPlayer();
		
		if(!player.hasPermission("tutorial.blockbreak")) {
			e.setCancelled(true);
			player.sendMessage("You cant do this");
		}
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		setupPermissions(player);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player player = e.getPlayer();
		playerPerm.remove(player.getUniqueId());
	}
	
	public void setupPermissions(Player player) {
		PermissionAttachment attachment = player.addAttachment(this);
		this.playerPerm.put(player.getUniqueId(), attachment);
		permissionsSetter(player.getUniqueId());
	}


	private void permissionsSetter(UUID uuid) {
		PermissionAttachment attachment = this.playerPerm.get(uuid);
		for(String groups : this.getConfig().getConfigurationSection("Groups").getKeys(false)) {
			for(String permissions : this.getConfig().getStringList("Groups." + groups + ".permissions")) {
				attachment.setPermission(permissions, true);
			}
		}
	}
}
