package work;

import net.sf.json.JSONArray;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jeehw" +
                        "?User=root&password=123"
        );
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

            state.close();
        conn.close();
    } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }





    }
}
