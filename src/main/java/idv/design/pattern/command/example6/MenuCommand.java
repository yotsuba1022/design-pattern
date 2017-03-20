package idv.design.pattern.command.example6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class MenuCommand implements Command {

    private List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void execute() {
        CommandQueue.addMenu(this);
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void setCookApi(CookApi cookApi) {

    }

    public int getTableNum() {
        return 0;
    }

}
