package highpurity.socals.commands.socialscommands.Commands;

import highpurity.socals.commands.socialscommands.SocialsCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YouTube implements CommandExecutor {

    private final SocialsCommands plugin;

    public YouTube(SocialsCommands plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (plugin.getConfig().getBoolean("Twitch")) {
            var config = plugin.getConfig();
            var name = config.getString("Name");
            var yt = config.getString("Youtube-Link");
            sender.sendMessage(ChatColor.RED + "Subscribe to " + ChatColor.WHITE + name + ChatColor.RED + " On YouTube over at: " + ChatColor.WHITE + yt + ChatColor.RED + " ! ");

        } else {
            sender.sendMessage(ChatColor.RED + "This module is disabled! Ask a system administrator to enable this module in the Config.yml!");
        }

        return true;
    }

}