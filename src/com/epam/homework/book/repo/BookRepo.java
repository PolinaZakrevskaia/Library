package com.epam.homework.book.repo;

import com.epam.homework.book.domain.Book;
import com.epam.homework.common.repo.BaseRepo;

import java.util.List;

public interface BookRepo extends BaseRepo<Book, Long> {
        List<Book> findBooksByAuthor(Long id);
}
