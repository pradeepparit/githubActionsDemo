package com.githubActions.githubActionsDemo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @GetMapping("/hello")
    public ResponseEntity<String> demo() {
        System.out.println("Hello World");
        return ResponseEntity.ok("Hello World");
    }
}
