package com.example.kakeibo.infrastructure;

import com.example.kakeibo.domain.Kakeibo;
import com.example.kakeibo.domain.repository.IKakeiboRepository;
import com.example.kakeibo.infrastructure.mapper.KakeiboMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KakeiboRepository implements IKakeiboRepository{
    
    @Autowired
    KakeiboMapper mapper;
    
    @Override
    public void registerKakeibo(Kakeibo kakeibo) {
        
        mapper.insertKakeibo(kakeibo);
    }

    @Override
    public List<KakeiboDto> getReport() {

        return mapper.getReport();
    }
}