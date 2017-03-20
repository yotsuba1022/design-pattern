package idv.design.pattern.observer.example2;

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
        reader3.setName("MaoMao");

        newsPaper.attach(reader1);
        newsPaper.attach(reader2);
        newsPaper.attach(reader3);

        newsPaper.setContent("Big News.");
    }

}
