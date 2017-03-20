package idv.design.pattern.factory.example2;

/**
 * @author Carl Lu
 */
public abstract class ExportOperate {

    protected abstract ExportFileApi factoryMethod();

    public boolean export(String data) {
        System.out.println("Some operation before export...");
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

}
