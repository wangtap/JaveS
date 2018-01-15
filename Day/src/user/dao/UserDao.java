package user.dao;


import c3p0.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import user.domain.User;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
    QueryRunner queryRunner=new QueryRunner() ;
    public int insert(User user){
        String sql="insert into users values(?,?,?,?)";
       Connection connection = C3P0Util.getConnection();
        try {
            int i = queryRunner.update(connection, sql,
                    null,
                    user.getUsername(),
                    user.getNickname(),
                    user.getPassword());
                    connection.close();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;

    }

    public  User queryUserByUsername(String username){
        String sql="select * from users where username=?";
        Connection connection = C3P0Util.getConnection();
        User user=null;
        try {
            user = queryRunner.query(connection, sql, new BeanHandler<User>(User.class), username);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public  User queryUserByPassword(String password){
        String sql="select * from users where password=?";
        Connection connection = C3P0Util.getConnection();
        User user=null;
        try {
            user = queryRunner.query(connection, sql, new BeanHandler<User>(User.class), password);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
