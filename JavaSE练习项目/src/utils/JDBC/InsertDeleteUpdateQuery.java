package utils.JDBC;

import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InsertDeleteUpdateQuery {

    private boolean flag =false;

    public void Insert(String a, String b, String c, String d) {
        JDBCUtil.execute(new ExecuteInter() {
            @Override
            public Statement execute1(Connection coon) throws SQLException {
                String sql = "INSERT INTO  ? VALUES (?,?,?,?)";
                PreparedStatement pstate = coon.prepareStatement(sql);
                pstate.setString(1, a);
                pstate.setString(2, b);
                pstate.setString(2, c);
                pstate.setString(3, d);
                pstate.executeUpdate();
                return pstate;
            }


        });
    }

    public boolean updateByPreparedStatement(String sql, List<Object> params) throws SQLException {


        JDBCUtil.execute(new ExecuteInter() {
            @Override
            public Statement execute1(Connection coon)  {
                int index = 1;
                int result = -1;
                PreparedStatement pstate = null;
                try {
                    pstate = coon.prepareStatement(sql);
                    if (params != null && !params.isEmpty()) {
                        for (int i = 0; i < params.size(); i++) {
                            pstate.setObject(index++, params.get(i));
                        }
                    }
                    result = pstate.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                flag = result > 0 ? true : false;
                return pstate;
            }
        });
                      return flag;
    }

    public  <T> Object query(String sql,ResultSetHandler t)  {
        Object query = null;
        try {
            query = new WhQueryRunner().query(
                    JDBCUtil.init(),
                    sql,
                    t
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  query;
    }
}




