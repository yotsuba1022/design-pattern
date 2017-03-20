package idv.design.pattern.simpleFactory.example3;

/**
 * Created by Carl on 2015/9/8.
 */
public class Factory {

    public static Api createApi() {

        Api api = null;
        try {
            api = (Api) Class.forName("idv.design.pattern.simpleFactory.example3.ApiImpl2").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return api;

    }

}
