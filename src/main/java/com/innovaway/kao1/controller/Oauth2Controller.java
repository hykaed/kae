package com.innovaway.kao1.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2Controller {


    @GetMapping("/controller")
    public String getUserName(@AuthenticationPrincipal String email){
        return email;

    }
}
