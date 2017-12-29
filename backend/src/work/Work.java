package work;

import net.sf.json.JSONArray;
//import utils.JDBC.JDBCUtil;
import utils.JDBC.JdbcUtil;

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




