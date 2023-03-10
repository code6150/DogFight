package com.dogfight.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent ede) {
        if (!(ede.getEntity() instanceof Player)) { return; }
        Player p = (Player) ede.getEntity();

        // 받는 피해를 1.5배 증가 시킴
        ede.setDamage(ede.getDamage() * 1.5);

    }

}
