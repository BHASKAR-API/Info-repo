package com.fim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/get")
	public String heart() {
		return "Application Started Successfully remotely updated.............";
		

	}

	public void get()
	{}

}
