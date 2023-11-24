package com.example.jenkensFirstSpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/hello")
	public String helloWorld() {
		
		return "Hello world from Ismail Saeed ";
	}

}
