package idv.design.pattern.singleton.enumtype;

/**
 * @author Carl Lu
 */
public enum Singleton {

    /*
     * In "Effective Java", the author said that
     * "a single-element enum type is the best way to implement a singleton."
     *
     * The following line is also like:
     * "public final static Singleton uniqueInstance = new Singleton();"
     *
     */
    uniqueInstance;

    public void singletonOperation() {
        System.out.println("Singleton operation with instance: " + Singleton.uniqueInstance.hashCode());
    }

}
