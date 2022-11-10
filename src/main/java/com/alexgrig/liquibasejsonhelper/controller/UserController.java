package com.alexgrig.liquibasejsonhelper.controller;

import com.alexgrig.liquibasejsonhelper.entity.User;
import com.alexgrig.liquibasejsonhelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/all")
    public List<User> allUsers() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable(name = "id", required = true) Long id) {
        return userService.findById(id);
    }

    @PostMapping("user/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
