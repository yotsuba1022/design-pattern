package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        MotherBoard motherBoard = new MotherBoard();
        CDDriver cdDriver = new CDDriver(motherBoard);
        CPU cpu = new CPU(motherBoard);
        VideoCard videoCard = new VideoCard(motherBoard);
        SoundCard soundCard = new SoundCard(motherBoard);

        motherBoard.setCdDriver(cdDriver);
        motherBoard.setCpu(cpu);
        motherBoard.setVideoCard(videoCard);
        motherBoard.setSoundCard(soundCard);

        cdDriver.readCD();
    }

}
