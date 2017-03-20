package idv.design.pattern.command.example5;

/**
 * @author Carl Lu
 */
public class CoolFoodCook implements CookApi {

    public void cook(String name) {
        System.out.println("I'm now preparing cool food: " + name);
    }

}
