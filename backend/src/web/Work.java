package web;

import net.sf.json.JSONArray;
//import utils.JDBC.JDBCUtil;
import utils.JDBC.JdbcUtil;
import work.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Work extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 指定允许其他域名访问
        resp.addHeader("Access-Control-Allow-Origin","*");
// 响应类型
        resp.addHeader("Access-Control-Allow-Methods","POST");
// 响应头设置
        resp.addHeader("Access-Control-Allow-Headers","x-requested-with,content-type");

//        resp.setContentType("text/htm;charset=utf-8");
//        InsertDeleteUpdateQuery insertDeleteUpdateQuery = new InsertDeleteUpdateQuery();
//        String sql ="select*from users";
//        Object query = insertDeleteUpdateQuery.query(sql,  new MapListHandler());
//        List<Map<String, Object>> query1= (List<Map<String, Object>>)query;
//        System.out.println(query1.toString());
//        JSONArray jsonArray = JSONArray.fromObject(query1);
//        resp.getWriter().write(jsonArray.toString());

//        List<Map<String, Object>> a = Test.a();
//        System.out.println(a.toString());

//            Test.b();



//        try {
//            List<Map<String, Object>> query = new WhQueryRunner().query(
//                    JDBCUtil.init(),
//                    "select*from hw_user",
//                    new MapListHandler()
//            );
//            System.out.println(query);
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }

        try{
            Connection conn = JdbcUtil.getConnection();

            Statement state =
                    conn.createStatement();
            ResultSet resultSet = state.executeQuery(
                    "SELECT * FROM USERS"
            );
            List<User> users = new ArrayList<>();
            while (resultSet.next()){
                User u = new User();
                u.setId( resultSet.getString(1));
                u.setUsername(resultSet.getString(2));
                u.setNickname(resultSet.getString(3));
                u.setPassword(resultSet.getString(4));
                users.add(u);
            }
            JSONArray jsonArray = JSONArray.fromObject(users);
            resp.getWriter().write(jsonArray.toString());
            state.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}




