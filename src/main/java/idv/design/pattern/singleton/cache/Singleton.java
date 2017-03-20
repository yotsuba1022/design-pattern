package idv.design.pattern.singleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class Singleton {

    private static final String DEFAULT_KEY = "One";

    private static Map<String, Singleton> map = new HashMap<String, Singleton>();

    private Singleton() {

    }

    public static Singleton getInstance() {
        Singleton instance = (Singleton)map.get(DEFAULT_KEY);
        if(instance == null) {
            instance = new Singleton();
            map.put(DEFAULT_KEY, instance);
        }
        return instance;
    }

}
