package com.hacdan.IronShulker;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Loading the Iron Shulker Recipe");
        addIronShulkerShellRecipe();
    }

    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }

    public void addIronShulkerShellRecipe () {
        ItemStack result = new ItemStack(Material.SHULKER_SHELL);
        NamespacedKey key = new NamespacedKey(this, this.getDescription().getName());
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape("III", "IPI", "III");

        recipe.setIngredient('I', Material.IRON_BLOCK);
        recipe.setIngredient('P', Material.POPPED_CHORUS_FRUIT);

        Bukkit.addRecipe(recipe);
    }
}
    
