package idv.design.pattern.command.example2;

/**
 * @author Carl Lu
 */
public class OpenCommand implements Command{

    private MainBoardApi mainBoardApi = null;

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    public void execute() {
        this.mainBoardApi.open();
    }

}
