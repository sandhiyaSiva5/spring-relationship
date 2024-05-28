package com.example.Spring.relationship.Service;

import com.example.Spring.relationship.modal.User;
import com.example.Spring.relationship.reposetrey.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;



@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User getUser(Long userId){
        return userRepository.findById(userId).get();
    }
    public List<User> getallUser(){
        return userRepository.findAll();
    }
}

