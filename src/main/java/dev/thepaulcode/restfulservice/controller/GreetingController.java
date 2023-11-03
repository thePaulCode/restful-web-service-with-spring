package dev.thepaulcode.restfulservice.controller;

import dev.thepaulcode.restfulservice.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    // Define a constant template for the greeting message
    public static final String template = "Hello, %s";

    // Initialize a counter for generating unique IDs
    public final AtomicLong counter = new AtomicLong();

    // Handle GET requests to the "/greeting" endpoint
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        // Create and return a Greeting object with an incremented counter and a formatted greeting message
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

