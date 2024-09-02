package com.rest.demo.controller;

import java.util.HashMap;
import java.util.Map;
import com.restdemo.dto.Users;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/users")
	public Map<String, String> getUsers() {
		Map<String, String> user = new HashMap<>();
		user.put("Name", "Prema");
		user.put("Age", "22");
		user.put("Address", "Chennai");
		return user;
	}

	@GetMapping("/age")
	public int getAge() {
		return 22;
	}
	@GetMapping("/mark")
	public int addmark(@RequestParam("a") int op1,@RequestParam("b") int op2){
		return op1+op2;
	}
	@GetMapping("/sub")
	public int addsub(@RequestParam("a") int op1,@RequestParam("b") int op2) {
		return op1-op2;
}
	@GetMapping("/multiply/{a}/{b}")
	public int addmultiply(@PathVariable("a") int op1,@PathVariable("b") int op2) {
		return op1*op2;
	}
}
