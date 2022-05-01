package highpurity.socals.commands.socialscommands.Commands;

import highpurity.socals.commands.socialscommands.SocialsCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Discord implements CommandExecutor {

    private final SocialsCommands plugin;

    public Discord(SocialsCommands plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (plugin.getConfig().getBoolean("Discord")) {
            var config = plugin.getConfig();
            var name = config.getString("Name");
            var discord = config.getString("Discord-Link");
            sender.sendMessage(ChatColor.BLUE + "Join the  " + ChatColor.WHITE + name + ChatColor.BLUE + " Discord Server over at: " + ChatColor.WHITE + discord + ChatColor.BLUE + "!");

        } else {
            sender.sendMessage(ChatColor.RED + "This module is disabled! Ask a system administrator to enable this module in the Config.yml!");
        }

        return true;
    }

}