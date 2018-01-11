package homework.cart.domain;

import homework.book.domain.Book;

public class CartItem {
    private int count;
    private Book book;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "count=" + count +
                ", book=" + book +
                '}';
    }

    public CartItem() {
    }

    public CartItem(int count, Book book) {
        this.count = count;
        this.book = book;
    }
}
