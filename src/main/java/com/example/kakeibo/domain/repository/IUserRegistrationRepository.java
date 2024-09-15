package com.example.kakeibo.domain.repository;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;

public interface IUserRegistrationRepository {
    void registerUser(UserRegistrationRequest request);

    boolean isUserExists(String emailAddress);
}