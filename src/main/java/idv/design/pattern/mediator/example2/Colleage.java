package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public abstract class Colleage {

    private Mediator mediator;

    public Colleage(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

}
