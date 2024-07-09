package com.example.kakeibo.infrastructure.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PersonMapper {
    
    @Insert("INSERT INTO PERSON (name, age) VALUES (#{name}, #{age})")
    void insertInfo(@Param("name") String name, @Param("age")int age);
}