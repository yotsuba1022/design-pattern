package idv.design.pattern.factory.antifix;

/**
 * @author Carl Lu
 */
public interface Shape {

    /*
     * In comparison with the anti example, here I declared the Shape as an interface and add a draw
     * method signature here so that all the sub class that implement this interface should
     * also implement this method. With this, other class can only invoke the draw on the Shape
     * interface, which satisfy the rule "code on interface".
     */
    void draw();

}
