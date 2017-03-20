package idv.design.pattern.singleton.laztinitholder;

/**
 * @author Carl Lu
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    /*
     * An inner class that with no any binding relationship with outer class instance,
     * this class will be loaded only when invoked, so it can also reach the goal of lazy loading.
     */
    private static class SingletonHolder {
        /*
         * Initialize it statically and guaranteed thread safe by JVM
         */
        private static Singleton instance = new Singleton();
    }

}
