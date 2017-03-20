package idv.design.pattern.abstractFactory.example3;

/**
 * @author Carl Lu
 */
public class Schema1 implements AbstractFactory {

    public Object createProduct(int type) {
        Object object = null;
        if(type == 1) {
            object = new IntelCPU(1156);
        } else if(type == 2) {
            object = new GAMainboard(1156);
        }
        return object;
    }

}
