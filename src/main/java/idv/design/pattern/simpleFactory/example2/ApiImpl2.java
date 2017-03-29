package idv.design.pattern.simpleFactory.example2;

/**
 * Created by Carl on 2015/9/8.
 */
public class ApiImpl2 implements Api {

    public void callApi(String s) {
        System.out.println("The content from impl2 is: " + s);
    }

}
