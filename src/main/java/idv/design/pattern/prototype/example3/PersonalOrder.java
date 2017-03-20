package idv.design.pattern.prototype.example3;

/**
 * @author Carl Lu
 */
public class PersonalOrder implements OrderApi {

    private String customerName;
    private String productId;
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(customerName);
        order.setProductId(productId);
        order.setOrderProductNum(orderProductNum);
        return order;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }

}
