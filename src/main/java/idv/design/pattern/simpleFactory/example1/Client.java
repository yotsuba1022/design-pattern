package idv.design.pattern.simpleFactory.example1;

/**
 * Created by Carl on 2015/9/8.
 */
public class Client {

    public static void main(String[] args) {
        Api api = new ApiImpl();
        api.callApi("Not simple factory.");
    }

}
