package idv.design.pattern.observer.example1;

/**
 * @author Carl Lu
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    public void update(final Subject subject) {
        observerState = ( (ConcreteSubject) subject ).getSubjectState();
    }

    public String getObserverState() {
        return observerState;
    }

}
