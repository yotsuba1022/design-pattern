package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public class SoundCard extends Colleage {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("Sound data: " + data);
    }

}
