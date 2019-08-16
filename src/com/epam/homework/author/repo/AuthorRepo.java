package com.epam.homework.author.repo;


import com.epam.homework.author.domain.Author;

public interface AuthorRepo {
    int count();
    void print();
    void delete(Author author);
    Long add(Author author);
    Author[] findAuthorsByBook (long id);
}
