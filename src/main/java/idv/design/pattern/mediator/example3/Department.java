package idv.design.pattern.mediator.example3;

/**
 * @author Carl Lu
 */
public class Department {

    private String departmentId;
    private String departmentName;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public boolean deleteDepartment() {
        DepartmentUserMediatorImpl mediator = DepartmentUserMediatorImpl.getInstance();
        mediator.deleteDepartment(departmentId);
        return true;
    }

}
