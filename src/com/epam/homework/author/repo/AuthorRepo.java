package com.epam.homework.author.repo;


import com.epam.homework.author.domain.Author;

import java.util.List;

public interface AuthorRepo {
    int count();
    void print();
    void delete(Author author);
    Long add(Author author);
}
