package idv.design.pattern.facade.example4;

/**
 * @author Carl Lu
 */
public class FacadeFactory {

    private FacadeFactory() {

    }

    public static FacadeApi createFacadeApi() {
        return new Facade();
    }

}
