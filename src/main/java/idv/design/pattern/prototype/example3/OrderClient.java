package idv.design.pattern.prototype.example3;

/**
 * @author Carl Lu
 */
public class OrderClient {

    public static void main(String argsp[]) {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setCustomerName("Carl");
        personalOrder.setProductId("P0001");
        personalOrder.setOrderProductNum(7878);

        OrderBusiness orderBusiness = new OrderBusiness();
        orderBusiness.saveOrder(personalOrder);
    }

}
