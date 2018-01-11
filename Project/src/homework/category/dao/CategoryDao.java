package homework.category.dao;

import homework.book.domain.Book;
import homework.category.domain.Category;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CategoryDao {
    private    QueryRunner queryRunner=new QueryRunner();
    public Category queryByCid(int cid) throws SQLException {
        String sql="select * from category where cid=?";
        Connection connection = JDBCUtil.getConnection();
        Category category = queryRunner.query(connection, sql, new BeanHandler<Category>(Category.class),cid);
        connection.close();
        return category;
    }
    public Category queryByCname(String cname) throws SQLException {
        String sql="select * from category where cname=?";
        Connection connection = JDBCUtil.getConnection();
        Category category = queryRunner.query(connection, sql, new BeanHandler<Category>(Category.class),cname);
        connection.close();
        return category;
    }
    public  List<Category>   queryAll(){
        String sql="select * from category";
        Connection connection = JDBCUtil.getConnection();
        List<Category> categories=null;
        try {
            categories = queryRunner.query(connection, sql, new BeanListHandler<Category>(Category.class));
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  categories;
    }




}
