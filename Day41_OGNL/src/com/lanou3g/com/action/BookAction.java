package com.lanou3g.com.action;

import com.lanou3g.com.Book;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class BookAction  extends ActionSupport{
    private Book book;
    private String sex;
    private String city;

    public String getSex() {
        return sex;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    List<Book> boks=new ArrayList<>();
    public String books(){
        System.out.println(book.toString());
        for (int i = 0; i < 20; i++) {
            Book book = new Book("侠客行" + i, "金庸" + i, "小说" + i);
            boks.add(book);
        }
        ActionContext.getContext().put("books",boks);
        return SUCCESS;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
