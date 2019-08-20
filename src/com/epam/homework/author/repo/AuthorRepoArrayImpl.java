package com.epam.homework.author.repo;


import com.epam.homework.Storage;
import com.epam.homework.author.domain.Author;
import com.epam.homework.book.domain.Book;

import java.util.List;

import static com.epam.homework.Storage.books;

public class AuthorRepoArrayImpl implements AuthorRepo {
    @Override
    public int count() {
        int result = 0;

        for (Author author : Storage.authors) {
            if (author != null) {
                result++;
            }
        }
        return result;
    }

    @Override
    public void print() {
        for (Author author : Storage.authors) {
            if (author != null) {
                System.out.println(author.toString());
            }
        }
    }

    @Override
    public void delete(Author author) {
        Storage.removeAuthor(author);
    }

    @Override
    public Long add(Author author) {
        Storage.addAuthor(author);
        return author.getId();
    }

    public Author[] findAuthorsByBook(long id) {
        Author[] authors = new Author[100];
        int index = 0;

        for (Author author : Storage.authors) {

            for (Book book : author.getBooks()) {
                if (book.getId().equals(id)) {
                    authors[index] = author;
                    index++;
                    break;
                }
            }

        }
        return authors;
    }

}
