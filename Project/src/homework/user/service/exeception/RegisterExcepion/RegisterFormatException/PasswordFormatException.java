package homework.user.service.exeception.RegisterExcepion.RegisterFormatException;

import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.RegisterFormatException;

public class PasswordFormatException extends RegisterFormatException {
    @Override
    public String getMessage() {
        return "密码格式错误";
    }
}
