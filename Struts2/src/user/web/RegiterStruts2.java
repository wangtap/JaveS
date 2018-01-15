package user.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import user.dao.UserDao;
import user.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegiterStruts2 extends ActionSupport implements ServletResponseAware,ServletRequestAware{

    private HttpServletResponse httpServletResponse;
    private HttpServletResponse response;
    private HttpServletRequest request;

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }


    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
    public String register(){
        UserDao userDao = new UserDao();
        User user =(User) request.getAttribute("User");
        int i = userDao.insert(user);
        if (i!=0){
            return SUCCESS;
        }
        return NONE;
    }

}
