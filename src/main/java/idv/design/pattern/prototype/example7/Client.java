package idv.design.pattern.prototype.example7;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        try {
            Prototype prototype1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("Prototype1", prototype1);

            Prototype prototype3 = PrototypeManager.getPrototype("Prototype1").clone();
            prototype3.setName("P3");
            System.out.println("Prototype3 from cache: " + prototype3);

            Prototype prototype2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("Prototype1", prototype2);

            Prototype prototype4 = PrototypeManager.getPrototype("Prototype1").clone();
            prototype4.setName("P4");
            System.out.println("Prototype4 from cache: " + prototype4);

            PrototypeManager.removePrototype("Prototype1");

            Prototype prototype5 = PrototypeManager.getPrototype("Prototype1").clone();
            prototype5.setName("P5");
            System.out.println("Prototype5 from cache: " + prototype5);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
