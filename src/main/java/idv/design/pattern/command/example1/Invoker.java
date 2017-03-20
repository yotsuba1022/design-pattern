package idv.design.pattern.command.example1;

/**
 * @author Carl Lu
 */
public class Invoker {

    private Command command = null;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }

}
