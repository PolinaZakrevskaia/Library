package com.epam.homework.catalog;

public class LibraryGenerator
{
    private static String generatedLibrary;

    private LibraryGenerator()
    {
        setGeneratedLibrary();
    }

    public String getGeneratedLibrary()
    {
        return generatedLibrary;
    }

    public void setGeneratedLibrary()
    {
        generatedLibrary = null;
    }
}
