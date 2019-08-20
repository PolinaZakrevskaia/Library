package com.epam.homework.book.repo;

import com.epam.homework.book.domain.Book;

import java.util.List;

public interface BookRepo {
    int count();
    void print();
    void delete(Book book);
    Long add(Book book);

    List<Book> findBooksByAuthor(Long id);
}
