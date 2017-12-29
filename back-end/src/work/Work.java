package work;

import net.sf.json.JSONArray;
import org.apache.commons.dbutils.handlers.MapListHandler;
import utils.JDBC.InsertDeleteUpdateQuery;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Work extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/htm;charset=utf-8");
        InsertDeleteUpdateQuery insertDeleteUpdateQuery = new InsertDeleteUpdateQuery();
        String sql ="select*from users";
        Object query = insertDeleteUpdateQuery.query(sql,  new MapListHandler());
        List<Map<String, Object>> query1= (List<Map<String, Object>>)query;
        System.out.println(query1.toString());
//        JSONArray jsonArray = JSONArray.fromObject(query1);
//        resp.getWriter().write(jsonArray.toString());

    }
}




