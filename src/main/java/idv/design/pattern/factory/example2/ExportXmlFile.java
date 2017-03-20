package idv.design.pattern.factory.example2;

/**
 * @author Carl Lu
 */
public class ExportXmlFile implements ExportFileApi {

    public boolean export(String data) {
        System.out.println("Export data: " + data + " to xml file.");
        return true;
    }

}
