package com.example.kakeibo.controller;
import com.example.kakeibo.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @GetMapping(value="/test")
    public Greeting test() {
        return new Greeting("Taro", 28);
    }
}