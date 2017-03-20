package idv.design.pattern.abstractFactory.example3;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String argsp[]) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory schema = new Schema3();
        computerEngineer.makeComputer(schema);
    }

}
