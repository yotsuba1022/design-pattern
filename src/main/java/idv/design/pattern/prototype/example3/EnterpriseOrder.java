package idv.design.pattern.prototype.example3;

/**
 * @author Carl Lu
 */
public class EnterpriseOrder implements OrderApi {

    private String enterpriseName;
    private String productId;
    private int orderProductNum = 0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.enterpriseName);
        order.setProductId(productId);
        order.setOrderProductNum(orderProductNum);
        return order;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }

}
