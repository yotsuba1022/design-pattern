package idv.design.pattern.observer.example4;

/**
 * @author Carl Lu
 */
public interface WatcherObserver {

    public void update(WaterQualitySubject subject);

    public void setJob(String job);

    public String getJob();

}
