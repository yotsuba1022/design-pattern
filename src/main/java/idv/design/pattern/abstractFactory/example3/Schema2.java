package idv.design.pattern.abstractFactory.example3;

/**
 * @author Carl Lu
 */
public class Schema2 implements AbstractFactory {

    public Object createProduct(int type) {
        Object object = null;
        if(type == 1) {
            object = new AMDCPU(939);
        } else if(type == 2) {
            object = new MSIMainboard(939);
        }
        return object;
    }

}
