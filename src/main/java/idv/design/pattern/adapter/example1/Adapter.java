package idv.design.pattern.adapter.example1;

/**
 * @author Carl Lu
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        System.out.println("Call for new request.");
        adaptee.originalRequest();
    }

}
