package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public class BeefCommand implements Command {

    private CookApi cookApi = null;
    private int tableNum;

    public BeefCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    public void execute() {
        this.cookApi.cook(tableNum, "Beef Steak");
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    public int getTableNum() {
        return tableNum;
    }

}
