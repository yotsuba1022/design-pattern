package idv.design.pattern.factory.example2;

/**
 * @author Carl Lu
 */
public class ExportDB implements ExportFileApi {

    public boolean export(String data) {
        System.out.println("Export data: " + data + " to DB.");
        return true;
    }

}
