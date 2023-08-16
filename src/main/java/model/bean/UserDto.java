package model.bean;

public class UserDto {

    private int userNo;
    private String userId;
    private String userName;
    private String userPassword;
    private int userAge;
    private String birthdate;

    public UserDto() {}

    public UserDto(String userId, String userPassword, String userName, int userAge, String birthdate) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userAge = userAge;
        this.birthdate = birthdate;
    }

    public int getUserNo() {
        return userNo;
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

    public int getUserAge() {
        return userAge;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
