package com.example.tasks.service;

import com.example.tasks.domain.user.User;

public interface UserService {
    User getById(Long id);
    User getByUsername(String username);

    User create(User user);
    User update(User user);
    void delete(Long userId);
    boolean isTaskOwner(Long userId, Long taskId);
}
