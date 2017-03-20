package idv.design.pattern.prototype.example1;

/**
 * @author Carl Lu
 */
public class OrderBusiness {

    private static final int MAX_ORDER_NUM = 1000;

    public void saveOrder(OrderApi order) {
        while(order.getOrderProductNum() > MAX_ORDER_NUM) {
            OrderApi newOrder = null;

            if(order instanceof PersonalOrder) {
                PersonalOrder newPersonalOrder = new PersonalOrder();
                PersonalOrder personalOrder = (PersonalOrder) order;
                newPersonalOrder.setCustomerName(personalOrder.getCustomerName());
                newPersonalOrder.setProductId(personalOrder.getProductId());
                newPersonalOrder.setOrderProductNum(MAX_ORDER_NUM);
                newOrder = newPersonalOrder;
            } else if(order instanceof EnterpriseOrder) {
                EnterpriseOrder newEnterpriseOrder = new EnterpriseOrder();
                EnterpriseOrder enterpriseOrder = (EnterpriseOrder)order;
                newEnterpriseOrder.setEnterpriseName(enterpriseOrder.getEnterpriseName());
                newEnterpriseOrder.setProductId(enterpriseOrder.getProductId());
                newEnterpriseOrder.setOrderProductNum(MAX_ORDER_NUM);
                newOrder = newEnterpriseOrder;
            }

            order.setOrderProductNum(order.getOrderProductNum() - MAX_ORDER_NUM);

            System.out.println("Separate a new order: " + newOrder);
        }

        System.out.print("Order: " + order);
    }

}
