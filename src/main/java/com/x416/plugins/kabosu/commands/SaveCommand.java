package com.x416.plugins.kabosu.commands;

import com.x416.plugins.kabosu.Kabosu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SaveCommand extends KCommand implements CommandExecutor {

    public SaveCommand(Kabosu plugin) {
        super(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            plugin.getSaveTask().save();
        } else {
            return false;
        }
        return true;
    }
}
