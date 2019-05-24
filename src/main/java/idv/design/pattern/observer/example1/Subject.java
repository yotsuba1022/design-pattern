package idv.design.pattern.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    public void attach(final Observer observer) {
        observers.add(observer);
    }

    public void detach(final Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
