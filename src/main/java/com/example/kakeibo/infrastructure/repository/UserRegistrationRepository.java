package com.example.kakeibo.infrastructure;

import com.example.kakeibo.domain.repository.IUserRegistrationRepository;
import com.example.kakeibo.infrastructure.mapper.UserRegistrationMapper;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRegistrationRepository implements IUserRegistrationRepository{

    @Autowired
    UserRegistrationMapper mapper;

    @Override
    public boolean isUserExist(String userId) {
        System.out.println("aaa");
        return mapper.isUserExist(userId);
    }

    @Override
    public void updateUser(UserRegistrationRequest request, String userId) {
        System.out.println("update");
        mapper.updateUser(request, userId);
        System.out.println("comp");
    }
    
    @Override
    public void insertUser(UserRegistrationRequest request, String userId) {
        System.out.println("insert");
        mapper.insertUser(request, userId);
        System.out.println("comp");
    }

    @Override
    public UserDto getUser(String firebaseId) {
        return mapper.getUser(firebaseId);
    }
}