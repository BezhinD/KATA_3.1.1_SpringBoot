package com.example.KATA_31.__SpringBoot.service;

import com.example.KATA_31.__SpringBoot.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User show(int id);

    void save(User user);

    void update(User user);

    void delete(int id);


}
