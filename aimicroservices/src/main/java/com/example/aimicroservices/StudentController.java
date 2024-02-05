package com.example.aimicroservices;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MyController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "hello-page";
    }
}