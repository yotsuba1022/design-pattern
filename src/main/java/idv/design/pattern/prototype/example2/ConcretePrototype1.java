package idv.design.pattern.prototype.example2;

/**
 * @author Carl Lu
 */
public class ConcretePrototype1 implements Prototype {

    public Prototype clone() {
        return new ConcretePrototype1();
    }

}
