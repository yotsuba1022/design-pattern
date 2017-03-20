package idv.design.pattern.command.example5;

/**
 * @author Carl Lu
 */
public class PorkCommand implements Command {

    private CookApi cook = null;

    public void setCook(CookApi cook) {
        this.cook = cook;
    }

    public void execute() {
        this.cook.cook("Pork Steak");
    }

}
