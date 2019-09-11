package com.epam.homework.common.repo;

public interface BaseRepo<T, ID> {
    int count();

    void print();

    void delete(T t);

    ID add(T t);

    T findById(ID id);
}
