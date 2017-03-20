package idv.design.pattern.builder.example3;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        InsuranceContract.InsuranceContractBuilder builder =
                new InsuranceContract.InsuranceContractBuilder("001", 20160301l, 20160309l);

        InsuranceContract contract = builder
                .setPersonName("Carl Lu")
                .setData("Personal insurance.")
                .build();

        System.out.println(contract.toString());
    }

}
