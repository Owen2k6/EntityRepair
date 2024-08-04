package com.owen2k6.entityrepair;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class EntityRepair extends JavaPlugin {
    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("EntityRepair has been disabled!");
    }

    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info("EntityRepair has been enabled!");
        Bukkit.getScheduler().scheduleAsyncRepeatingTask(this, this::updateEnt, 0L, 100L);
    }

    public void updateEnt() {
        for (Player p : Bukkit.getOnlinePlayers()) {
                for (Player op : Bukkit.getOnlinePlayers()) {
                    op.showPlayer(p);
            }
        }
    }
}
