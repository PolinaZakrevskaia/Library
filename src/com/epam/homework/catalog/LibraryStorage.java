package com.epam.homework.catalog;


import java.util.Arrays;

public class LibraryStorage
{
    public static final int CAPACITY = 10;
    public static Book[] BOOKS = new Book[CAPACITY];
    public static Author[] AUTHORS = new Author[CAPACITY];

    private static int bookIndex=0;
    private static int authorIndex=0;

    public Author[] incrAuthorsStorage()
    {
        return AUTHORS = Arrays.copyOf(AUTHORS, AUTHORS.length+CAPACITY);
    }

    public Book[] incrBooksStorage()
    {
        return BOOKS = Arrays.copyOf(BOOKS, BOOKS.length+CAPACITY);
    }
}
