package idv.design.pattern.factory.example1;

/**
 * @author Carl Lu
 */
public abstract class Creator {

    protected abstract Product factoryMethod();

    public void operation() {
        Product product = factoryMethod();
    }

}
