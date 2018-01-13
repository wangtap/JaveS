package homework.book.service;

import homework.book.dao.BookDao;
import homework.book.domain.Book;

import java.util.List;

public class BookListService {
    BookDao bookDao=new BookDao();
    public List<Book> queryBookListByCid(int cid){
        List<Book> bookList= null;
        if (cid<0){
            bookList = bookDao.queryAll();
        }else {
            bookList = bookDao.queryBookByCid(cid);
        }
        return bookList;
    }
    public Object queryTotalDataByCid(int cid){
        Object totalData = bookDao.queyrCountByCid(cid);
        return totalData;
    }
    public Object queryTotalData(){
        Object totalData = bookDao.queyrCount();
        return totalData;
    }
}
