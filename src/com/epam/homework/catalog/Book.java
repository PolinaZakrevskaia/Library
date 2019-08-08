package com.epam.homework.catalog;

import java.util.ArrayList;

public class Book
{
    private String title;
    private String publisher;
    private Genre genre;
    private Integer pages;
    private ArrayList <String> authors;
    private Long id;

    private enum Genre
    {
        FANTASY,
        SCIENCE_FICTION,
        WESTERN,
        ROMANCE,
        THRILLER,
        MYSTERY,
        DETECTIVE_STORY,
        DYSTOPIA,
        UNDEFINED_GENRE
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book()
    {
        this.title="Title Undefined";
        this.publisher="Publisher Undefined";
        this.genre = Genre.UNDEFINED_GENRE;
        this.id = (long) (System.currentTimeMillis()+(Math.random()*10));

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String toString()
    {
        String book = null;
        if (this.getTitle()!=null) book=book+"\""+this.getTitle()+"\"";
        if (this.getPublisher()!=null) book=" "+book+" "+getPublisher();
        if (this.getPages()!=null) book=" "+getPages()+" p";
        if (this.getGenre()!=null) book=" "+getGenre();
        return book;
    }
}
