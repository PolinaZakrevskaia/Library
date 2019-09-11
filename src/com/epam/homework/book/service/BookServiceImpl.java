package com.epam.homework.book.service;

import com.epam.homework.author.domain.Author;
import com.epam.homework.author.repo.AuthorRepo;
import com.epam.homework.book.domain.Book;
import com.epam.homework.book.repo.BookRepo;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BookServiceImpl(AuthorRepo authorRepo,
                           BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public int count() {
        return bookRepo.count();
    }

    @Override
    public void print() {
        bookRepo.print();
    }

    @Override
    public void delete(Book book) {
        bookRepo.delete(book);
    }



    @Override
    public Long add(Book book) {

        return bookRepo.add(book);
    }

    @Override
    public List<Book> findBooksByAuthorAsList(long authorId) {
        return bookRepo.findBooksByAuthor(authorId);
    }

    @Override
    public Book findById(Long bookId) {
        if (bookId != null) {
            return bookRepo.findById(bookId);
        } else {
            return null;
        }
    }
}
