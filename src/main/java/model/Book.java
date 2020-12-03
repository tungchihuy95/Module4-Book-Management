package model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bookName;
    private String author;

    @ManyToOne
    private Category category;

    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public Book(String bookName, String author, Category category) {
        this.bookName = bookName;
        this.author = author;
        this.category = category;
    }

    public Book(Long id, String bookName, String author, Category category) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Book[id=%d, bookName='%s', author='%s']", id, bookName, author);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
