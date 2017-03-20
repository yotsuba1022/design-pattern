package idv.design.pattern.command.example3;

/**
 * @author Carl Lu
 */
public class ResetCommand implements Command {

    private MainBoardApi mainBoard = null;

    public ResetCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void execute() {
        mainBoard.reset();
    }

}
