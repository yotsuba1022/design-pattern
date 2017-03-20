package idv.design.pattern.prototype.example7;

/**
 * @author Carl Lu
 */
public class ConcretePrototype2 implements Prototype {

    private String name;

    public Prototype clone() {
        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "name='" + name + '\'' +
                '}';
    }

}
