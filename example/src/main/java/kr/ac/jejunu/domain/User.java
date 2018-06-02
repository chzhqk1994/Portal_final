package kr.ac.jejunu.domain;

public class User {
    private String userId;
    private String userPassword;
    private String userName;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userid='" + userId + '\'' +
                ", userpassword='" + userPassword + '\'' +
                ", username='" + userName + '\'' + '}';
    }
}
