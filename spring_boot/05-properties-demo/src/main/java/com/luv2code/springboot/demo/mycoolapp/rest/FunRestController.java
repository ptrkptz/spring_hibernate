package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for 'teamInfo'
    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach: " + coachName + " Team Name: " + teamName;
    }

    // expose '/' that returns 'Hello World'
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!  Time on server is " + LocalDateTime.now();

    }

    // expose new endpoint for 'workout'
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a 5k, bitches!!!";
    }

    // expose new endpoint for 'fortune'
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }

}