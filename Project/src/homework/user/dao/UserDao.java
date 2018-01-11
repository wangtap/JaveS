package homework.user.dao;

import homework.user.domain.User;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;


import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
    private QueryRunner queryRunner= new QueryRunner();
    public Integer queryMaxUid()  {
        String sql="select max(uid) from users ";
        Connection connection=JDBCUtil.getConnection();
        Integer query = null;
        try {
            query = queryRunner.query(connection, sql, new BeanHandler<Integer>(Integer.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }
    public  String add(User user)  {
       String sql = "insert into user value(?,?,?,?,?,false)";
        Connection connection = JDBCUtil.getConnection();
        try {
            queryRunner.update(connection,
                    sql,
                    user.getUid(),
                    user.getUsername(),
                    user.getPassword(),
                    user.getEmail(),
                    user.getCode());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }

    public User queryUserByUsername(String username) throws SQLException {
        String  sql="select * from user where username=?";
        Connection connection = JDBCUtil.getConnection();
        User user = null;
        user = queryRunner.query(connection, sql, new BeanHandler<User>(User.class),username);
        connection.close();
        return user;
    }
    public User queryUserByEmail(String email) throws SQLException{
        String  sql="select * from user where email=?";
        Connection connection = JDBCUtil.getConnection();
        User user = null;
        user = queryRunner.query(connection, sql, new BeanHandler<User>(User.class),email);
        connection.close();
        return user;
    }
    public User queryUserByPassword(String password) throws SQLException{
        String  sql="select * from user where password=?";
        Connection connection = JDBCUtil.getConnection();
        User user = null;
        user = queryRunner.query(connection, sql, new BeanHandler<User>(User.class),password);
        connection.close();
        return user;
    }
    public void changeStateByCode(String code){
        String sql="update user set state=1 where code=? " ;
        Connection  connection=JDBCUtil.getConnection();
        try {
            queryRunner.update(connection,sql,code);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  User  queryStateByCode(String code) throws SQLException {
        String sql="select * from user where code=? ";
        Connection connection = JDBCUtil.getConnection();
        User user=queryRunner.query(connection, sql, new BeanHandler<User>(User.class), code);
        connection.close();
        return user;
    }



}
