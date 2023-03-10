package com.dogfight;

import com.dogfight.commands.Test;
import com.dogfight.listener.ChooseJob;
import com.dogfight.listener.DamageListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class DogFight extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("개싸움 플러그인이 활성화 되었습니다!");
    }

    @Override
    public void onDisable() {
        System.out.println("개싸움 플러그인이 비활성화 되었습니다!");
    }

}
