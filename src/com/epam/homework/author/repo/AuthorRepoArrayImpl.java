package com.epam.homework.author.repo;

import com.epam.homework.author.domain.Author;
import com.epam.homework.storage.ArrayStorage;


public class AuthorRepoArrayImpl implements AuthorRepo {
    @Override
    public int count() {
        return ArrayStorage.getTotalAuthors();
        /*int result = 0;

        for (Author author : Storage.authors) {
            if (author != null) {
                result++;
            }
        }
        return result;*/
    }

    @Override
    public void print() {
        for (Author author : ArrayStorage.getAllAuthors()) {
            if (author != null) {
                System.out.println(author.toString());
            }
        }
        /*for (Author author : Storage.authors) {
            if (author != null) {
                System.out.println(author.toString());
            }
        }*/
    }

    @Override
    public void delete(Author author) {
        //Storage.removeAuthor(author);
        ArrayStorage.removeAuthor(author);
    }

    @Override
    public Long add(Author author) {
        //Storage.addAuthor(author);
        ArrayStorage.addAuthor(author);
        return author.getId();
    }

    @Override
    public Author findById(Long authorId) {
        for (Author author : ArrayStorage.getAllAuthors()) {
            if (author != null && authorId.equals(author.getId())) {
                return author;
            }
        }

        return null;
    }

    /*public Author[] findAuthorsByBook(long id) {
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
    }*/

}
