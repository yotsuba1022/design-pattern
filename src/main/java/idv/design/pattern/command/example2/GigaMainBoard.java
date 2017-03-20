package idv.design.pattern.command.example2;

/**
 * @author Carl Lu
 */
public class GigaMainBoard implements MainBoardApi {

    public void open() {
        System.out.println("Giga main board booting...");
        System.out.println("Boot completed.");
    }

}
