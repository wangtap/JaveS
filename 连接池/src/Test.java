import util.DBCPUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
//        Connection conn = DBCPUtil.getConn();
//        System.out.println(conn);
//        conn.close();

        for (int i = 0; i < 51; i++) {
                    Connection conn = DBCPUtil.getConn();
                     System.out.println(conn+"-----"+i);
        }
    }

}
