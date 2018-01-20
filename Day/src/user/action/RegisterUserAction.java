package user.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import user.domain.User;
import user.service.UserService;
import user.util.Validator;

public class RegisterUserAction extends ActionSupport {
        private User user;
        UserService userService= new  UserService();



    @Override
    public void validate() {

        super.validate();
        if (!Validator.isEmail(user.getEmail())){
            addFieldError("register.email","邮箱格式错误");
        }
        if(!Validator.isUsername(user.getUsername())){
            addFieldError("register.username","用户名格式错误");
        }
        if(!Validator.isMobile(user.getPhone())){
            addFieldError("register.phone","手机格式错误");
        }
        if(!Validator.isPassword(user.getPassword())){
            addFieldError("register.password","密码格式错误");
        }
        if(!user.getPassword().equals(user.getPs())){
            addFieldError("register.ps","两次密码不一样");
        }
        String coid = (String) ServletActionContext.getContext().getSession().get("code");
        if (!user.getCode().equals(coid)){
            addFieldError("register.code","验证码错误");
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String register(){
//        System.out.println(user);
        int register = userService.register(user);
        System.out.println(register);
        if (register!=0){
            return SUCCESS;
        }else {
        return INPUT;

        }
    }


}
