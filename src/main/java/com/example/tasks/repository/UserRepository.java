package com.example.tasks.repository;

import com.example.tasks.domain.user.Role;
import com.example.tasks.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    void create(User user);
    void update(User user);
    void insertUserRole(Long userId, Role role);
    boolean isTaskOwner(Long userId, Long taskId);
    void delete(Long userId);
}
