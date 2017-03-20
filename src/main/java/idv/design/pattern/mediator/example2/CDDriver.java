package idv.design.pattern.mediator.example2;

/**
 * @author Carl Lu
 */
public class CDDriver extends Colleage {

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData() {
        return data;
    }

    public void readCD() {
        this.data = "Design Pattern,Very important";
        getMediator().changed(this);
    }

}
