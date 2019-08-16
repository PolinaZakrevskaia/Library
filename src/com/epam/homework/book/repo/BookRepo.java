package com.epam.homework.book.repo;

import com.epam.homework.book.domain.Book;

public interface BookRepo {
    int count();
    void print();
    void delete(Book book);
    Long add(Book book);
    Book[] findBooksByAuthor(long id);
}
