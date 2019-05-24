package idv.design.pattern.observer.example1;

/**
 * @author Carl Lu
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(final String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }

}
