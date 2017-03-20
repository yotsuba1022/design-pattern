package idv.design.pattern.builder.example3;

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

    private InsuranceContract(InsuranceContractBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.data = builder.data;
    }

    public static class InsuranceContractBuilder {

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
