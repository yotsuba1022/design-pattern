package idv.design.pattern.factory.example1;

/**
 * @author Carl Lu
 */
public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }

}
