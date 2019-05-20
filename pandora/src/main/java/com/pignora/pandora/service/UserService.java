package com.pignora.pandora.service;

import com.pignora.pandora.model.User;

import java.util.Optional;

public interface UserService {

    public Iterable<User> findAll();

    public User save(User user);

    public Optional<User> findById(String id);

    public void removeUser(String id);
}
