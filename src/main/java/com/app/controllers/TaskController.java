package com.app.controllers;

import com.app.models.Task;
import com.app.repositories.TaskRepository;

import java.util.List;

public class TaskController {
    private final TaskRepository taskRepository = new TaskRepository();

    public void create(Task task) {
        taskRepository.create(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(long id) {
        return taskRepository.findById(id);
    }

    public void update(Task task) {
        taskRepository.update(task);
    }

    public void delete(long id) {
        taskRepository.delete(id);
    }
}
