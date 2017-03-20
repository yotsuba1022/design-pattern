package idv.design.pattern.adapter.example3;

/**
 * @author Carl Lu
 */
public class TimeUtil {
    private long start;
    private long end;

    public void begin() {
        start = System.currentTimeMillis();
    }

    public void end() {
        end = System.currentTimeMillis();
    }

    public void costTime() {
        System.out.println("Cost: " + (end - start));
    }
}
