package idv.design.pattern.facade.example3;

/**
 * @author Carl Lu
 */
public class Facade {

    private Facade() {

    }

    public static void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }

}
