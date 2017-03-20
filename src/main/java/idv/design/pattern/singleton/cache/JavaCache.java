package idv.design.pattern.singleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class JavaCache {

    private Map<String, Object> map = new HashMap<String, Object>();

    public Object getValues(String key) {
        Object object = map.get(key);
        if(object == null) {
            object = key + ", value";
            map.put(key, object);
        }
        return object;
    }

}
