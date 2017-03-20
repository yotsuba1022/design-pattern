package idv.design.pattern.abstractFactory.example1;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        abstractFactory.createProductA();
        abstractFactory.createProductB();
    }

}
