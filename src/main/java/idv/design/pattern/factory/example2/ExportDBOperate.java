package idv.design.pattern.factory.example2;

/**
 * @author Carl Lu
 */
public class ExportDBOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }

}
