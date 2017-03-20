package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        CookManager.dispatchCook();
        for (int i = 1; i <= 5 ; i++) {
            Waiter waiter = new Waiter();
            Command beef = new BeefCommand(i);
            Command fish = new FishCommand(i);
            waiter.orderDish(beef);
            waiter.orderDish(fish);
            waiter.orderDone();
        }
    }

}
