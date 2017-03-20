package idv.design.pattern.command.example2;

/**
 * @author Carl Lu
 */
public class Box {

    private Command openCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }

}
