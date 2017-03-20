package idv.design.pattern.facade.example4;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String[] args) {
        FacadeApi facade = FacadeFactory.createFacadeApi();
        facade.generate();
    }

}
