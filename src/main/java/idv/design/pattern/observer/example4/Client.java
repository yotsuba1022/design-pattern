package idv.design.pattern.observer.example4;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        WaterQuality waterQuality = new WaterQuality();

        WatcherObserver watcher1 = new Watcher();
        watcher1.setJob("Monitor");

        WatcherObserver watcher2 = new Watcher();
        watcher2.setJob("Security");

        WatcherObserver watcher3 = new Watcher();
        watcher3.setJob("Leader");

        waterQuality.attach(watcher1);
        waterQuality.attach(watcher2);
        waterQuality.attach(watcher3);

        waterQuality.setPolluteLevel(0);
        waterQuality.setPolluteLevel(1);
        waterQuality.setPolluteLevel(2);
    }

}
