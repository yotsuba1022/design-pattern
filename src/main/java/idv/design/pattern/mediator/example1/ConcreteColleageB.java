package idv.design.pattern.mediator.example1;

/**
 * @author Carl Lu
 */
public class ConcreteColleageB extends Colleague {

    public ConcreteColleageB(Mediator mediator) {
        super(mediator);
    }

    public void someOperation() {
        getMediator().changed(this);
    }

}
