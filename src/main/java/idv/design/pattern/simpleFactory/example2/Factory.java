package idv.design.pattern.simpleFactory.example2;

/**
 * Created by Carl on 2015/9/8.
 */
public class Factory {

    public static Api createApi(int condition) {

        Api api = null;
        if(condition == 1) {
            api = new ApiImpl1();
        } else if(condition == 2) {
            api = new ApiImpl2();
        }
        return api;

    }

}
