package highpurity.socals.commands.socialscommands.Commands;

import highpurity.socals.commands.socialscommands.SocialsCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor{
    private final SocialsCommands plugin;
    public ReloadCommand(SocialsCommands plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.RED + "SocialCommands is reloading...");
        plugin.reloadConfig();
        sender.sendMessage(ChatColor.GREEN + "SocialCommands has reloaded! (:");
        return true;
    }
}