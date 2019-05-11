package me.calebbassham.scenario;

import me.calebbassham.scenariomanager.PlayerStartEvent;
import me.calebbassham.scenariomanager.Scenario;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class GoneFishing extends Scenario implements Listener {

    public GoneFishing() {
        super("Gone Fishing");
    }

    @EventHandler
    public void onPlayerStart(PlayerStartEvent e) {
        Player player = e.getPlayer();

        PlayerInventory inv = player.getInventory();
        inv.addItem(new ItemStack(Material.ANVIL));

        ItemStack rod = new ItemStack(Material.FISHING_ROD);
        rod.addEnchantment(Enchantment.LURE, 3);
        rod.addUnsafeEnchantment(Enchantment.LUCK, 250);
        ItemMeta meta = rod.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName(ChatColor.GREEN + "Lucky Fishin' Rod");
        rod.setItemMeta(meta);
        inv.addItem(rod);

        player.setLevel(10000);
    }

}
