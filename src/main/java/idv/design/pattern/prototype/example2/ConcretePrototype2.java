package idv.design.pattern.prototype.example2;

/**
 * @author Carl Lu
 */
public class ConcretePrototype2 implements Prototype {

    public Prototype clone() {
        return new ConcretePrototype2();
    }

}
