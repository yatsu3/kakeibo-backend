package com.example.kakeibo.presentation.request;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Data
public class UserRegistrationRequest {
    private String userName;
    private String gender;
    private int age;
    private String address;
    private String mailAddress;
    private String password;

    public static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void setPassword(String password) {
        this.password = passwordEncoder.encode(password);
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

}