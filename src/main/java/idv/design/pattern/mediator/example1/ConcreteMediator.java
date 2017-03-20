package idv.design.pattern.mediator.example1;

/**
 * @author Carl Lu
 */
public class ConcreteMediator implements Mediator {

    private ConcreteColleageA colleageA;
    private ConcreteColleageB colleageB;

    public void setColleageA(ConcreteColleageA colleageA) {
        this.colleageA = colleageA;
    }

    public void setColleageB(ConcreteColleageB colleageB) {
        this.colleageB = colleageB;
    }

    public void changed(Colleague colleague) {
        // do something here...
    }

}
