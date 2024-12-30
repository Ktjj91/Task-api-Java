package com.kt.Task_api.controller;

import com.kt.Task_api.entity.Category;
import com.kt.Task_api.service.CategoryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/cat")
public class CategorieController implements CrudControllerInterface<Category> {

    private final CategoryService categoryService;
    public CategorieController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getAll() {
        return this.categoryService.getAll();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getById( @PathVariable Long id) {
        return this.categoryService.findById(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public Category create(Category category) {
        return this.categoryService.save(category);
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public Category update(Category category) {
        return this.categoryService.update(category);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete( @PathVariable Long id) {
        this.categoryService.deleteById(id);
    }
}
