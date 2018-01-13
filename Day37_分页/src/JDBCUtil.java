import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    private static String url;
    private static String driverClass;
    private static String user;
    private static String password;
    static {
        try {
            InputStream inputStream = JDBCUtil.class.getClassLoader().
                    getResourceAsStream("jdbc.properties");
            Properties info = new Properties();
            info.load(inputStream);
            driverClass = info.getProperty("driverName");
            user = info.getProperty("user");
            url = info.getProperty("url");
            password = info.getProperty("password");
            Class.forName(driverClass);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("你Driver类的路径写错了兄弟");
        }
    }

    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    url,
                    user,
                    password
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(ResultSet rs){
        close(rs,null,null);
    }

    public static void close(Statement stt){
        close(null,stt,null);
    }

    public static void close(Connection conn){
        close(null,null,conn);
    }

    public static void close(ResultSet rs, Statement stt, Connection conn){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stt != null){
            try {
                stt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




}
