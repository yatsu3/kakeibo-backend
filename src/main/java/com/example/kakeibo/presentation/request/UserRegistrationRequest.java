package com.example.kakeibo.presentation.request;
import lombok.Data;
@Data
public class UserRegistrationRequest {
    private String userName;
    private String gender;
    private int age;
    private String address;

}