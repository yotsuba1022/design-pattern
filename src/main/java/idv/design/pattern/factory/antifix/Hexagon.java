package idv.design.pattern.factory.antifix;

/**
 * @author Carl Lu
 */
public class Hexagon implements Shape {

    /*
     * So, when my boss told me to draw a hexagon,
     * I only need to create a new class here.
     * It's obviously that the refactor version is better than before.
     */
    public static Hexagon getInstance() {
        Hexagon hexagon = new Hexagon();
        return hexagon;
    }

    @Override
    public void draw() {
        System.out.println("Hexagon la~");
    }
}
