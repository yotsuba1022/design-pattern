package idv.design.pattern.observer.example2;

/**
 * @author Carl Lu
 */
public class Reader implements Observer {

    private String name;

    public void update(Subject subject){
        System.out.println(name + " got the news, content: " + ((NewsPaper) subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
