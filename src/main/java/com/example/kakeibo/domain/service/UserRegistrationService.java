package com.example.kakeibo.domain.service;
import com.example.kakeibo.domain.repository.IUserRegistrationRepository;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    IUserRegistrationRepository repository;
    
    public void registerUser(UserRegistrationRequest request) throws Exception {

        // すでに存在するメールアドレスがある場合、エラー
        boolean isUserExists = repository.isUserExists(request.getMailAddress());
        if (isUserExists) {
            throw new Exception("ユーザーはすでに入力したメールアドレスで登録されています。");
        }
        
        repository.registerUser(request);
    }
}
