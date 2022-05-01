package highpurity.socals.commands.socialscommands.Commands;

import highpurity.socals.commands.socialscommands.SocialsCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Twitter implements CommandExecutor {

    private final SocialsCommands plugin;

    public Twitter(SocialsCommands plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (plugin.getConfig().getBoolean("Twitter")) {
            var config = plugin.getConfig();
            var name = config.getString("Name");
            var twitter = config.getString("Twitter-Link");
            sender.sendMessage(ChatColor.AQUA + "Follow " + ChatColor.WHITE + name + ChatColor.AQUA + " On Twitter over at: " + ChatColor.WHITE + twitter + ChatColor.AQUA + "!");


        }else{

            sender.sendMessage(ChatColor.RED + "This module is disabled! Ask a system administrator to enable this module in the Config.yml!");

        }
        return true;

    }

}