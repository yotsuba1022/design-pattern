package idv.design.pattern.abstractFactory.example3;

/**
 * @author Carl Lu
 */
public class ComputerEngineer {

    private CPUApi cpu = null;
    private MainboardApi mainboard = null;
    private MemoryApi memory = null;

    public void makeComputer(AbstractFactory schema) {
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema) {
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainboard = (MainboardApi) schema.createProduct(2);
        this.memory = (MemoryApi) schema.createProduct(3);

        this.cpu.calculate();
        this.mainboard.installCPU();
        if(memory != null) {
            this.memory.cacheData();
        }
    }

}
