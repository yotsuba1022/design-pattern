package idv.design.pattern.simpleFactory.example3;

import idv.design.pattern.simpleFactory.example3.Api;

/**
 * Created by Carl on 2015/9/8.
 */
public class ApiImpl1 implements Api {

    public void callApi(String s) {
        System.out.println("The content from impl1 is: " + s);
    }

}
