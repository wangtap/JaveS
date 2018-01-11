package homework.orders.dao;

import homework.orders.domain.Orders;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderDao {
    QueryRunner queryRunner=new QueryRunner();
    public void insertOrderByOidAndUid(int oid,int uid) throws SQLException {
        String sql="insert into orders (oid,uid) values(?,?) ";
        Connection connection = JDBCUtil.getConnection();
        queryRunner.update(connection,sql,oid,uid);
        connection.close();
    }
    public void updateOrderByOidAndTime(int oid, String time){
        String sql="update  orders set  ordertime=?  ,state=0 ,price=(select sum(subtotal) from orderitem where oid=?) where oid=?";
        Connection connection = JDBCUtil.getConnection();
        try {
            queryRunner.update(connection,sql,time,oid,oid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  Orders queryOrderByOid(int oid){
        String sql="select * from orders where oid=?";
        Connection connection = JDBCUtil.getConnection();
        Orders orders=null;
        try {
            orders = queryRunner.query(connection, sql, new BeanHandler<Orders>(Orders.class),oid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public List<Orders> queryOrderByUid(int uid){
        String sql="select * from orders where uid=?";
        Connection connection = JDBCUtil.getConnection();
        List<Orders> ordersList=null;
        try {
            ordersList = queryRunner.query(connection, sql, new BeanListHandler<Orders>(Orders.class), uid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ordersList;
    }
}
