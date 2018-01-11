package homework.user.service.exeception.RegisterExcepion.RegisterFormatException;

import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.RegisterFormatException;

public class EmailFormatException extends RegisterFormatException {
    @Override
    public String getMessage() {
        return "Email格式错误";
    }
}
