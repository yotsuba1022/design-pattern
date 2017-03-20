package idv.design.pattern.simpleFactory.example1;

/**
 * Created by Carl on 2015/9/8.
 */
public class ApiImpl implements Api {

    public void callApi(String s) {
        System.out.println("Output is: " + s);
    }

}
