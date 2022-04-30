package highpurity.socals.commands.socialscommands;

import highpurity.socals.commands.socialscommands.Commands.YouTube;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

        // Plugin startup logic

        public final class SocialsCommands extends JavaPlugin {

            @Override
            public void onEnable() {
                System.out.print(ChatColor.GREEN + "SocialCommands is starting!");

                getCommand("youtube").setExecutor(new YouTube());

                getConfig().options().copyDefaults();

                saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
