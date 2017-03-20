package idv.design.pattern.factory.antifix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Client {

    /*
     * With those refactoring, I think the client is cleaner than before.
     */
    public static void main(String args[]) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(Circle.getInstance());
        shapes.add(Rectangle.getInstance());
        // And the boss told me to draw a new shape...
        shapes.add(Hexagon.getInstance());

        GraphicEditor graphicEditor = GraphicEditor.getInstance();

        shapes.stream().forEach(shape -> graphicEditor.drawShape(shape));
    }

}
