package idv.design.pattern.prototype.example3;

/**
 * @author Carl Lu
 */
public interface OrderApi {

    public int getOrderProductNum();

    public void setOrderProductNum(int orderProductNum);

    public OrderApi cloneOrder();

}
