package com.epam.homework.book.repo;

import com.epam.homework.Storage;
import com.epam.homework.author.domain.Author;
import com.epam.homework.book.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepoCollectionImpl implements BookRepo {
    @Override
    public int count() {
        return Storage.bookList.size();
    }

    @Override
    public void print() {
        for (Book book : Storage.bookList)
        {
            System.out.println(book.toString());
        }

    }

    @Override
    public void delete(Book book) {
        Storage.removeBookFromList(book);
    }

    @Override
    public Long add(Book book) {
        Storage.addBookToList(book);
        return book.getId();
    }

    @Override
        public List<Book> findBooksByAuthor(Long id) {
        List<Book> booksForAuthor = new ArrayList<>();
        for (Book book: Storage.bookList)
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
}
