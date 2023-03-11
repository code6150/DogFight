package com.dogfight;

import org.bukkit.plugin.java.JavaPlugin;

public final class Fighter extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("개싸움 플러그인이 활성화 되었습니다!");
    }

    @Override
    public void onDisable() {
        System.out.println("개싸움 플러그인이 비활성화 되었습니다!");
    }

}
