package idv.design.pattern.observer.example4;

/**
 * @author Carl Lu
 */
public class WaterQuality extends WaterQualitySubject {

    private int polluteLevel = 0;

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyWatchers();
    }

    @Override
    public void notifyWatchers() {
        for (WatcherObserver observer : observers) {
            if(this.polluteLevel >= 0) {
                if(observer.getJob().equals("Monitor")) {
                    observer.update(this);
                }
            }

            if(this.polluteLevel >= 1) {
                if(observer.getJob().equals("Security")) {
                    observer.update(this);
                }
            }

            if(this.polluteLevel >= 2) {
                if(observer.getJob().equals("Leader")) {
                    observer.update(this);
                }
            }
        }
    }

}
