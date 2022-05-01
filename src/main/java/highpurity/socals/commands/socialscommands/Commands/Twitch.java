package highpurity.socals.commands.socialscommands.Commands;

import highpurity.socals.commands.socialscommands.SocialsCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Twitch implements CommandExecutor {

    private final SocialsCommands plugin;

    public Twitch(SocialsCommands plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (plugin.getConfig().getBoolean("Twitch")) {
            var config = plugin.getConfig();
            var name = config.getString("Name");
            var twitch = config.getString("Twitch-Link");
            sender.sendMessage(ChatColor.DARK_PURPLE + "Follow " + ChatColor.WHITE + name + ChatColor.DARK_PURPLE + " On Twitch over at: " + ChatColor.WHITE + twitch + ChatColor.DARK_PURPLE + " ! ");


        }else{

            sender.sendMessage(ChatColor.RED + "This module is disabled! Ask a system administrator to enable this module in the Config.yml!");

        }
        return true;

    }

}