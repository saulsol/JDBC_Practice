package model.bean;

public class LoginDto {

    private String id;
    private String password;

    public LoginDto(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginDto() {
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
