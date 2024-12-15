package com.example.kakeibo.domain.service;
import com.example.kakeibo.domain.repository.IUserRegistrationRepository;
import com.example.kakeibo.infrastructure.UserDto;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    IUserRegistrationRepository repository;
    
    public void registerUser(UserRegistrationRequest request, String userId) throws Exception {

        try {
            if (repository.isUserExist(userId)) {
                System.out.println("true");
                repository.updateUser(request, userId);
            } else {
                repository.insertUser(request, userId);
            }
        } catch(Exception e) {
            throw new Exception("ユーザー情報の更新に失敗しました。");
        }        
    }

    public UserDto getUser(String firebaseId) {
        return repository.getUser(firebaseId);
    }
}
