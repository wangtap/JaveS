package web;

import dao.Userdao;
import work.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class insert extends HttpServlet {
     private Userdao userdao=  new  Userdao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String nickname = req.getParameter("nickname");
        String password = req.getParameter("password");
        User user = new User(username, nickname, password);
         resp.getWriter().write( userdao.insert(user));

    }
}
