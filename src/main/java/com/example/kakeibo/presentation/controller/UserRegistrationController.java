package com.example.kakeibo.presentation.controller;
import com.example.kakeibo.application.UserRegistrationUsecase;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserRegistrationController {

    @Autowired
    UserRegistrationUsecase usecase;

    @PostMapping(value="/register-user")
    public void registerUser(@RequestBody UserRegistrationRequest request) throws Exception{

        System.out.println("request:" + request);

        usecase.registerUser(request);

        

    }

}