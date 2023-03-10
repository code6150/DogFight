package com.dogfight.commands;

import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public abstract class MyCommand implements CommandExecutor, TabCompleter {

    public MyCommand(JavaPlugin plugin, String ymlCommand, List<String> list) {
        PluginCommand cmd = plugin.getCommand(ymlCommand);
        assert cmd != null;
        cmd.setExecutor(this);
        cmd.setTabCompleter(this);
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        return null;
    }

}