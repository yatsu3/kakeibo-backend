package com.example.kakeibo.infrastructure.mapper;

import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserRegistrationMapper {
    
    @Select("SELECT CASE WHEN ( SELECT COUNT(*) FROM USER_AUTH WHERE MAIL_ADDRESS = #{mailAddress} ) > 0 THEN true ELSE false END;") 
    boolean isUserExists(@Param("mailAddress") String mailAddress);

    @Insert("""
    -- USER_AUTH テーブルにデータを挿入し、生成された USER_AUTH_ID を取得
    WITH inserted_auth AS (
        INSERT INTO USER_AUTH (MAIL_ADDRESS, PASSWORD)
        VALUES (#{request.mailAddress}, #{request.password})
        RETURNING USER_AUTH_ID
    )
    
    -- USERS テーブルにデータを挿入
    INSERT INTO USERS (USER_NAME, GENDER, AGE, ADDRESS, USER_AUTH_ID)
    SELECT #{request.userName}, #{request.gender}, #{request.age}, #{request.address}, USER_AUTH_ID
    FROM inserted_auth;
    """)
    void insertUser(@Param("request") UserRegistrationRequest request);


}