package com.epam.homework.book.service;

import com.epam.homework.book.domain.Book;
import com.epam.homework.common.service.BaseService;

import java.util.List;

public interface BookService extends BaseService<Book,Long> {
    /*int count();
    void print();
    void delete(Book book);
    Long add(Book book);*/
    List<Book> findBooksByAuthorAsList(long authorId);
}
