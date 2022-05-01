package highpurity.socals.commands.socialscommands;

import highpurity.socals.commands.socialscommands.Commands.ReloadCommand;
import highpurity.socals.commands.socialscommands.Commands.Twitch;
import highpurity.socals.commands.socialscommands.Commands.YouTube;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

// Plugin startup logic

public final class SocialsCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.print(ChatColor.GREEN + "SocialCommands is starting!");

        saveDefaultConfig();

        getCommand("YouTube").setExecutor(new YouTube(this));
        getCommand("ScReload").setExecutor(new ReloadCommand(this));
        getCommand("Twitch").setExecutor(new Twitch(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
