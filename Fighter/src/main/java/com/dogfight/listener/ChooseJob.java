package com.dogfight.listener;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class ChooseJob implements Listener {

    @EventHandler
    public void onArmorStandClick(PlayerInteractEntityEvent event) {
        Player player = (Player) event.getRightClicked();
        if (player instanceof ArmorStand) {
            player.sendMessage("아머스탠드를 우클릭 하였습니다 ㄷㄷ");
        }
    }

}
