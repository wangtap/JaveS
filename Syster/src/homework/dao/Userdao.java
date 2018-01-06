package homework.dao;

import homework.domain.User;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private  static String nickname=null;
    private QueryRunner queryRunner= new QueryRunner();
    public  String insert(User user){
        String sql = "insert into users value(null,?,?,?)";
        Connection connection = JDBCUtil.getConnection();
        try {
            queryRunner.update(connection,sql,user.getUsername(),user.getNickname(),user.getPassword());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }

    public User queryByUsername(String username) throws SQLException {
        String  sql="select * from users where username="+username;
        Connection connection = JDBCUtil.getConnection();
        User user = queryRunner.query(connection, sql, new BeanHandler<User>(User.class));
        return user;
    }

    public  String login(User user)  {
        String sql ="SELECT  nickname FROM  users WHERE username=? AND password=?";
        Connection connection = JDBCUtil.getConnection();
        try {
            PreparedStatement pstate = connection.prepareStatement(sql);
            pstate.setString(1,user.getUsername());
            pstate.setString(2,user.getPassword());
            ResultSet resultSet = pstate.executeQuery();
            if (resultSet.next()){
                    nickname=resultSet.getString(1);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nickname;
    }

    public List<User> queryAll() {
        String sql = "select * from user";
        Connection conn = null;
        conn = JDBCUtil.getConnection();
        try {
            List<User> users =
                    queryRunner.query(conn, sql, new BeanListHandler<User>(User.class));
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn);
        }
        return null;
    }
}
