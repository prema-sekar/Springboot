package com.restdemo.controller1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.restdemo.dto.Users;

@RestController
public class Postcontroller {
	@PostMapping("/save")
	public String saveUsersData(@RequestBody Users users) {
		if(users.getUserName().equals("Prema")) {
			return "valid username";
		}
		return"Invalid user";
}
}
