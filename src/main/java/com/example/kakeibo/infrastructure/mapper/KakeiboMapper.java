package com.example.kakeibo.infrastructure.mapper;

import com.example.kakeibo.domain.Kakeibo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface KakeiboMapper {

    @Select("SELECT nextval('kakeibo_sequence')")
    int getNextId();
    
    @Insert("INSERT INTO KAKEIBO (id, date, contents, category, sub_total, isExpenses) VALUES (#{kakeibo.id}, #{kakeibo.date}, #{kakeibo.contents}, #{kakeibo.category}, #{kakeibo.subTotal}, #{kakeibo.isExpenses})")
    void insertKakeibo(@Param("kakeibo") Kakeibo kakeibo);
}