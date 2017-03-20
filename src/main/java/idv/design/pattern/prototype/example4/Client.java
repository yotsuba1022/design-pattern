package idv.design.pattern.prototype.example4;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName("Carl");
        order.setProductId("P001");
        order.setOrderProductNum(100);
        System.out.println("Order before clone: " + order);

        PersonalOrder newOrder = (PersonalOrder) order.clone();
        newOrder.setOrderProductNum(120);
        System.out.println("New order: " + newOrder);
        System.out.println("Order after clone: " + order);
    }

}
