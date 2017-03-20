package idv.design.pattern.factory.example2;

/**
 * @author Carl Lu
 */
public class ExportTxtFile implements ExportFileApi {

    public boolean export(String data) {
        System.out.println("Export data: " + data + " to txt file.");
        return true;
    }

}
