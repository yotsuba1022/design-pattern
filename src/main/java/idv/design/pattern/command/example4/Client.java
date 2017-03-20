package idv.design.pattern.command.example4;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String argsp[]) {
        OperationApi operation = new Operation();
        AddCommand addCommand = new AddCommand(operation, 5);
        SubtractCommand subtractCommand = new SubtractCommand(operation, 3);

        Calculator calculator = new Calculator();
        calculator.setAddCommand(addCommand);
        calculator.setSubtractCommand(subtractCommand);

        calculator.addPressed();
        System.out.println("Add button pressed, result is: " + operation.getResult());
        calculator.subtractPressed();
        System.out.println("Subtract button pressed, result is: " + operation.getResult());

        calculator.undoPressed();
        System.out.println("Undo button pressed, result is: " + operation.getResult());
        calculator.undoPressed();
        System.out.println("Undo button pressed, result is: " + operation.getResult());

        calculator.redoPressed();
        System.out.println("Redo button pressed, result is: " + operation.getResult());
        calculator.redoPressed();
        System.out.println("Redo button pressed, result is: " + operation.getResult());
    }

}
