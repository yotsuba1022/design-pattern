package idv.design.pattern.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
