package com.pignora.pandora.service.impl;

import com.pignora.pandora.model.User;
import com.pignora.pandora.repository.UserRepository;
import com.pignora.pandora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void removeUser(String id) {
        User user = new User();
        user.setId(id);
        userRepository.delete(user);
    }
}
