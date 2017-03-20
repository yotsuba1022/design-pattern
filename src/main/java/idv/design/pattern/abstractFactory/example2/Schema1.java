package idv.design.pattern.abstractFactory.example2;

/**
 * @author Carl Lu
 */
public class Schema1 implements AbstractFactory {

    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }

}
