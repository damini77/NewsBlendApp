package com.example.newsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // This refers to login.html in the templates directory
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup"; // This refers to signup.html in the templates directory
    }

    @GetMapping("/forgot-password")
    public String showForgotPasswordPage() {
        return "forgot-password"; // This refers to forgot-password.html in the templates directory
    }

    @GetMapping("/")
    public String showIndexPage() {
        return "index"; // This refers to index.html in the templates directory
    }
}

