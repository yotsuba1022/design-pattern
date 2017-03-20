package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public class MotherBoard implements Mediator {

    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private SoundCard soundCard = null;
    private VideoCard videoCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void changed(Colleage colleage) {
        if(colleage == cdDriver) {
            this.operateCDDriverReadData((CDDriver) colleage);
        } else if(colleage == cpu) {
            this.operateCpu((CPU) colleage);
        }
    }

    private void operateCDDriverReadData(CDDriver cdDriver) {
        String data = cdDriver.getData();
        this.cpu.executeData(data);
    }

    private void operateCpu(CPU cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }

}
