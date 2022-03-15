package com.innovaway.kao1.controller;

import com.innovaway.kao1.model.User;
import com.innovaway.kao1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/login")
    public String loginSucc(String email) {
        userService.processOAuthPostLogin(email);
        return "listi is  ok ";
    }

}
