import observer.Reader;
import subject.Book;

public class Main {
    public static void main(String[] args) {
        //创建被观察者/我发布了一本书
        Book book = new Book("斗破苍穹");

        //创建观察者/吸引了读者
        Reader reader = new Reader("张三");
        Reader reader1 = new Reader("李四");
        Reader reader2 = new Reader("王五");

        book.add(reader);
        book.add(reader1);

        book.notify("更新了一章");

        book.delect(reader1);

        book.notify("又更新了");






    }


}
