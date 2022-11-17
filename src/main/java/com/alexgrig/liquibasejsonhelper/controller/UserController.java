package com.alexgrig.liquibasejsonhelper.controller;

import com.alexgrig.liquibasejsonhelper.entity.Dog;
import com.alexgrig.liquibasejsonhelper.entity.User;
import com.alexgrig.liquibasejsonhelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/user/all")
    public List<User> allUsers() {
        return userService.findAll();
    }

    @GetMapping("/user/all/{page}/{size}")
    public Page<User> pageUsers(@PathVariable(name = "page", required = true) int page,
                                @PathVariable(name = "size", required = true) int size) {
         return userService.findAllAsPage(page, size);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable(name = "id", required = true) Long id) {
        User user = userService.findById(id);
        return user;
    }

    @PostMapping("user/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
