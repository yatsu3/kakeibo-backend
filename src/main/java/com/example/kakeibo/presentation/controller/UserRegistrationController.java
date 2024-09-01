package com.example.kakeibo.presentation.controller;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserRegistrationController {

    @PostMapping(value="/register-user")
    public void registerUser(@RequestBody UserRegistrationRequest request) {

        System.out.println("request:" + request);

    }

}