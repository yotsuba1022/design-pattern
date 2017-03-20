package idv.design.pattern.singleton.enumtype;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton.uniqueInstance.singletonOperation();
        }
    }

}
