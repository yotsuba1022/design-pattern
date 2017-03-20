package idv.design.pattern.simpleFactory.example3;

/**
 * Created by Carl on 2015/9/9.
 */
public class Client {

    public static void main(String[] args) {

        Api api = Factory.createApi();

        api.callApi("Case for loading properties file.");

    }

}
