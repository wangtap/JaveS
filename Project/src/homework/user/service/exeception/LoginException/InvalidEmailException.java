package homework.user.service.exeception.LoginException;

public class InvalidEmailException extends LoginException {
    @Override
    public String getMessage() {
        return "Email不存在";
    }


}
