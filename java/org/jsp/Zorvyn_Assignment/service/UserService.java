package org.jsp.Zorvyn_Assignment.service;

import java.util.List;

import org.jsp.Zorvyn_Assignment.model.User;
import org.jsp.Zorvyn_Assignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	    @Autowired
	    private UserRepository userRepository;

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public User updateRole(Long id, User updatedUser) {
	        User user = userRepository.findById(id).orElseThrow();
	        user.setRole(updatedUser.getRole());
	        return userRepository.save(user);
	    }

	    public User updateStatus(Long id, User updatedUser) {
	        User user = userRepository.findById(id).orElseThrow();
	        user.setStatus(updatedUser.getStatus());
	        return userRepository.save(user);
	    }
	}

