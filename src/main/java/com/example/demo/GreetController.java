package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello User";
	}
	
	@RequestMapping("/")
	public String index() {
		return "<h1>Hello World!</h1>";
	}
	
}
