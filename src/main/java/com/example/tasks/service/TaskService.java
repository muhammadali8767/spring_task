package com.example.tasks.service;

import com.example.tasks.domain.task.Task;

public interface TaskService {
    Task getById(Long taskId);
    Task getByUserId(Long userId);
    void assignToUserById(Long taskId, Long userId);
    Task create(Task task);
    Task update(Task task);
    void delete(Long taskId);
}
