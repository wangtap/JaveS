package homework.user.domain;

public class User {
    private int uid;
     private String username;
     private String password;
     private String email;
     private String code;
     private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int uid, String username, String password, String email, String code) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.code = code;

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
