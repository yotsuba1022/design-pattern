package idv.design.pattern.command.example3;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        ResetCommand resetCommand = new ResetCommand(mainBoard);
        Box box = new Box();

        box.setOpenCommand(openCommand);
        box.setResetCommand(resetCommand);
        box.resetButtonPressed();
        box.openButtonPressed();

        // Set with wrong command...
        box.setOpenCommand(resetCommand);
        box.setResetCommand(openCommand);
        box.resetButtonPressed();
        box.openButtonPressed();
    }

}
