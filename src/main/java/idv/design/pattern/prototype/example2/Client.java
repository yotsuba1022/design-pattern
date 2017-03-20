package idv.design.pattern.prototype.example2;

/**
 * @author Carl Lu
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        Prototype newPrototype = prototype.clone();
    }

}
