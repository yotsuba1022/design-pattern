package idv.design.pattern.singleton.doublecheck;

/**
 * @author Carl Lu
 */
public class Singleton {

    /*
     * With volatile, the variable value will not be cached by local thread,
     * all the read/write operations are against the shared memory so that
     * we can ensure threads can handle the variable properly.
     *
     * This pattern is also called "DCL".
     */
    private volatile static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        // First check
        if (instance == null) {
            synchronized (Singleton.class) {
                // Second check
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
