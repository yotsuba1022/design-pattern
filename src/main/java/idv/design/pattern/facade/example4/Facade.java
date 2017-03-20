package idv.design.pattern.facade.example4;

/**
 * @author Carl Lu
 */
public class Facade implements FacadeApi {

    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }

}
