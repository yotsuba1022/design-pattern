package idv.design.pattern.observer.example1;

/**
 * @author Carl Lu
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    public void update(Subject subject) {
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }

}
