package com.example.kakeibo.infrastructure;

import com.example.kakeibo.domain.repository.IPersonRepository;
import com.example.kakeibo.infrastructure.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository implements IPersonRepository{
    @Autowired
    PersonMapper mapper;
    
    @Override
    public void registerInfo(String name, int age) {
        mapper.insertInfo(name, age);
    }
}