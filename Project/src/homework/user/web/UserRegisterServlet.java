package homework.user.web;



import homework.user.dao.UserDao;
import homework.user.domain.User;
import homework.user.service.Check;
import homework.user.service.SendEmail;
import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.RegisterFormatException;
import org.apache.commons.beanutils.BeanUtils;
import org.omg.CORBA.UserException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(name = "UserRegisterServlet",urlPatterns = "/userRegister")
public class UserRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        User formU = new User();
        Check check=new Check();
        SendEmail sendEmail=new SendEmail();
        int uid = (int) ((Math.random() * 9 + 1) * 100000);
        int i = (int) ((Math.random() * 9 + 1) * 100000);
        String code=""+uid+i;
        PrintWriter out = response.getWriter();
        formU.setUid(uid);
        formU.setCode(code);
        Map<String, String[]> map = request.getParameterMap();
        try {
            BeanUtils.populate(formU,map);
            check.checkFormat(formU);
            check.checkDuplicate(formU);
            sendEmail.sendEmail(code,formU.getEmail());
            request.setAttribute("user",formU);
//            request.getRequestDispatcher("/jsps/msg.jsp").forward(request,response);
            out.print("SUCCESS");
        } catch (RegisterFormatException e) {
            out.print(e.getMessage());
        } catch (UserException e) {
            out.print(e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        UserDao userDao=new UserDao();
        userDao.changeStateByCode(code);
        response.sendRedirect("/jsps/user/login.jsp");
    }


}
