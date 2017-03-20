package idv.design.pattern.observer.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public abstract class WaterQualitySubject {

    protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();

    public void attach(WatcherObserver observer) {
        observers.add(observer);
    }

    public void detach(WatcherObserver observer) {
        observers.remove(observer);
    }

    public abstract void notifyWatchers();

    public abstract int getPolluteLevel();

}
