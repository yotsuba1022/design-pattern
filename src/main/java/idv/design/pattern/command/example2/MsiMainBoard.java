package idv.design.pattern.command.example2;

/**
 * @author Carl Lu
 */
public class MsiMainBoard implements MainBoardApi {

    public void open() {
        System.out.println("Msi main board booting...");
        System.out.println("Boot completed.");
    }

}
