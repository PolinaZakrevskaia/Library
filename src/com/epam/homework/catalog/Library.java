package com.epam.homework.catalog;

public class Library
{
     public static void printBooks()
     {
         for (Book book:LibraryStorage.BOOKS)
         {
             System.out.println(book.toString());
             System.out.println();
         }

     }

     public static void printAuthors()
     {
         for (Author author : LibraryStorage.AUTHORS)
         {
             System.out.println(author.toString());
             System.out.println();
         }

     }


}
