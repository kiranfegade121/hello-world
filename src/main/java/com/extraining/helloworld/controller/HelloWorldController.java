package com.extraining.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String greet() {
		return "<h1>Hello World!!!</h1>";		
	}
}
