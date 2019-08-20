package com.epam.homework.author.repo;

import com.epam.homework.Storage;
import com.epam.homework.author.domain.Author;
import com.epam.homework.book.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepoCollectionImpl implements AuthorRepo {
    @Override
    public int count() {
        return Storage.authorList.size();
    }

    @Override
    public void print() {
        for (Author author : Storage.authorList)
        {
            System.out.println(author.toString());
        }
    }

    @Override
    public void delete(Author author) {
        Storage.removeAuthorFromList(author);
    }

    @Override
    public Long add(Author author) {
        Storage.addAuthorToList(author);
        return author.getId();
    }

    public List<Author> findAuthorsByBookList(long id) {
        List<Author> authorsByBook = new ArrayList<>();
        for (Author author : Storage.authorList)
        {
            for (Book book: author.getBooks())
            {
                if ((book.getId()).equals(id))
                {
                    authorsByBook.add(author);
                }
            }
        }

        return authorsByBook;
    }
}
