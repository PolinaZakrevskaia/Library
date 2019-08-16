package com.epam.homework.author.service;


import com.epam.homework.author.domain.Author;

public interface AuthorService {
    int count();
    void print();
    void delete(Author author);
    Long add(Author author);
    void deleteBooksWhichOldAndSentReport();
}
