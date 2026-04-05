package org.jsp.Zorvyn_Assignment.controller;

import java.util.List;

import org.jsp.Zorvyn_Assignment.model.User;
import org.jsp.Zorvyn_Assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PutMapping("/{id}/role")
    public User updateRole(@PathVariable Long id, @RequestBody User user) {
        return service.updateRole(id, user);
    }

    @PutMapping("/{id}/status")
    public User updateStatus(@PathVariable Long id, @RequestBody User user) {
        return service.updateStatus(id, user);
    }
}