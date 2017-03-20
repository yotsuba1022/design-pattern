package idv.design.pattern.factory.antifix;

/**
 * @author Carl Lu
 */
public class GraphicEditor {

    public static GraphicEditor getInstance() {
        GraphicEditor graphicEditor = new GraphicEditor();
        return graphicEditor;
    }

    /*
     * With the changes on Shape interface, here we can see that the GraphicEditor
     * only needs to obtain the Shape object and invoke the draw() method without
     * distinguishing which type of the shape is according to the type variable.
     * This is more abstract than the anti example and easy to maintain the code.
     */
    public void drawShape(Shape shape) {
        shape.draw();
    }

}
