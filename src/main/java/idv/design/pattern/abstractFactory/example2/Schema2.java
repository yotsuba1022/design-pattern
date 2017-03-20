package idv.design.pattern.abstractFactory.example2;

/**
 * @author Carl Lu
 */
public class Schema2 implements AbstractFactory {

    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }

}
