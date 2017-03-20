package idv.design.pattern.command.example2;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        MainBoardApi mainBoard = new GigaMainBoard();
        Command openCommand = new OpenCommand(mainBoard);

        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openButtonPressed();
    }

}
