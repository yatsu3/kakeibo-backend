package com.example.kakeibo.application;

import com.example.kakeibo.domain.service.UserRegistrationService;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationUsecase {
    @Autowired
    UserRegistrationService service;

    public void registerUser(UserRegistrationRequest request) throws Exception {
        System.out.println("usecase");
        service.registerUser(request);
        
    }
}
