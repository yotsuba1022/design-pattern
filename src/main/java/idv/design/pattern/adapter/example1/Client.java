package idv.design.pattern.adapter.example1;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }

}
