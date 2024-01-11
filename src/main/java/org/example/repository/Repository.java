package org.example.repository;

import java.util.*;
public interface Repository <T>{
    List<T> findAll();

    T getById(Integer id);

    void save(T t);

    void delete(Integer id);
}
