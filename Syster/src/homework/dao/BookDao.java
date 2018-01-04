package homework.dao;

import homework.bean.Book;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookDao {
     private static QueryRunner qr=   new   QueryRunner();
    public List<Book> queryAllBook(){
        Connection connection = JDBCUtil.getConnection();
        String sql="select * from book ";
        try {
            List<Book> bookList = qr.query(connection, sql, new BeanListHandler<Book>(Book.class));
            return bookList;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return  null;
    }
}
