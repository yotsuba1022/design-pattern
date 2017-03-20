package idv.design.pattern.factory.anti;

/**
 * @author Carl Lu
 */
/*
 * I think this class should be declared as an interface
 * and don't need to declare the type variable, since
 * with polymorphism, we can only invoke the specific method
 * on the interface if we offer the correct concrete type object.
 */
public class Shape {
    int type;
}
