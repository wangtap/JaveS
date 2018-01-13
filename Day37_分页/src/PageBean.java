import java.util.List;

public class PageBean {
    private List<Book> books;
//    private int totalPages;
    private int pageCode;
    private int totalData;
    private int pageSize=10;


    private  String params;

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setTotalData(int totalData) {
        this.totalData = totalData;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getTotalPages() {
        int ps = totalData / 10;
        if (totalData % 10>0){
            ps++;
        }
        return ps;
    }



    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }


    public PageBean() {

    }
}
