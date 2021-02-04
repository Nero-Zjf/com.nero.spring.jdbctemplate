package com.nero.spring.jdbctempate.service;

import com.nero.spring.jdbctempate.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> getUsers();
}
