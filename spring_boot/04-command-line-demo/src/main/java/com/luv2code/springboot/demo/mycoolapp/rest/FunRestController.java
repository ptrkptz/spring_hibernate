package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	// expose '/' that returns 'Hello World'
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!  Time on server is " +LocalDateTime.now();
	
	}
	// expose new endpoint for 'workout'
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a 5k, bitches!!!";
	}
	
	// expose new endpoint for 'fortune'
	@GetMapping("/fortune") 
	public String getDailyFortune(){
		return "Today is your lucky day";
	}
}
