package idv.design.pattern.command.example6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class CommandQueue {

    private static List<Command> commands = new ArrayList<Command>();

    public static synchronized int getOrderNumber() {
        return commands.size();
    }

    public synchronized static void addMenu(MenuCommand menu) {
        for (Command command : menu.getCommands()) {
            commands.add(command);
        }
    }

    public synchronized static Command getCommand() {
        Command command = null;

        if(commands.size() > 0) {
            command = commands.get(0);
            commands.remove(0);
        }

        return command;
    }

}
