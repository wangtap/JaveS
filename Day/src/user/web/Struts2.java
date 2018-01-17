//package user.web;
//
//import com.opensymphony.xwork2.ActionSupport;
//import org.apache.struts2.interceptor.ServletRequestAware;
//import org.apache.struts2.interceptor.ServletResponseAware;
//import user.dao.UserDao;
//import user.domain.User;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class Struts2 extends ActionSupport implements ServletResponseAware,ServletRequestAware{
//
//    private HttpServletResponse httpServletResponse;
//    private HttpServletResponse response;
//    private HttpServletRequest request;
//
//    @Override
//    public void setServletResponse(HttpServletResponse httpServletResponse) {
//        this.response = httpServletResponse;
//    }
//
//
//    @Override
//    public void setServletRequest(HttpServletRequest httpServletRequest) {
//        this.request = httpServletRequest;
//    }
//    public String register(){
//        UserDao userDao = new UserDao();
////        User user =(User) request.getAttribute("User");
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        User user = new User(username,email,password);
//        int i = userDao.insert(user);
//        if (i!=0){
//            return SUCCESS;
//        }
//        return NONE;
//    }
//
//    public String login(){
//        UserDao userDao = new UserDao();
//        String username = request.getParameter("email");
//        String password = request.getParameter("password");
//        User user = userDao.queryUserByPassword(password);
//        User user1 = userDao.queryUserByUsername(username);
//        if (user.toString().equals(user1.toString())){
//            return SUCCESS;
//        }else {
//            return NONE;
//        }
//    }
//
//}
