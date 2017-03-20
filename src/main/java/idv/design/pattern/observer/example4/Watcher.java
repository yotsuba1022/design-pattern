package idv.design.pattern.observer.example4;

/**
 * @author Carl Lu
 */
public class Watcher implements WatcherObserver {

    private String job;

    public void update(WaterQualitySubject subject) {
        System.out.println(job + " received the report, the pollute level is: " + subject.getPolluteLevel());
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
