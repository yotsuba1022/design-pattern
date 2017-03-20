package idv.design.pattern.prototype.example6;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        PersonalOrder order = new PersonalOrder();
        Product product = new Product();
        product.setProductId("P01");
        product.setName("Item1");
        order.setCustomerName("Carl");
        order.setProduct(product);
        order.setOrderProductNum(120);
        System.out.println("Order before clone: " + order);

        PersonalOrder newOrder = new PersonalOrder();
        newOrder = (PersonalOrder) order.clone();
        newOrder.setOrderProductNum(90);
        newOrder.getProduct().setName("Item2");
        System.out.println("New order: " + newOrder);
        System.out.println("Order after clone: " + order);
    }

}
