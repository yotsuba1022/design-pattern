package idv.design.pattern.factory.antifix;

/**
 * @author Carl Lu
 */
public class Rectangle implements Shape {

    public static Rectangle getInstance() {
        Rectangle rectangle = new Rectangle();
        return rectangle;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle la~");
    }
}
