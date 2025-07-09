package com.saikrishna.git_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
    @GetMapping("/login")
    public String login() {
        return "Logged in";
    }

    @GetMapping("/home")
    public String homePage() {
        return "At Home Page";
    }
}
