package idv.design.pattern.mediator.example3;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String args[]) {
        DepartmentUserMediatorImpl mediator = DepartmentUserMediatorImpl.getInstance();

        Department department1 = new Department();
        department1.setDepartmentId("d1");

        Department department2 = new Department();
        department2.setDepartmentId("d2");

        User user = new User();
        user.setUserId("u1");
        user.setUserName("Carl");

        System.out.println("---Show department for user: " + user.toString());
        mediator.showUserDepartments(user);

        System.out.println("---Delete dep1...");
        department1.deleteDepartment();
        mediator.showUserDepartments(user);

        System.out.println("---Users in dep2:");
        mediator.showDepartmentUsers(department2);
        System.out.println("---User1 dimission...");
        user.dimission();
        mediator.showDepartmentUsers(department2);
    }

}
