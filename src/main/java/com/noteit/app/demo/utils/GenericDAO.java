package com.noteit.app.demo.utils;

import java.util.List;

public interface GenericDAO<T> {

    T saveOrUpdate(T entity);

    T findById(Long id);

    List<T> findAll();

    boolean deleteById(Long id);
}
