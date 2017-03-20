package idv.design.pattern.mediator.example3;

/**
 * @author Carl Lu
 */
public class User {

    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean dimission() {
        DepartmentUserMediatorImpl mediator = DepartmentUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

}
