package idv.design.pattern.prototype.example5;

/**
 * @author Carl Lu
 */
public class PersonalOrder implements OrderApi {

    private String customerName;
    private Product product = null;
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setOrderProductNum(this.orderProductNum);
        order.setProduct((Product) this.product.cloneProduct());
        return order;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", product=" + product +
                ", orderProductNum=" + orderProductNum +
                '}';
    }

}
