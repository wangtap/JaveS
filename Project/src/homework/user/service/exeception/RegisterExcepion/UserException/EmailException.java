package homework.user.service.exeception.RegisterExcepion.UserException;

import org.omg.CORBA.UserException;

public class EmailException extends UserException {
    @Override
    public String getMessage() {
        return "邮箱已被注册";
    }
}
