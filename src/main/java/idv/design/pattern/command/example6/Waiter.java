package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public class Waiter {

    private MenuCommand menu = new MenuCommand();

    public void orderDish(Command dish) {
        menu.addCommand(dish);
    }

    public void orderDone() {
        menu.execute();
    }

}
