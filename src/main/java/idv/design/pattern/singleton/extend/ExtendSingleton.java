package idv.design.pattern.singleton.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class ExtendSingleton {

    /*
     * The essence of singleton pattern is to "Control the number of instance."
     * So, to extend this concept, imagine that you need to develop a component
     * that the number of the component instance can be controlled by you in the class.
     * To fulfill this functionality, we can combine the concept of:
     *
     *      1. Singleton pattern
     *      2. Cache mechanism
     *
     */

    private static final String DEFAULT_KEY = "Cache";

    /*
     * The max number of the instance.
     */
    private final static int MAX_INSTANCE_NUM = 3;

    /*
     * This variable is for counting the current number of the instance.
     */
    private static int currentInstanceNumber = 1;

    private static Map<String, ExtendSingleton> map = new HashMap<String, ExtendSingleton>();

    private ExtendSingleton() {

    }

    public static ExtendSingleton getInstance() {
        String key = DEFAULT_KEY + currentInstanceNumber;
        ExtendSingleton singleton = map.get(key);
        if (singleton == null) {
            singleton = new ExtendSingleton();
            map.put(key, singleton);
        }

        currentInstanceNumber++;
        if (currentInstanceNumber > MAX_INSTANCE_NUM) {
            currentInstanceNumber = 1;
        }

        return singleton;
    }

}
