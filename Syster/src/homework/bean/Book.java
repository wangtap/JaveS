package homework.bean;

public class Book {
    private  int id;
    private String bookname;
    private String auther;
    private  double price;
    private  String website;

    public Book(int id, String bookname, String auther, double price, String website) {
        this.id = id;
        this.bookname = bookname;
        this.auther = auther;
        this.price = price;
        this.website = website;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                ", website='" + website + '\'' +
                '}';
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
