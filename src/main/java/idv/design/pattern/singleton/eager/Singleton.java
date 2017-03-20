package idv.design.pattern.singleton.eager;

/**
 * @author Carl Lu
 */
public class Singleton {
    /**
     * This is also called "pessimistic lock singleton".
     */

    /**
     * Define a variable for saving instance, new the instance here.
     * The JVM will guarantee that the class will be instantiated for only one time,
     * so this way is thread-safe.
     */
    private static final Singleton uniqueInstance = new Singleton();

    /**
     * The constructor should be private so that we can control the instance number.
     */
    private Singleton() {

    }

    /**
     * Need to define a method for providing class instance to clients.
     * 
     * @return
     */
    public static Singleton getInstance() {
        return uniqueInstance;
    }

}
