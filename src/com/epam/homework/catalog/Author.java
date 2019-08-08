package com.epam.homework.catalog;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Author
{
    private String firstName;
    private String lastName;
    private String country;
    private LocalDate birthDate;
    private Integer age;
    private ArrayList <String> books;

    public Author()
    {
        this.firstName = "Undefined";
        this.lastName = "Undefined";
        this.country = "Undefined";
        this.birthDate = null;
        this. age=null;
        System.out.println("Please define some parameters of Author");
    }

    public Author (String firstName, String lastName, String country, LocalDate birthDate)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.country=country;
        this.birthDate=birthDate;
        this.age = getAge();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        if (birthDate != null)
        {
            LocalDate localDate = LocalDate.now();
            Period period = Period.between(birthDate, localDate);
            age = period.getYears();
        }
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstNname() {
        return firstName;
    }

    public void setFirstNname(String firstNname) {
        this.firstName = firstNname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }

    public String toString()
    {
        String author = null;
        if (this.getFirstNname()!=null) author=author+getFirstNname();
        if (this.getLastName()!=null) author=author+" "+getLastName();
        return author;
    }
}
