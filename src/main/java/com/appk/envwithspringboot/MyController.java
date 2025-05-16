package com.appk.envwithspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class MyController {
    @Value("${MY_GREETING:not found this variable from env file}")
    private String greet;
    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting(){
        return ResponseEntity.ok(greet+"!");
    }
}
