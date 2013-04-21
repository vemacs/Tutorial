package com.reddit.admincraft.plugins.tutorial;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin implements Listener {
    
    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (event.getPlayer().hasPermission("tutorial.receive") {
            event.getPlayer().sendMessage("Hello, " + event.getPlayer().getDisplayName() + "!");
        }
    }
}

