package com.epam.homework.author.service;


import com.epam.homework.author.domain.Author;
import com.epam.homework.common.service.BaseService;

public interface AuthorService extends BaseService<Author, Long> {
        void deleteBooksWhichOldAndSentReport();
}
