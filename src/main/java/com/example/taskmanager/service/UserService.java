package com.example.taskmanager.service;

import com.example.taskmanager.model.User;
import java.util.Optional;
import java.util.List;

public interface UserService {
    User registerUser(User user);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
