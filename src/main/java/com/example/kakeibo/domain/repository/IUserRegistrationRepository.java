package com.example.kakeibo.domain.repository;
import com.example.kakeibo.infrastructure.UserDto;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;

public interface IUserRegistrationRepository {

    boolean isUserExist(String userId);
    void insertUser(UserRegistrationRequest request, String userId);
    void updateUser(UserRegistrationRequest request, String userId);
    UserDto getUser(String firebaseId);

}