package com.example.kakeibo.application;

import com.example.kakeibo.domain.service.KakeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KakeiboUsecase {
    @Autowired
    KakeiboService service;

    public void registerKakeibo(String date, String contents, String category, String expenditure) {
        service.registerKakeibo(date, contents, category, expenditure);
    }
}
