package idv.design.pattern.command.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Calculator {

    //stack
    private List<Command> undoCommands = new ArrayList<Command>();
    private List<Command> redoCommands = new ArrayList<Command>();

    private Command addCommand = null;
    private Command subtractCommand = null;

    public void setAddCommand(Command addCommand) {
        this.addCommand = addCommand;
    }

    public void setSubtractCommand(Command subtractCommand) {
        this.subtractCommand = subtractCommand;
    }

    public void addPressed() {
        this.addCommand.execute();
        undoCommands.add(this.addCommand);
    }

    public void subtractPressed() {
        this.subtractCommand.execute();
        undoCommands.add(this.subtractCommand);
    }

    public void undoPressed() {
        if(this.undoCommands.size() > 0) {
            Command command = this.undoCommands.get(this.undoCommands.size() - 1);
            command.undo();
            this.redoCommands.add(command);
            this.undoCommands.remove(command);
        } else {
            System.out.println("There has no any command for undo operation.");
        }
    }

    public void redoPressed() {
        if(this.redoCommands.size() > 0) {
            Command command = this.redoCommands.get(this.redoCommands.size() - 1);
            command.execute();
            this.undoCommands.add(command);
            this.redoCommands.remove(command);
        } else {
            System.out.println("There has no any command for redo operation.");
        }
    }

}
