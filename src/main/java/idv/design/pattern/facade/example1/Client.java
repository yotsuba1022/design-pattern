package idv.design.pattern.facade.example1;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String[] args) {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }

}
