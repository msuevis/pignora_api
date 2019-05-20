package com.pignora.pandora.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.pignora.pandora.model.User;
import com.pignora.pandora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users/", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public Iterable<User> getAll(){
        return userService.findAll();
    }


    @GetMapping("{id}")
    public User one(@PathVariable String id) {

        return userService.findById(id).get();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {

        userService.removeUser(id);

    }


}
