package idv.design.pattern.observer.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Subject {

    private List<Observer> readers = new ArrayList<Observer>();

    public void attach(Observer reader) {
        readers.add(reader);
    }

    public void detach(Observer reader) {
        readers.remove(reader);
    }

    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }

}
