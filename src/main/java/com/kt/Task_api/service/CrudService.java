package com.kt.Task_api.service;

import java.util.List;

public interface CrudService<T> {

    T save(T entity);

    T update(T entity);

    void deleteById(Long id);

    List<T> getAll();

    T findById(Long id);


}
