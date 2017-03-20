package idv.design.pattern.observer.example2;

/**
 * @author Carl Lu
 */
public class NewsPaper extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }

}
