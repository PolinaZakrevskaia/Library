package com.epam.homework.book.repo;

import com.epam.homework.author.domain.Author;
import com.epam.homework.book.domain.Book;
import com.epam.homework.storage.CollectionStorage;

import java.util.ArrayList;
import java.util.List;

public class BookRepoCollectionImpl implements BookRepo {
    @Override
    public int count() {
        return CollectionStorage.getTotalBooks();
        //return Storage.bookList.size();
    }

    @Override
    public void print() {
        for (Book book : CollectionStorage.getAllBooks()) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
        /*for (Book book : Storage.bookList)
        {
            System.out.println(book.toString());
        }*/
    }

    @Override
    public void delete(Book book) {
        CollectionStorage.removeBook(book);
        //Storage.removeBookFromList(book);
    }

    @Override
    public Long add(Book book) {
        //Storage.addBookToList(book);
        CollectionStorage.addBook(book);
        return book.getId();
    }

    @Override
        public List<Book> findBooksByAuthor(Long id) {
        List<Book> booksForAuthor = new ArrayList<>();
        //for (Book book: Storage.bookList)
        for (Book book : CollectionStorage.getAllBooks())
        {
            for (Author author : book.getAuthors())
            {
                if ((author.getId().equals(id)))
                {
                    booksForAuthor.add(book);
                }
            }
        }
        return booksForAuthor;
    }

    @Override
    public Book findById(Long bookId) {
        for (Book book : CollectionStorage.getAllBooks()) {
            if (book != null && bookId.equals(book.getId())) {
                return book;
            }
        }

        return null;
    }
}
