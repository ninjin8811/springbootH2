package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserRestController {
	@Autowired
	UserService userService;

	@CrossOrigin
	@GetMapping
	List<User> getUsers() {
		System.out.println("getUsers");
		List<User> users = userService.findAll();
		return users;
	}

	@CrossOrigin
	@PutMapping(path = "{id}")
	User putUser(@PathVariable Integer id, @RequestBody User user) {
		System.out.println("putUser");
		user.setId(id);
		System.out.println(user);
		return userService.update(user);
	}
}
