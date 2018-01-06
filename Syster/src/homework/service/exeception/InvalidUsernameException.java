package homework.service.exeception;

public class InvalidUsernameException  extends LoginExection {
    @Override
    public String getMessage() {
        return "用户名不存在";
    }


}
