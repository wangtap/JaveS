import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBUtils {

    private static Properties p = new Properties();

    static{
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream in = loader.getResourceAsStream("db.properties");
            p.load(in);
            Class.forName(p.getProperty("driverClassName"));//加载注册驱动只需加载一次，因而用静态代码块
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接对象
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement state, ResultSet result){

        try {
            if(result != null){
                result.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                try {
                    if(state != null){
                        state.close();
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }



}
