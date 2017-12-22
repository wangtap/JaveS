package utils.JDBC;

import bean.User;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws SQLException {
        InsertDeleteUpdateQuery insertDeleteUpdateQuery = new InsertDeleteUpdateQuery();
        String sql ="select*from users";
        Object query = insertDeleteUpdateQuery.query(sql,  new MapListHandler());
        List<Map<String, Object>>  query1= (List<Map<String, Object>>)query;
        System.out.println(query1.toString());
    }
}
