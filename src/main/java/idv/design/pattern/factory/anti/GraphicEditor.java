package idv.design.pattern.factory.anti;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class GraphicEditor {

    public static void main(String args[]) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle());
        list.add(new Circle());

        for (Shape s : list) {
            // I think it's a bad idea to new a GraphicEditor instance in each iteration.
            new GraphicEditor().drawShape(s);
        }

    }

    /*
     * Point.1
     * I think we should not select the concrete implementation of the drawXXX method here,
     * since the responsibility of which shape to draw should belongs to each type of shape.
     * Also, we should "code on interface", which means that we should only invoke a
     * general method such as "draw" on the Shape interface.
     */
    public void drawShape(Shape s) {
        if (s.type == 1)
            drawRectangle((Rectangle) s);
        else if (s.type == 2)
            drawCircle((Circle) s);
    }

    /*
     * According to Point.1, I think the drawCircle method and drawRectangle
     * method should be extract to the shape type they belongs to.
     */
    public void drawCircle(Circle r) {
        System.out.println("Circle la~");
    }

    public void drawRectangle(Rectangle r) {
        System.out.println("Rectangle la~");
    }
}
