package idv.design.pattern.builder.example2;

/**
 * @author Carl Lu
 */
public class InsuranceContract {

    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String data;

    InsuranceContract(InsuranceContractBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.data = builder.getData();
    }

    @Override
    public String toString() {
        return "InsuranceContract{" +
                "contractId='" + contractId + '\'' +
                ", personName='" + personName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", data='" + data + '\'' +
                '}';
    }

}
