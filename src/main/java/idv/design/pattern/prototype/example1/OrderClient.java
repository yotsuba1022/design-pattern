package idv.design.pattern.prototype.example1;

/**
 * @author Carl Lu
 * Solution without pattern.
 */
public class OrderClient {

    public static void main(String args[]) {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(4567);
        personalOrder.setCustomerName("RuRu");
        personalOrder.setProductId("P0001");

        OrderBusiness orderBusiness = new OrderBusiness();
        orderBusiness.saveOrder(personalOrder);
    }

}
