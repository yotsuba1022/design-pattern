package idv.design.pattern.command.example4;

/**
 * @author Carl Lu
 */
public interface OperationApi {

    public int getResult();

    public void setResult(int result);

    public void add(int num);

    public void subtract(int num);

}
