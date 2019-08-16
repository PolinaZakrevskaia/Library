package com.epam.homework.book.service;

import com.epam.homework.book.domain.Book;

public interface BookService {

    int count();
    void print();
    void delete(Book book);
    Long add(Book book);

}
