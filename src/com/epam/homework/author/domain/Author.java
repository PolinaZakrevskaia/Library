package com.epam.homework.author.domain;


import com.epam.homework.book.domain.Book;
import com.epam.homework.common.domain.BaseDomain;

import java.util.List;

public class Author extends BaseDomain<Long> {

    private Long id;
    private String lastName;
    private String name;
    private int yearOfBorn;
    private List<Book> books;

    public Author(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void deleteBook (Book book) {
        if (book !=null && books.contains(book)) books.remove(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBorn=" + yearOfBorn +
                '}';
    }
}
