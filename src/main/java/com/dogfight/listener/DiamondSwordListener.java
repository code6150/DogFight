package com.dogfight.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DiamondSwordListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent pie) {
        Player p = pie.getPlayer();
        ItemStack is = p.getInventory().getItemInMainHand();
        if (is.getType() == Material.DIAMOND_SWORD && pie.getAction() == Action.RIGHT_CLICK_AIR) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 1));
            p.sendMessage("빨라진드아아아");
        }
    }

}
