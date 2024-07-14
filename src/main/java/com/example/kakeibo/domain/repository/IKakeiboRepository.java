package com.example.kakeibo.domain.repository;
import com.example.kakeibo.domain.Kakeibo;
import com.example.kakeibo.infrastructure.KakeiboDto;
import java.util.List;

public interface IKakeiboRepository {
    void registerKakeibo(Kakeibo kakeibo);

    List<KakeiboDto> getReport();
}