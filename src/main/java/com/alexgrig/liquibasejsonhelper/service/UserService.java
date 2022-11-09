package com.alexgrig.liquibasejsonhelper.service;

import com.alexgrig.liquibasejsonhelper.entity.User;
import com.alexgrig.liquibasejsonhelper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
