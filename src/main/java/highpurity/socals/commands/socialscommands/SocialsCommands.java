package highpurity.socals.commands.socialscommands;

import highpurity.socals.commands.socialscommands.Commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

// Plugin startup logic

public final class SocialsCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.print(ChatColor.GREEN + "SocialCommands is starting!");
        saveDefaultConfig();
        if (getConfig().getBoolean("Initial-Startup")) {
            System.out.print(ChatColor.RED + "This plugin has not been configured - If this is your first time starting the plugin, then it is normal to see this!");
        }else{
            System.out.print(ChatColor.GREEN + "This plugin has been properly setup!");
        }


        getCommand("YouTube").setExecutor(new YouTube(this));
        getCommand("ScReload").setExecutor(new ReloadCommand(this));
        getCommand("Twitch").setExecutor(new Twitch(this));
        getCommand("Discord").setExecutor(new Discord(this));
        getCommand("Twitter").setExecutor(new Twitter(this));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
