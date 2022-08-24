
package com.example.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homeloan.model.User;
import com.example.homeloan.service.UserService;

@RestController
@RequestMapping("/homeloan")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String add(@RequestBody User user) {
		userService.saveUser(user);
		return "New user is added";
	}
}
