package com.kt.Task_api;

import com.kt.Task_api.entity.Task;
import com.kt.Task_api.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TaskServiceTests {

    @Autowired
    private TaskService taskService;

    @Test
    public void testCreateTask() {
        Task task = new Task();

    }

}
