package homework.user.service.exeception.LoginException;

public class PasswordException extends LoginException {
    @Override
    public String getMessage() {
        return "密码错误";
    }
}
