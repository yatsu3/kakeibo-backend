package com.example.kakeibo.presentation.controller;
import com.example.kakeibo.application.UserRegistrationUsecase;
import com.example.kakeibo.infrastructure.UserDto;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserRegistrationController {

    @Autowired
    UserRegistrationUsecase usecase;

    @PostMapping(value="/update-user")
    public void registerUser(@RequestBody UserRegistrationRequest request, @RequestHeader("UserId") String userId) throws Exception{

        usecase.registerUser(request,userId);

    }

    @GetMapping(value="/get-user")
    public UserDto getUser(@RequestHeader("userId") String firebaseId) {
        return usecase.getUser(firebaseId);
    }

}