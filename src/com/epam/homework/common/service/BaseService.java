package com.epam.homework.common.service;

public interface BaseService<T, ID> {
    int count();
    void print();
    void delete(T t);
    ID add(T t);
    T findById(ID id);
}
