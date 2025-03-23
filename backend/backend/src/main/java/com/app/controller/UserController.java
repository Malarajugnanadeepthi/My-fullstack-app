package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
