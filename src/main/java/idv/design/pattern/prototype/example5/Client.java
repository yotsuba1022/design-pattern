package idv.design.pattern.prototype.example5;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String argsp[]) {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName("Carl");
        order.setOrderProductNum(150);
        Product product = new Product();
        product.setName("Item1");
        product.setProductId("P1");
        order.setProduct(product);
        System.out.println("Order before clone: " + order);

        PersonalOrder newOrder = new PersonalOrder();
        newOrder = (PersonalOrder) order.cloneOrder();
        newOrder.setOrderProductNum(100);
        newOrder.getProduct().setName("Item2");
        System.out.println("New order: " + newOrder);
        System.out.println("Order after clone: " + order);
    }

}
