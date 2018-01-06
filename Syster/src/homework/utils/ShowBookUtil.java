package homework.utils;

import homework.dao.BookDao;
import homework.domain.Book;

import java.util.List;

public class ShowBookUtil {
    public static List<Book> showBook(){
    List<Book> bookDao=new BookDao().queryAllBook();
    return  bookDao;
    }
}
