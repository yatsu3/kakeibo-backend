package com.example.kakeibo.infrastructure.mapper;

import com.example.kakeibo.infrastructure.UserDto;
import com.example.kakeibo.presentation.request.UserRegistrationRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface UserRegistrationMapper {
    
    @Select("SELECT CASE WHEN ( SELECT COUNT(*) FROM USERS WHERE firebase_id = #{firebaseId} ) > 0 THEN true ELSE false END;") 
    boolean isUserExist(@Param("firebaseId") String firebaseId);

    @Insert("""    
    -- USERS テーブルにデータを挿入
    INSERT INTO USERS (FIREBASE_ID, USER_NAME, GENDER, AGE, ADDRESS, CREATED_DATETIME, UPDATED_DATETIME)
    SELECT #{firebaseId}, #{request.userName}, #{request.gender}, #{request.age}, #{request.address}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
    """)
    void insertUser(@Param("request") UserRegistrationRequest request, @Param("firebaseId") String firebaseId);


    @Update("""
    -- USERS テーブルのデータを更新
    UPDATE USERS
    SET 
        USER_NAME = #{request.userName},
        GENDER = #{request.gender},
        AGE = #{request.age},
        ADDRESS = #{request.address},
        UPDATED_DATETIME = CURRENT_TIMESTAMP
    WHERE FIREBASE_ID = #{firebaseId}
    """)
    void updateUser(@Param("request") UserRegistrationRequest request, @Param("firebaseId") String firebaseId);
    


    @Select("""
    SELECT user_name, age, gender, address FROM USERS WHERE firebase_id = #{firebaseId}
    """) 
    UserDto getUser(@Param("firebaseId") String firebaseId);

}