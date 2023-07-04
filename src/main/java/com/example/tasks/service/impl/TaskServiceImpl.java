package com.example.tasks.service.impl;

import com.example.tasks.domain.task.Task;
import com.example.tasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getById(Long taskId) {
        return null;
    }

    @Override
    public Task getByUserId(Long userId) {
        return null;
    }

    @Override
    public void assignToUserById(Long taskId, Long userId) {

    }

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public void delete(Long taskId) {

    }
}
