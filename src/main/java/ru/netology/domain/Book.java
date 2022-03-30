package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


public class Book  extends Product {
    private String name;
    private String author;

    public Book(int id, String name, int productPrice, String name1, String author) {
        super(id, name, productPrice);
        this.name = name1;
        this.author = author;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Book book = (Book) o;
//        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), name, author);
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }

