package com.kt.Task_api.controller;

import com.kt.Task_api.entity.Task;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kt.Task_api.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController implements CrudControllerInterface<Task> {

   private final TaskService taskService;

   public TaskController(TaskService taskService) {
       this.taskService = taskService;
   }


    @Override
    @RequestMapping(method = RequestMethod.GET)
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Task getById(@PathVariable Long id) {
        return taskService.findById(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public Task create(Task task) {
        return taskService.save(task);
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public Task update(Task task) {
        return taskService.update(task);
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(Long id) {
        taskService.deleteById(id);
    }
}
