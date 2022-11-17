package com.alexgrig.liquibasejsonhelper.service;

import com.alexgrig.liquibasejsonhelper.entity.User;
import com.alexgrig.liquibasejsonhelper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Page<User> findAllAsPage(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return userRepository.findAll(5, pageRequest);
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();

    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
