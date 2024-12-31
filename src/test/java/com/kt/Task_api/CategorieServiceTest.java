package com.kt.Task_api;

import com.kt.Task_api.entity.Category;
import com.kt.Task_api.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class CategorieServiceTest {

    @Autowired
    CategoryService categoryService;



    @Test
    void createCategorie() {
        Category category = new Category();
        category.setName("test");

        categoryService.save(category);

        assertNotNull(category.getId());
        assertEquals("test", category.getName());


    }

    @Test
    void getCategorie() {
        List<Category> categories = categoryService.getAll();
        for (Category category : categories) {
            System.out.println(category);
        }
    }
}
