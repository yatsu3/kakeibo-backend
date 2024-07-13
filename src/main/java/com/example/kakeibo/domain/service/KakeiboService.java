package com.example.kakeibo.domain.service;
import com.example.kakeibo.domain.Kakeibo;
import com.example.kakeibo.domain.repository.IKakeiboRepository;
import com.example.kakeibo.infrastructure.mapper.KakeiboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KakeiboService {
    @Autowired
    IKakeiboRepository repository;

    @Autowired
    KakeiboMapper mapper;
    
    public void registerKakeibo(String date, String contents, String category, String expenditure) {
        int id = mapper.getNextId();

        Kakeibo kakeibo = new Kakeibo(id, date, contents, category, expenditure);
        repository.registerKakeibo(kakeibo);
    }
}
