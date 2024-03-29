/*package com.epam.homework;

import com.epam.homework.author.domain.Author;
import com.epam.homework.book.domain.Book;

import java.util.ArrayList;
import java.util.List;

public final class Storage {
    public static final int CAPACITY = 10;


    public static Book[] books = new Book[CAPACITY];
    public static List<Book> bookList = new ArrayList<>();
    public static Long bookId = 1L;
    public static int bookIndex = 0;

    private Storage() {
    }

    public static void increaseBookIndex() {
        bookIndex++;
    }

    public static Author[] authors = new Author[CAPACITY];
    public static List<Author> authorList = new ArrayList<>();
    public static int authorIndex = 0;
    public static Long authorId = 1L;

    public static void increaseAuthorIndex() {
        authorIndex++;
    }

    public static void increaseAuthorsStorage() {

        Author[] authors = new Author[authorIndex + CAPACITY];
        //System.arraycopy();
        for (int i = 0; i < Storage.authors.length; i++) {
            authors[i] = Storage.authors[i];
        }

        Storage.authors = authors;
    }

    public static void addAuthor(Author author) {
        author.setId(authorId);

        if (authorIndex % (CAPACITY) == 0 && authorIndex != 0) {
            increaseAuthorsStorage();
        } else {
            authors[authorIndex] = author;
        }

        Storage.increaseAuthorIndex();
        authorId++;
    }

    public static void addAuthorToList (Author author)
    {
        authorList.add(author);
    }

    public static void addBook(Book book) {
        book.setId(bookId);
        if (bookIndex % (CAPACITY) == 0 && bookIndex != 0) {
            increaseBookIndex();
        } else {
            books[bookIndex] = book;
        }
        increaseBookIndex();
        bookId++;
    }

    public static void addBookToList (Book book)
    {
        bookList.add(book);
    }

    public static void removeBook(Book book) {
        /**
         *  [0] = A
         *  [1] = B
         *  [2] = C
         *  [3] = NULL
         */
/*        for (int i = 0; i < books.length; i++) {

            if (book.getId().equals(books[i].getId())) {
                books[i] = null;
                bookIndex--;
                break;
            }

        }
        /**
         *  [0] = A
         *  [1] = NULL
         *  [2] = C
         *  [3] = NULL
         */

/*        Book[] newBooks = new Book[books.length];
        int index = 0;
        for (Book b : books) {
            if (b != null) {
                newBooks[index] = b;
                index++;
            }
        }

        /**
         *  [0] = A
         *  [1] = C
         *  [2] = NULL
         *  [3] = NULL
         */
/*        books = newBooks;
    }

    public static void removeBookFromList (Book book)
    {
        bookList.remove(book);
    }

    public static void removeAuthor(Author author) {
        /**
         *  [0] = A
         *  [1] = B
         *  [2] = C
         *  [3] = NULL
         */
/*        for (int i = 0; i < authors.length; i++) {

            if (author.getId().equals(authors[i].getId())) {
                authors[i] = null;
                authorIndex--;
                break;
            }

        }
        /**
         *  [0] = A
         *  [1] = NULL
         *  [2] = C
         *  [3] = NULL
         */

/*        Author[] newAuthors = new Author[Storage.authors.length];
        int index = 0;
        for (Author a : authors) {
            if (a != null) {
                newAuthors[index] = a;
                index++;
            }
        }

        /**
         *  [0] = A
         *  [1] = C
         *  [2] = NULL
         *  [3] = NULL
         */
/*        authors = newAuthors;
    }

    public static void removeAuthorFromList (Author author) {
        authorList.remove(author);
    }
    }*/

