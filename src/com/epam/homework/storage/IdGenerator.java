package com.epam.homework.storage;

public class IdGenerator {

    public static long id = 1;

    private IdGenerator() { }

    public static Long generateId() {
        return ++id;
    }

}
