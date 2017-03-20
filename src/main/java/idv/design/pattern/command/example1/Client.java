package idv.design.pattern.command.example1;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.runCommand();
    }

}
