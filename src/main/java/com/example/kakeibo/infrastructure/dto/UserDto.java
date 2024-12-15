package com.example.kakeibo.infrastructure;
import lombok.Data;
@Data
public class UserDto {
    private final String userName;
    private final int age;
    private final String gender;
    private final String address;
    
    public UserDto(String userName, int age, String gender, String address) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    
}