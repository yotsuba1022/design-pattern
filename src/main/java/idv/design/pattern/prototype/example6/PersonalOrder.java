package idv.design.pattern.prototype.example6;

/**
 * @author Carl Lu
 */
public class PersonalOrder implements OrderApi, Cloneable {

    private String customerName;
    private Product product;
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

    @Override
    public Object clone() {
        PersonalOrder obj = null;
        try {
            obj = (PersonalOrder) super.clone();
            obj.setProduct((Product) this.product.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
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
