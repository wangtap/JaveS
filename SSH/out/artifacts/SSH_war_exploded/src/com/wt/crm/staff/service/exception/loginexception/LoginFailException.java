package com.wt.crm.staff.service.exception.loginexception;

public class LoginFailException extends LoginException {
    @Override
    public String getMessage() {
        return "用户名密码错误";
    }
}
