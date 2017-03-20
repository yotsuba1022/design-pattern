package idv.design.pattern.prototype.example3;

/**
 * @author Carl Lu
 */
public class OrderBusiness {

    private static final int MAX_ORDER_NUM = 1000;

    public void saveOrder(OrderApi order) {
        while (order.getOrderProductNum() > MAX_ORDER_NUM) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(MAX_ORDER_NUM);
            System.out.println("Separate a new order: " + newOrder);
            order.setOrderProductNum(order.getOrderProductNum() - MAX_ORDER_NUM);
        }
        System.out.print("Order: " + order);
    }

}
