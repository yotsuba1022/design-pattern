package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public class FishCommand implements Command {

    private CookApi cookApi = null;
    private int tableNum;

    public FishCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    public void execute() {
        this.cookApi.cook(tableNum, "Fish Steak");
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    public int getTableNum() {
        return tableNum;
    }

}
