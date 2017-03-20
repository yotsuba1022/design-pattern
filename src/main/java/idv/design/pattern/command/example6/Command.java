package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public interface Command {

    public void execute();

    public void setCookApi(CookApi cookApi);

    public int getTableNum();

}

