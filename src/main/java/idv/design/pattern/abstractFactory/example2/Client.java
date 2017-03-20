package idv.design.pattern.abstractFactory.example2;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String argsp[]) {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema = new Schema1();
        engineer.makeComputer(schema);
    }

}
