package idv.design.pattern.abstractFactory.example1;

/**
 * @author Carl Lu
 */
public class ConcreteFactory2 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }

}
