package idv.design.pattern.command.example3;

/**
 * @author Carl Lu
 */
public class OpenCommand implements Command {

    private MainBoardApi mainBoard = null;

    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void execute() {
        mainBoard.open();
    }

}
