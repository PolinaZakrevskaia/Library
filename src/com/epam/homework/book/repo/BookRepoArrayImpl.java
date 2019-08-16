package com.epam.homework.book.repo;

import ru.yusdm.stud.lesson_6_2_collection_list.homework.Storage;
import ru.yusdm.stud.lesson_6_2_collection_list.homework.author.domain.Author;
import ru.yusdm.stud.lesson_6_2_collection_list.homework.book.domain.Book;

public class BookRepoArrayImpl implements BookRepo {

    @Override
    public int count() {
        int result = 0;

        for (Book book : Storage.books) {
            if (book != null) {
                result++;
            }
        }
        return result;
    }

    @Override
    public void print() {
        for (Book book : Storage.books) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }

    @Override
    public void delete(Book book) {
        Storage.removeBook(book);
    }

    @Override
    public Long add(Book book) {
        Storage.addBook(book);
        return book.getId();
    }

    @Override
    public Book[] findBooksByAuthor(long id) {
        Book[] books = new Book[100];
        int index = 0;

        for (Book book : Storage.books) {

            for (Author a : book.getAuthors()) {
                if (a.getId().equals(id)) {
                    books[index] = book;
                    index++;
                    break;
                }
            }

        }

        //if no books then null
        return books;
    }
}
