package com.example.demo.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldResource
 *
 * @author star
 */
@RestController
@RequestMapping("/api")
public class HelloWorldResource {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        String message = "Hello World!";
        return ResponseEntity.ok(message);
    }
	
	@GetMapping("/hello1")
    public ResponseEntity<String> helloWorldNew() {
        String message = "Hello World!";
        return ResponseEntity.ok(message);
    }
	
	@GetMapping("/hello2")
    public ResponseEntity<String> helloWorldNew1() {
        String message = "Hello World!";
        return ResponseEntity.ok(message);
    }
	
	@GetMapping("/hello3")
    public ResponseEntity<String> helloWorldNew2() {
        String message = "Hello World!";
        return ResponseEntity.ok(message);
    }
	
	@GetMapping("/hello4")
    public ResponseEntity<String> helloWorldNew3() {
        String message = "Hello World!";
        return ResponseEntity.ok(message);
    }	
	
	@GetMapping("/hello5")
    public ResponseEntity<String> helloWorldNew4() {
    }
	
	@GetMapping("/hello6")
    public ResponseEntity<String> helloWorldNew5() {
        String message = "Hello World!";
        return ResponseEntity.ok(message);
    }
}
