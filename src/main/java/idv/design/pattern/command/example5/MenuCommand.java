package idv.design.pattern.command.example5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 * This is a macro command class.
 */
public class MenuCommand implements Command {

    private List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
