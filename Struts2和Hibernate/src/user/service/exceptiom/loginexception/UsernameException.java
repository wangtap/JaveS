package user.service.exceptiom.loginexception;

public class UsernameException extends LoginException {
    @Override
    public String getMessage() {
        return "用户名异常";
    }
}
