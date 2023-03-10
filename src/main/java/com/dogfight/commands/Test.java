package com.dogfight.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test extends MyCommand {

    public Test(JavaPlugin plugin, String ymlCommand, List<String> list) {
        super(plugin, ymlCommand, list);
    }

    private List<String> subCommands = Arrays.asList();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args){
        if(!(sender instanceof Player)) {
            sender.sendMessage("콘솔에서는 입력할 수 없습니다.");
            return false;
        }

        Player p = (Player) sender;

        if (p.isOp()) {

            if (args.length == 0) return false;

            switch (args[0]) {
                default: {
                    p.sendMessage("등록되지 않은 명령어를 입력했습니다");
                }
            }
        } else {
            p.sendMessage("명령어를 사용할 권한이 없습니다.");
        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length == 0) return subCommands;
        else if(args.length == 1) return StringUtil.copyPartialMatches(args[0], subCommands, new ArrayList());
        return new ArrayList();
    }
}
