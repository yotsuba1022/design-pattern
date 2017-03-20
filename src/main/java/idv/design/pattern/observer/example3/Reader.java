package idv.design.pattern.observer.example3;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Carl Lu
 */
public class Reader implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(Observable o, Object obj) {
        System.out.println(name + " got msg via push mode, obj: " + obj);
        System.out.println(name + " got msg via pull mode, obj: " + ((NewsPaper)o).getContent());
    }

}
