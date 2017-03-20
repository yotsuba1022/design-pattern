package idv.design.pattern.builder.example2;

/**
 * @author Carl Lu
 */
public class InsuranceContractBuilder {

    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String data;

    public InsuranceContractBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public InsuranceContract build() {
        if(contractId == null || contractId.trim().length() == 0) {
            throw new IllegalArgumentException(("Contract ID should be filled."));
        }
        boolean signPerson = personName != null && personName.trim().length() > 0;
        boolean signCompany = companyName != null && companyName.trim().length() > 0;
        if(signPerson && signCompany) {
            throw new IllegalArgumentException("A contract cannot be sign to a person and a company at the same time.");
        }
        if(signPerson == false && signCompany == false) {
            throw new IllegalArgumentException("A contract should be sign to a person or a company.");
        }
        if(beginDate <= 0) {
            throw new IllegalArgumentException("Begin date should be filled.");
        }
        if(endDate <= 0) {
            throw new IllegalArgumentException("End date should be filled.");
        }
        if(endDate <= beginDate) {
            throw new IllegalArgumentException("End date should grater than begin date.");
        }
        return new InsuranceContract(this);
    }

    public InsuranceContractBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public InsuranceContractBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public InsuranceContractBuilder setData(String data) {
        this.data = data;
        return this;
    }

    public String getContractId() {
        return contractId;
    }
    public String getPersonName() {
        return personName;
    }
    public String getCompanyName() {
        return companyName;
    }
    public long getBeginDate() {
        return beginDate;
    }
    public long getEndDate() {
        return endDate;
    }
    public String getData() {
        return data;
    }

}
