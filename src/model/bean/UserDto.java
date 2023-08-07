package model.bean;

public class UserDto {

    private int userNo;
    private String userId;
    private String userPassword;
    private int userAge;
    private String birthdate;


    public UserDto(String userId, String userPassword, int userAge, String birthdate) {
        this.userId = userId;
        this.userPassword = userPassword;
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

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
