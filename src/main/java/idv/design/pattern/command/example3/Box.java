package idv.design.pattern.command.example3;

/**
 * @author Carl Lu
 */
public class Box {

    private Command openCommand;
    private Command resetCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }

    public void resetButtonPressed() {
        resetCommand.execute();
    }

}
