package homework.book.dao;

import homework.book.domain.Book;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookDao {
    QueryRunner queryRunner=new QueryRunner();

    public Book queryByBname(String bname) throws SQLException {
        String sql="select * from book where bname=? ";
        Connection connection = JDBCUtil.getConnection();
        Book book = queryRunner.query(connection, sql, new BeanHandler<Book>(Book.class),bname);
        connection.close();
        return book;
    }
    public Book queryByAuthor(String author) throws SQLException {
        String sql="select * from book where author=? ";
        Connection connection = JDBCUtil.getConnection();
        Book book = queryRunner.query(connection, sql, new BeanHandler<Book>(Book.class),author);
        connection.close();
        return book;
    }
    public static Book queryByBid(int bid) {
        QueryRunner qr=new QueryRunner();
        String sql="select * from book where bid=? ";
        Connection connection = JDBCUtil.getConnection();
        Book book = null;
        try {
            book = qr.query(connection, sql, new BeanHandler<Book>(Book.class),bid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }
     public static List<Book> queryAll(){
        QueryRunner qr=new QueryRunner();
        String sql="SELECT * FROM book ";
        Connection connection = JDBCUtil.getConnection();
        List<Book> books= null;
        try {
            books = qr.query(connection, sql, new BeanListHandler<Book>(Book.class));
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  books;
    }
    public static List<Book> classificationByCname(String cname){
        QueryRunner qr=new QueryRunner();
        String sql="SELECT * FROM book WHERE cid=(SELECT cid FROM category WHERE cname=?)";
        Connection connection = JDBCUtil.getConnection();
        List<Book> books= null;
        try {
            books = qr.query(connection, sql, new BeanListHandler<Book>(Book.class), cname);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  books;
    }
    public List<Book> queryBookByCid(int cid){
        String sql="select * from book where cid=?";
        Connection connection = JDBCUtil.getConnection();
        List<Book> bookList=null;
        try {
            bookList= queryRunner.query(connection, sql, new BeanListHandler<Book>(Book.class),cid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  bookList;
    }
    public Object queyrCountByCid(int cid){
        String sql="select count(*)  from book where cid=?";
        Connection connection=JDBCUtil.getConnection();
        Object object=null;
        try {
            object = queryRunner.query(connection, sql, new ScalarHandler<>(), cid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return object;
    }
    public Object queyrCount(){
        String sql="select count(*)  from book ";
        Connection connection=JDBCUtil.getConnection();
        Object object=null;
        try {
            object = queryRunner.query(connection, sql, new ScalarHandler<>());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return object;
    }

}
