package idv.design.pattern.command.example4;

/**
 * @author Carl Lu
 */
public class SubtractCommand implements Command {

    private OperationApi operation = null;

    private int num;

    public SubtractCommand(OperationApi operation, int num) {
        this.operation = operation;
        this.num = num;
    }

    public void execute() {
        this.operation.subtract(num);
    }

    public void undo() {
        this.operation.add(num);
    }

}
