package com.epam.homework.resources;

import com.epam.homework.author.InputAuthor;
import com.epam.homework.author.domain.Author;
import com.epam.homework.author.service.AuthorService;
import com.epam.homework.book.InputBook;
import com.epam.homework.book.domain.Book;
import com.epam.homework.book.domain.HandWrittenBook;
import com.epam.homework.book.domain.PrintedBook;
import com.epam.homework.book.service.BookService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Initiator {

    private static BookService bookService;
    private static AuthorService authorService;

    public enum InitType {
        FROM_FILE,
        RAM;
    }

    public static void initData (InitType initType)
    {
        if (initType == InitType.RAM)
        {
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
        if (initType == InitType.FROM_FILE)
        {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\JAVA\\Library\\src\\com\\epam\\homework\\resources\\InitFile"));)
            {
                String iniData = null;
                StringBuilder stringBuilder = new StringBuilder();
                String[] dataArray;
                while ((iniData=bufferedReader.readLine())!=null)
                {
                    dataArray = iniData.split(":");

                    InputBook inputBook1 = new InputBook();
                    inputBook1.setName(dataArray[0]);
                    inputBook1.setPublishYear(Integer.valueOf(dataArray[1]));
                    Book book1 = valueOfForHandWrittenBook(inputBook1);

                    InputBook inputBook2 = new InputBook();
                    inputBook2.setName(dataArray[2]);
                    inputBook2.setPublishYear(Integer.valueOf(3));
                    Book book2 = valueOfForHandWrittenBook(inputBook2);

                    InputAuthor inputAuthor = new InputAuthor();
                    inputAuthor.setLastName(dataArray[4]);
                    inputAuthor.setYearOfBorn(Integer.valueOf(dataArray[5]));
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
            }
            catch (FileNotFoundException e){System.out.println("File InitData is Not Found");}
            catch (IOException e) {System.out.println("The resource is not AutoCloseable");}


        }

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
