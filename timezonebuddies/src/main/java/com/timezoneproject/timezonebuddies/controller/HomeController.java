package com.timezoneproject.timezonebuddies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showLoginPage() {
        return "login"; // renders login.html from templates
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password) {
        // You can add validation logic here later
        return "index"; // renders index.html from templates
    }
}