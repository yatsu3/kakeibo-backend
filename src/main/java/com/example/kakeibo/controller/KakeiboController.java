package com.example.kakeibo.controller;
import com.example.kakeibo.application.KakeiboUsecase;
import com.example.kakeibo.infrastructure.KakeiboDto;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class KakeiboController {
    @Autowired
    KakeiboUsecase usecase;

    @PostMapping(value="/register-kakeibo")
    public void registerInfo(@RequestBody Map<String, Object> requestBody) {

        String date = (String)requestBody.get("date");
        String contents = (String)requestBody.get("contents");
        String category = (String)requestBody.get("category");
        String subTotal = (String)requestBody.get("subTotal");
        boolean isExpenses = (boolean)requestBody.get("isExpenses");

        usecase.registerKakeibo(date, contents, category, subTotal, isExpenses);

    }

    @GetMapping(value="/report")
    public List<KakeiboDto> getReport() {
        return usecase.getReport();
    }

}