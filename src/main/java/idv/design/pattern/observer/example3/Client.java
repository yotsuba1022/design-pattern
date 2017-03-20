package idv.design.pattern.observer.example3;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        NewsPaper newsPaper = new NewsPaper();

        Reader reader1 = new Reader();
        reader1.setName("Carl");

        Reader reader2 = new Reader();
        reader2.setName("RuRu");

        Reader reader3 = new Reader();
        reader3.setName("MoMo");

        newsPaper.addObserver(reader1);
        newsPaper.addObserver(reader2);
        newsPaper.addObserver(reader3);

        newsPaper.setContent("Observer Pattern.");
    }

}
