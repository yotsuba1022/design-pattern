package idv.design.pattern.observer.example3;

import java.util.Observable;

/**
 * @author Carl Lu
 */
public class NewsPaper extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // Must call this when changes happened.
        this.setChanged();
        //this.notifyObservers();
        this.notifyObservers("Attachment");
    }
}
