import homework.book.domain.Book;
import homework.category.dao.CategoryDao;
import homework.utils.CodeUtil;

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


    }

