package com.epam.homework.book.domain;

import ru.yusdm.stud.lesson_6_2_collection_list.homework.book.domain.Book;

public class PrintedBook extends Book {
    private String fontFamily;

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "fontFamily='" + fontFamily + '\'' +
                '}';
    }
}
