package com.example.tasks.repository;

import com.example.tasks.domain.task.Task;
import com.example.tasks.domain.user.Role;
import com.example.tasks.domain.user.User;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Optional<Task> findById(Long id);
    List<Task> findByUserId(Long userId);
    void assignToUserById(Long taskId, Long userId);
    void create(Task task);
    void update(Task task);
    void delete(Long userId);
}
