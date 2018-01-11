package homework.user.service.exeception.RegisterExcepion.UserException;

import org.omg.CORBA.UserException;

public class UsernameException extends UserException {
    @Override
    public String getMessage() {
        return "用户名已被注册";
    }
}
