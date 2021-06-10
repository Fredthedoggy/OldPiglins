package me.fredthedoggy.oldpiglins;

import me.fredthedoggy.oldpiglins.util.GenerateTrade;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Piglin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class OldPiglins extends JavaPlugin {

    Random random = new Random();
    GenerateTrade trader = new GenerateTrade(random);

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PiglinListener(), this);
    }

    public class PiglinListener implements Listener {
        @EventHandler
        public void onPiglinTrade(EntityDropItemEvent event) {
            if (!(event.getEntity() instanceof Piglin)) return;
            Item item = event.getItemDrop();
            item.setItemStack(trader.nextTrade());
        }
    }
}
