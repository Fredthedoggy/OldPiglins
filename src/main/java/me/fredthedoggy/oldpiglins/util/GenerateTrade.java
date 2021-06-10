package me.fredthedoggy.oldpiglins.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.Random;

public class GenerateTrade {
    private Random random;
    public GenerateTrade(Random random) {
        this.random = random;
    }

    public ItemStack nextTrade() {
        if (random == null) random = new Random();

        int rand = random.nextInt(423) + 1;
        if (rand <= 5) {
            ItemStack itemStack = new ItemStack(Material.ENCHANTED_BOOK);
            EnchantmentStorageMeta itemMeta = (EnchantmentStorageMeta) itemStack.getItemMeta();
            if (itemMeta != null) {
                itemMeta.addStoredEnchant(Enchantment.SOUL_SPEED, random.nextInt(3) + 1, false);
                itemStack.setItemMeta(itemMeta);
            }
            return itemStack;
        } else if (rand <= 13) {
            ItemStack itemStack = new ItemStack(Material.IRON_BOOTS);
            itemStack.addEnchantment(Enchantment.SOUL_SPEED, random.nextInt(3) + 1);
            Damageable itemMeta = (Damageable) itemStack.getItemMeta();
            if (itemMeta != null) {
                itemMeta.setDamage(random.nextInt(Material.IRON_BOOTS.getMaxDurability()) + 1);
                itemStack.setItemMeta((ItemMeta) itemMeta);
            }
            return itemStack;
        } else if (rand <= 23) {
            return new ItemStack(Material.IRON_NUGGET, random.nextInt(26) + 9);
        } else if (rand <= 33) {
            ItemStack itemStack = new ItemStack(Material.SPLASH_POTION);
            PotionMeta itemMeta = (PotionMeta) itemStack.getItemMeta();
            if (itemMeta != null) {
                itemMeta.setBasePotionData(new PotionData(PotionType.FIRE_RESISTANCE, false, false));
                itemStack.setItemMeta(itemMeta);
            }
            return itemStack;
        } else if (rand <= 43) {
            ItemStack itemStack = new ItemStack(Material.POTION);
            PotionMeta itemMeta = (PotionMeta) itemStack.getItemMeta();
            if (itemMeta != null) {
                itemMeta.setBasePotionData(new PotionData(PotionType.FIRE_RESISTANCE, false, false));
                itemStack.setItemMeta(itemMeta);
            }
            return itemStack;
        } else if (rand <= 63) {
            return new ItemStack(Material.QUARTZ, random.nextInt(9) + 8);
        } else if (rand <= 83) {
            return new ItemStack(Material.GLOWSTONE_DUST, random.nextInt(8) + 5);
        } else if (rand <= 103) {
            return new ItemStack(Material.MAGMA_CREAM, random.nextInt(5) + 2);
        } else if (rand <= 123) {
            return new ItemStack(Material.ENDER_PEARL, random.nextInt(9) + 4);
        } else if (rand <= 143) {
            return new ItemStack(Material.STRING, random.nextInt(17) + 8);
        } else if (rand <= 183) {
            return new ItemStack(Material.FIRE_CHARGE, random.nextInt(5) + 1);
        } else if (rand <= 223) {
            return new ItemStack(Material.GRAVEL, random.nextInt(9) + 8);
        } else if (rand <= 263) {
            return new ItemStack(Material.LEATHER, random.nextInt(7) + 4);
        } else if (rand <= 303) {
            return new ItemStack(Material.NETHER_BRICK, random.nextInt(13) + 4);
        } else if (rand <= 343) {
            return new ItemStack(Material.OBSIDIAN);
        }  else if (rand <= 383) {
            return new ItemStack(Material.CRYING_OBSIDIAN, random.nextInt(3) + 1);
        } else {
            return new ItemStack(Material.SOUL_SAND, random.nextInt(13) + 4);
        }
    }
}
