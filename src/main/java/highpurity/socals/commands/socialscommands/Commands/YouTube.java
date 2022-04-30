package highpurity.socals.commands.socialscommands.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ResourceBundle;

public class YouTube implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String toggleyt = getConfig().getString("Youtube");
            if (sender instanceof Player) {
                Player player = (Player) sender;
                String name = getConfig().getString("Name");
                String yt = getConfig().getString("Youtube-Link");
                player.sendMessage(ChatColor.RED + "Subscribe to " + ChatColor.WHITE + name + ChatColor.RED + " On YouTube over at: " + ChatColor.YELLOW + yt + ChatColor.WHITE + " ! ");
            }

            return true;
        }
    private ResourceBundle getConfig() {
        return null;
    }
}
