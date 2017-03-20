package idv.design.pattern.command.example3;

/**
 * @author Carl Lu
 */
public class MsiMainBoard implements MainBoardApi {

    public void open() {
        System.out.println("MSI main board booting...");
        System.out.println("Boot completed.");
    }

    public void reset() {
        System.out.println("MSI main board reset...");
        System.out.println("Reset completed.");
    }

}
