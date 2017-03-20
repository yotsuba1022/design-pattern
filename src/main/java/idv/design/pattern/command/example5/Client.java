package idv.design.pattern.command.example5;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        Waiter waiter = new Waiter();

        Command beef = new BeefCommand();
        Command pork = new PorkCommand();
        Command salad = new SaladCommand();

        waiter.orderDish(beef);
        waiter.orderDish(pork);
        waiter.orderDish(salad);

        waiter.orderDone();
    }

}
