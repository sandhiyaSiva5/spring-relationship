package com.example.Spring.relationship.controller;

import com.example.Spring.relationship.Service.UserService;
import com.example.Spring.relationship.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/{userId}")
    public User getUser(@PathVariable long userId){
        return userService.getUser(userId);
    }
    @GetMapping()
    public List<User> getAllUser(){
        return userService.getallUser();
    }
}
