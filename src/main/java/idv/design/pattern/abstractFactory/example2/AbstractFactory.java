package idv.design.pattern.abstractFactory.example2;

/**
 * @author Carl Lu
 */
public interface AbstractFactory {

    public CPUApi createCPUApi();

    public MainboardApi createMainboardApi();

}
