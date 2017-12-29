package work;

import org.apache.commons.dbutils.handlers.MapListHandler;
//import utils.JDBC.JDBCUtil;
import utils.JDBC.WhQueryRunner;

import java.sql.*;
import java.util.List;
import java.util.Map;


public class Test {

//    public static List<Map<String, Object>>  a() {
//        InsertDeleteUpdateQuery insertDeleteUpdateQuery = new InsertDeleteUpdateQuery();
//        String sql = "select*from users";
//        Object query = insertDeleteUpdateQuery.query(sql, new MapListHandler());
//        List<Map<String, Object>> query1 = (List<Map<String, Object>>) query;
//        return query1;
//    }

    public static void b() {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jeehw" +
                            "?User=root&password=123"
            );
            Statement state =
                    conn.createStatement();
            ResultSet resultSet = state.executeQuery(
                    "SELECT id FROM USERs"
            );
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
            state.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static   List<Map<String, Object>>  queryListMap() throws SQLException {
//        List<Map<String, Object>> query = new WhQueryRunner().query(
//                JDBCUtil.con(),
//                "select*from hw_user",
//                new MapListHandler()
//        );
//
//        System.out.println(query.toString());
//        return  query;
//
//    }
}
