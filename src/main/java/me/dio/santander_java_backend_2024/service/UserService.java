package me.dio.santander_java_backend_2024.service;

import me.dio.santander_java_backend_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}