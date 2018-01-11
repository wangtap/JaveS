package homework.user.service.exeception.LoginException;

public class StateException extends LoginException{
    @Override
    public String getMessage() {
        return "账号未激活";
    }
}
