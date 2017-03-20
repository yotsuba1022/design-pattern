package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public class VideoCard extends Colleage {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("Show data: " + data);
    }

}
