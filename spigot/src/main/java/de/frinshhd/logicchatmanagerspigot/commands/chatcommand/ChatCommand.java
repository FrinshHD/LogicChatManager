package de.frinshhd.logicchatmanagerspigot.commands.chatcommand;

import de.frinshhd.logicspigotcore.LogicSpigotCoreMain;
import de.frinshhd.logicspigotcore.commands.BasicCommand;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ChatCommand extends BasicCommand {
    public ChatCommand() {
        super("chat", "logicchatmanager.command.chat");
        setDescription("A variety of commands to manage the chat.");
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (super.execute(sender, commandLabel, args)) {
            return true;
        }


        //send help message
        LogicSpigotCoreMain.getCommandManager().getSubCommand(this, "help").execute(sender, commandLabel, new String[]{});
        return false;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {
        return super.tabComplete(sender, alias, args);
    }
}
