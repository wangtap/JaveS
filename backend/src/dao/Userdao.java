package dao;

import org.apache.commons.dbutils.QueryRunner;
import utils.JDBC.JdbcUtil;
import work.User;

import java.sql.Connection;
import java.sql.SQLException;

    public class Userdao {
        private QueryRunner queryRunner= new QueryRunner();
        public  String insert(User user){

            String sql = "insert into users value(null,?,?,?)";
            Connection connection = JdbcUtil.getConnection();
            try {
                queryRunner.update(connection,sql,user.getUsername(),user.getNickname(),user.getPassword());
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return "SUCCESS";
        }
}
