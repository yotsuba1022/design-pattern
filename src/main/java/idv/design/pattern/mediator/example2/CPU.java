package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public class CPU extends Colleage {

    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData = "";
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        String[] dataSet = data.split(",");
        this.videoData = dataSet[0];
        this.soundData = dataSet[1];
        getMediator().changed(this);
    }

}
