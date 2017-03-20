package idv.design.pattern.builder.example2;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        InsuranceContractBuilder builder = new InsuranceContractBuilder("001", 20160301l, 20160309l);
        InsuranceContract contract = builder
                .setCompanyName("Google")
                .setData("Insurance contract 1")
                .build();

        System.out.println(contract.toString());
    }

}
