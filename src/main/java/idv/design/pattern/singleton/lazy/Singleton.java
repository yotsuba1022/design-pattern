package idv.design.pattern.singleton.lazy;

/**
 * @author Carl Lu
 */
public class Singleton {

    /*
     * This is also called "optimistic lock singleton".
     */

    /*
     * Define a variable for saving instance that will be build.
     */
    private static Singleton uniqueInstance = null;

    /*
     * The constructor should be private so that we can control the instance number.
     */
    private Singleton() {

    }

    /*
     * Need to define a method for providing class instance to clients.
     * To ensure thread-safe, please add keyword synchronized in the method declaration.
     *
     * @return Singleton singleton instance
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void singletonOperation() {
        System.out.println("Do something here...");
    }

}
