package com.kt.Task_api.controller;

import java.util.List;

public interface CrudControllerInterface<T> {

    List<T> getAll();

    T getById(Long id);

    T create(T entity);

    T update(T entity);

    void delete(Long id);
}
