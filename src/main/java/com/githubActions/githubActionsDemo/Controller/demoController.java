package com.githubActions.githubActionsDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class demoController {
    @GetMapping("/hello")
    public String demo() {
        System.out.println("Hello World");
        return "Hello World";
    }
}
