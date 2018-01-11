package homework.orderitem.dao;

import homework.orderitem.domain.OrderItem;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderItemDao {
    QueryRunner queryRunner=new QueryRunner();
    public void insert(int iid,int count,int subtotal,int oid,int bid) throws SQLException {
        String sql="insert into orderitem values (?,?,?,?,?) ";
        Connection connection = JDBCUtil.getConnection();
        System.out.println(oid+"----------"+bid);
        queryRunner.update(connection,sql,iid,count,subtotal,oid,bid);
        connection.close();
    }
    private void udataOidByiid(int oid,int iid) throws SQLException {
        String sql="update orderitem set oid=? where iid=? ";
        Connection connection = JDBCUtil.getConnection();
        queryRunner.update(connection,sql,oid,iid);
        connection.close();
    }
    public static List<OrderItem> queryAllByoid(int oid)  {
        QueryRunner qr=new QueryRunner();
        String sql="select * from orderitem where oid=? ";
        Connection connection = JDBCUtil.getConnection();
        List<OrderItem> orderItemList = null;
        try {
            orderItemList = qr.query(
                    connection, sql, new BeanListHandler<OrderItem>(OrderItem.class), oid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderItemList;
    }

    public void deleteByiid(int iid){
        String sql="delete from orderitem where iid=? ";
        Connection connection = JDBCUtil.getConnection();
        try {
            queryRunner.update(connection,sql,iid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteByoid(int oid){
        String sql="delete from orderitem where oid=? ";
        Connection connection = JDBCUtil.getConnection();
        try {
            queryRunner.update(connection,sql,oid);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
