package de.frinshhd.logicchatmanagerspigot.commands.chatcommand.subcommands;

import de.frinshhd.logicspigotcore.commands.BasicSubCommand;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class ClearCommand extends BasicSubCommand {
    public ClearCommand() {
        super("chat", "logicchatmanager.command.chat.clear", new String[]{"clear"});
        setDescription("Clears the chat.");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        return false;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, String[] args) {
        if (super.tabComplete(sender, args) == null) {
            return new ArrayList<>();
        }

        List<String> possibleCompletions = new ArrayList<>();
        List<String> completions = new ArrayList<>();

        possibleCompletions.add("clear");

        // Filter
        possibleCompletions.forEach(completion -> {
            if (args.length == 0) {
                completions.add(completion);
                return;
            }

            if (args.length == 1 && completion.toLowerCase().startsWith(args[0])) {
                completions.add(completion);
                return;
            }
        });

        return completions;
    }
}
