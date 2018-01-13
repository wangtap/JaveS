package homework.page.domain;

import homework.book.domain.Book;

import java.util.List;

public class Page {


    private  List<Book> books;
private  int totalData;
private int pageCode;
private int pageSize=8;
private int cid;

    @Override
    public String toString() {
        return "Page{" +
                "books=" + books +
                ", totalData=" + totalData +
                ", pageCode=" + pageCode +
                ", pageSize=" + pageSize +
                ", cid=" + cid +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }



    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getTotalData() {
        return totalData;
    }

    public void setTotalData(int totalData) {
        this.totalData = totalData;
    }

    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }


    public int getTotalPages() {
        int ps=totalData/pageSize;
        if (totalData%pageSize>0){
            ps++;
        }
        return ps;
    }



    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Page() {

    }
}
