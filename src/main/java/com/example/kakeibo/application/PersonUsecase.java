package com.example.kakeibo.application;

import com.example.kakeibo.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonUsecase {
    @Autowired
    PersonService service;

    public void registerInfo(String name, int age) {
        service.registerInfo(name, age);
    }
}
