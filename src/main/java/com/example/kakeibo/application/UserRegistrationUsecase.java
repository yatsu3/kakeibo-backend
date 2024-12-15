package com.example.kakeibo.application;

import com.example.kakeibo.domain.service.UserRegistrationService;
import com.example.kakeibo.infrastructure.UserDto;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationUsecase {
    @Autowired
    UserRegistrationService service;

    public void registerUser(UserRegistrationRequest request, String userId) throws Exception {
        service.registerUser(request, userId);
        
    }

    public UserDto getUser(String firebaseId) {
        return service.getUser(firebaseId);
    }
}
