package idv.design.pattern.command.example5;

/**
 * @author Carl Lu
 */
public class HotFoodCook implements CookApi {

    public void cook(String name) {
        System.out.println("I'm now cooking: " + name);
    }

}
