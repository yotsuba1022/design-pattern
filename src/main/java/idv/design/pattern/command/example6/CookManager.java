package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public class CookManager {

    private static boolean dispatch = true;

    public static void dispatchCook() {
        if(dispatch) {
            dispatch = false;
            HotFoodCook cook1 = new HotFoodCook("Carl");
            HotFoodCook cook2 = new HotFoodCook("RuRu");
            HotFoodCook cook3 = new HotFoodCook("MoMo");

            Thread work = new Thread(cook1);
            work.start();
            Thread work2 = new Thread(cook2);
            work2.start();
            Thread work3 = new Thread(cook3);
            work3.start();
        }
    }

}
