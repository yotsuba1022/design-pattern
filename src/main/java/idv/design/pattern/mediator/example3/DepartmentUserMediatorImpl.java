package idv.design.pattern.mediator.example3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Carl Lu
 */
public class DepartmentUserMediatorImpl {

    private static DepartmentUserMediatorImpl mediator = new DepartmentUserMediatorImpl();

    private DepartmentUserMediatorImpl() {
        initTestData();
    }

    public static DepartmentUserMediatorImpl getInstance() {
        return mediator;
    }

    private Collection<DepartmentUserModel> departmentUserModelCollection = new ArrayList<DepartmentUserModel>();

    private void initTestData() {
        DepartmentUserModel model1 = new DepartmentUserModel();
        model1.setDepartmentUserId("du1");
        model1.setDepartmentId("d1");
        model1.setUserId("u1");
        departmentUserModelCollection.add(model1);

        DepartmentUserModel model2 = new DepartmentUserModel();
        model2.setDepartmentUserId("du2");
        model2.setDepartmentId("d1");
        model2.setUserId("u2");
        departmentUserModelCollection.add(model2);

        DepartmentUserModel model3 = new DepartmentUserModel();
        model3.setDepartmentUserId("du3");
        model3.setDepartmentId("d2");
        model3.setUserId("u3");
        departmentUserModelCollection.add(model3);

        DepartmentUserModel model4 = new DepartmentUserModel();
        model4.setDepartmentUserId("du4");
        model4.setDepartmentId("d2");
        model4.setUserId("u4");
        departmentUserModelCollection.add(model4);

        DepartmentUserModel model5 = new DepartmentUserModel();
        model5.setDepartmentUserId("du5");
        model5.setDepartmentId("d2");
        model5.setUserId("u1");
        departmentUserModelCollection.add(model5);
    }

    public boolean deleteDepartment(String departmentId) {
        Collection<DepartmentUserModel> tempCollection = new ArrayList<DepartmentUserModel>();
        for (DepartmentUserModel model : departmentUserModelCollection) {
            if(model.getDepartmentId().equals(departmentId)) {
                tempCollection.add(model);
            }
        }
        departmentUserModelCollection.removeAll(tempCollection);
        return true;
    }

    public boolean deleteUser(String userId) {
        Collection<DepartmentUserModel> tempCollection = new ArrayList<DepartmentUserModel>();
        for (DepartmentUserModel model : departmentUserModelCollection) {
            if(model.getUserId().equals(userId)) {
                tempCollection.add(model);
            }
        }
        departmentUserModelCollection.removeAll(tempCollection);
        return true;
    }

    public void showDepartmentUsers(Department department) {
        for (DepartmentUserModel model : departmentUserModelCollection) {
            if(model.getDepartmentId().equals(department.getDepartmentId())) {
                System.out.println("Department ID: " + model.getDepartmentId() + ", User ID: " + model.getUserId());
            }
        }
    }

    public void showUserDepartments(User user) {
        for (DepartmentUserModel model : departmentUserModelCollection) {
            if(model.getUserId().equals(user.getUserId())) {
                System.out.println("User ID: " + user.getUserId() + ", Department ID:" + model.getDepartmentId());
            }
        }
    }

    public boolean changeDepartment(String userId, String oldDepartmentId, String newDepartmentId) {
        return false;
    }

    public boolean joinDepartment(Collection<String> departments, Department newDepartment) {
        return false;
    }

}