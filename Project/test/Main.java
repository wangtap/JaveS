import homework.book.domain.Book;
import homework.category.dao.CategoryDao;
import homework.utils.CodeUtil;
import homework.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date currDate = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(currDate);
        System.out.println(currDate);
        System.out.println(sdf);
        System.out.println(dateTime);
        }

//    @Test
//    public void t(int i) throws SQLException {
//        Connection connection = JDBCUtil.getConnection();
//        QueryRunner qr = new QueryRunner();
//        String sql = "insert into book values(?,?,?,?,?)";
//
//        qr.update(connection,sql,i,"Javascript权威指南","93.6","（美）弗兰纳根","book_img/22722790-1_l.jpg","3");
//        connection.close();
//    }

    @Test
    public void t2(){
        for (int i = 20; i < 21; i++) {
            try {

                Connection connection = JDBCUtil.getConnection();
                QueryRunner qr = new QueryRunner();
                String sql = "insert into book values(?,?,?,?,?)";
                String qq=""+i;
//                qr.update(connection,sql,qq,"Javascript权威指南","93.6","（美）弗兰纳根","book_img/22722790-1_l.jpg","3");
                qr.update(connection,sql,"'12'",
                        "'Javascript权威指南','93.6'",
                       " '（美）弗兰纳根','book_img/22722790-1_l.jpg'",
                       " '3'");
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void t3(){
        for (int i = 91; i < 120; i++) {
            System.out.println(i);


        }

    }


    }

