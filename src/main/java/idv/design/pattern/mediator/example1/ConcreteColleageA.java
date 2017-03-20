package idv.design.pattern.mediator.example1;

/**
 * @author Carl Lu
 */
public class ConcreteColleageA extends Colleague {

    public ConcreteColleageA(Mediator mediator) {
        super(mediator);
    }

    public void someOperation() {
        getMediator().changed(this);
    }

}
