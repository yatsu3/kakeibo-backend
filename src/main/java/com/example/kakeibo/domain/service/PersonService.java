package com.example.kakeibo.domain.service;
import com.example.kakeibo.domain.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    IPersonRepository repository;
    
    public void registerInfo(String name, int age) {
        repository.registerInfo(name, age);
    }
}
