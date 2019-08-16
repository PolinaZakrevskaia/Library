package com.epam.homework.author.service;


import com.epam.homework.author.domain.Author;
import com.epam.homework.author.repo.AuthorRepo;
import com.epam.homework.book.domain.Book;
import com.epam.homework.book.repo.BookRepo;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public AuthorServiceImpl(AuthorRepo authorRepo,
                             BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public int count() {
        return authorRepo.count();
    }

    @Override
    public void print() {
        authorRepo.print();
    }

    @Override
    public void delete(Author author) {
        Book[] booksWithAuthor = bookRepo.findBooksByAuthor(author.getId());

        if (booksWithAuthor != null) {
            for (Book book : booksWithAuthor) {
                book.deleteAuthor(author);

                if (book.withoutAuthors()) {
                    bookRepo.delete(book);
                }
            }
        }

        authorRepo.delete(author);
    }

    @Override
    public Long add(Author author) {
        return authorRepo.add(author);
    }

    @Override
    public void deleteBooksWhichOldAndSentReport() {

    }
}
