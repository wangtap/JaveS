package service.exceptiom;

public class PasswordNotMatchedExection extends LoginExection {
    @Override
    public String getMessage() {
        return "密码错误";
    }
}
