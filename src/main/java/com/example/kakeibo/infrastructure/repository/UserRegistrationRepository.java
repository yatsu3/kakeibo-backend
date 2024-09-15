package com.example.kakeibo.infrastructure;

import com.example.kakeibo.domain.repository.IUserRegistrationRepository;
import com.example.kakeibo.infrastructure.mapper.UserRegistrationMapper;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRegistrationRepository implements IUserRegistrationRepository{

    public static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserRegistrationMapper mapper;

    @Override
    public boolean isUserExists(String email) {
        
        if (mapper.isUserExists(email)) {
            return true;
        }
        return false;
        
    }
    
    @Override
    public void registerUser(UserRegistrationRequest request) {
        mapper.insertUser(request);
    }
}