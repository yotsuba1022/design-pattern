package idv.design.pattern.command.example4;

/**
 * @author Carl Lu
 */
public class AddCommand implements Command {

    private OperationApi operation = null;

    private int num;

    public AddCommand(OperationApi operation, int num) {
        this.operation = operation;
        this.num = num;
    }

    public void execute() {
        this.operation.add(num);
    }

    public void undo() {
        this.operation.subtract(num);
    }

}
