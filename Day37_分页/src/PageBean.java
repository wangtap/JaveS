import java.util.List;

public class PageBean {
    private List<Book> books;//分页数据
//    private int totalPages;//总页数
    private int pageCode;//当前页
    private int totalData;//总数据量
    private int pageSize=10;//每页显示的数据量


    private  String params;//查询语句参数

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
        int ps = totalData / pageSize;
        if (totalData % pageSize>0){
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
