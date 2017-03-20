package idv.design.pattern.factory.example2;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        ExportOperate exportOperate = new ExportTxtFileOperate();
        exportOperate.export("Test Data");
    }

}
