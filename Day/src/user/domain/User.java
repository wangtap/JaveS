package user.domain;

public class User {
    private String username;
    private String password;
    private String phone;
    private String email;
    private String ps;
    private String code;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", ps='" + ps + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User(String username, String password, String phone, String email, String ps, String code) {

        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.ps = ps;
        this.code = code;
    }

    public User() {

    }
}
