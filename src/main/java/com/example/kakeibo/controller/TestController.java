package com.example.kakeibo.controller;
import com.example.kakeibo.application.PersonUsecase;
import com.example.kakeibo.domain.Person;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @Autowired
    PersonUsecase usecase;

    @PostMapping(value="/register-info")
    public void registerInfo(@RequestBody Map<String, Object> requestBody) {

        String name = (String) requestBody.get("name");
        int age = (int) requestBody.get("age");

        usecase.registerInfo(name, age);

    }

    @GetMapping(value="/test")
    public Person test() {
        System.out.println("test");
        return new Person("Taro", 28);
    }
}