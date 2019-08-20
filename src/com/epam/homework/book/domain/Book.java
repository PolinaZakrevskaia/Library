package com.epam.homework.book.domain;

import com.epam.homework.author.domain.Author;

import java.util.Arrays;
import java.util.List;

public class Book {

    protected Long id;
    protected String name;
    protected int publishYear;
    protected int totalPages;
    protected List<Author> authors;
    protected BookType bookType;

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", totalPages=" + totalPages +
                '}';
    }

    public void deleteAuthor(Author author) {
        authors.remove(author);
    }

    public boolean withoutAuthors() {
        if (authors.size()==0 || authors==null) return true;
        return false;
    }
}
