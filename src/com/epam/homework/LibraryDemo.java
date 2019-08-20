package com.epam.homework;

import com.epam.homework.author.InputAuthor;
import com.epam.homework.author.domain.Author;
import com.epam.homework.author.repo.AuthorRepo;
import com.epam.homework.author.repo.AuthorRepoArrayImpl;
import com.epam.homework.author.repo.AuthorRepoCollectionImpl;
import com.epam.homework.author.service.AuthorService;
import com.epam.homework.author.service.AuthorServiceImpl;
import com.epam.homework.book.InputBook;
import com.epam.homework.book.domain.Book;
import com.epam.homework.book.domain.HandWrittenBook;
import com.epam.homework.book.domain.PrintedBook;
import com.epam.homework.book.repo.BookRepo;
import com.epam.homework.book.repo.BookRepoArrayImpl;
import com.epam.homework.book.repo.BookRepoCollectionImpl;
import com.epam.homework.book.service.BookService;
import com.epam.homework.book.service.BookServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class LibraryDemo {

    /**
     *  When delete Author
     *
     *  Look for books where author present, and remove him from book
     *
     *  if (book.getAuthorCount == 0){
     *      dropBook()
     *  }
     *
     *
     * ----------
     * When delete book
     * Delete book from storage
     */
    public static void main(String[] args) {
//        String storageType = "arrays";
        String storageType = "collection";
        BookRepo bookRepo = null;
        AuthorRepo authorRepo = null;

        if (storageType.equals("arrays")){
            bookRepo = new BookRepoArrayImpl();
            authorRepo = new AuthorRepoArrayImpl();
        }else if (storageType.equals("collection")){
            bookRepo = new BookRepoCollectionImpl();
            authorRepo = new AuthorRepoCollectionImpl();
        }

        AuthorService authorService = new AuthorServiceImpl(authorRepo, bookRepo);
        BookService bookService = new BookServiceImpl(authorRepo, bookRepo);
        initData(bookService, authorService);

        bookRepo.print();
        authorRepo.print();



    }

    private static void initData(BookService bookService, AuthorService authorService) {
        InputBook inputBook1 = new InputBook();
        inputBook1.setName("Zolotaya rybka");
        inputBook1.setPublishYear(11);
        Book book1 = valueOfForHandWrittenBook(inputBook1);

        InputBook inputBook2 = new InputBook();
        inputBook2.setName("Rusla and Ludmila");
        inputBook2.setPublishYear(11);
        Book book2 = valueOfForHandWrittenBook(inputBook2);

        InputAuthor inputAuthor = new InputAuthor();
        inputAuthor.setLastName("Pushkin");
        inputAuthor.setYearOfBorn(22);
        Author author = valueOfForHandWrittenBook(inputAuthor);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        author.setBooks(books);

        List<Author> authors = new ArrayList<>();
        authors.add(author);
        book1.setAuthors(authors);
        book2.setAuthors(authors);


        bookService.add(book1);
        bookService.add(book2);

        //AuthorRepo
        authorService.add(author);
    }

    private static Book valueOfForHandWrittenBook(InputBook inputBook) {
        HandWrittenBook book = new HandWrittenBook();
        book.setName(inputBook.getName());
        book.setPublishYear(inputBook.getPublishYear());
        book.setPaint(inputBook.getPaint());

        return book;
    }

    private static Book valueOfForPrintedBook(InputBook inputBook) {
        PrintedBook book = new PrintedBook();
        book.setName(inputBook.getName());
        book.setPublishYear(inputBook.getPublishYear());
        book.setFontFamily(inputBook.getFontFamily());

        return book;
    }

    private static Author valueOfForHandWrittenBook(InputAuthor inputAuthor) {
        Author author = new Author(null);
        author.setLastName(inputAuthor.getLastName());
        return author;
    }
}
