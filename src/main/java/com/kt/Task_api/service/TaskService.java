package com.kt.Task_api.service;

import com.kt.Task_api.entity.Task;
import com.kt.Task_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements CrudService<Task> {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public Task update(Task entity) {
        return this.taskRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        this.taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getAll() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task findById(Long id) {
        return this.taskRepository.findById(id).get();
    }
}
