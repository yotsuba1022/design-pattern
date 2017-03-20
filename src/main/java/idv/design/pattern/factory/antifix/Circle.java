package idv.design.pattern.factory.antifix;

/**
 * @author Carl Lu
 */
public class Circle implements Shape {

    public static Circle getInstance() {
        Circle circle = new Circle();
        return circle;
    }

    @Override
    public void draw() {
        System.out.println("Circle la~");
    }
}
