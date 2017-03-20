package idv.design.pattern.simpleFactory.example2;

/**
 * Created by Carl on 2015/9/8.
 */
public abstract class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.callApi("With simple factory.");
    }

}
