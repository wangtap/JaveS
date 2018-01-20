package com.lanou3g.com;

public class Book {
    private String naem;
    private String author;
    private String category;

    @Override
    public String toString() {
        return "Book{" +
                "naem='" + naem + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Book(String naem, String author, String category) {

        this.naem = naem;
        this.author = author;
        this.category = category;
    }

    public Book() {

    }
}
