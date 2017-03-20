package idv.design.pattern.command.example5;

/**
 * @author Carl Lu
 */
public class Waiter {

    private MenuCommand menu = new MenuCommand();

    public void orderDish(Command dish) {
        CookApi hotFoodCook = new HotFoodCook();
        CookApi coolFoodCook = new CoolFoodCook();

        if(dish instanceof BeefCommand) {
            ((BeefCommand) dish).setCook(hotFoodCook);
        } else if(dish instanceof PorkCommand) {
            ((PorkCommand) dish).setCook(hotFoodCook);
        } else if(dish instanceof SaladCommand) {
            ((SaladCommand) dish).setCook(coolFoodCook);
        }

        menu.addCommand(dish);
    }

    public void orderDone() {
        this.menu.execute();
    }

}
