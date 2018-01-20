package user.service.exceptiom.loginexception;

public class LoginException extends Exception {
    @Override
    public String getMessage() {
        return "密码与账号不匹配";
    }
}
