package com.xinian.springboot.controller;

import com.xinian.springboot.entity.User;
import com.xinian.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


/**
 * @author xinian
 * @date 2018/12/31 15:04
 */
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") Integer id){
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	@PostMapping("/user/user")
	public User saveUser(User user){
		User u1 = userRepository.save(user);
		return u1;
	}
}
