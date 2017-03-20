package idv.design.pattern.command.example6;

/**
 * @author Carl Lu
 */
public class HotFoodCook implements CookApi, Runnable {

    private String cookName;

    public HotFoodCook(String cookName) {
        this.cookName = cookName;
    }

    public void cook(int tableNum, String dishName) {
        int cookTime = (int) (20 * Math.random());
        System.out.println(cookName + " is now cooking " + dishName + " for table " + tableNum + ".");
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cookName + " has finished cook " + dishName + " for table " + tableNum + ", cost " + cookTime + " min.");
    }

    public void run() {
        while (true) {
            try {
                Command command = CommandQueue.getCommand();
                if(command != null) {
                    command.setCookApi(this);
                    command.execute();
                } else {
                    Thread.sleep(5000l);
                    if(CommandQueue.getOrderNumber() == 0) {
                        System.out.println(cookName + " is get off the work now.");
                        break;
                    }
                }
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
