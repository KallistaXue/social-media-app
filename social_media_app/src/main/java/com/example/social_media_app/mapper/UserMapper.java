package com.example.social_media_app.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.social_media_app.entity.Users;

@Mapper
public interface UserMapper {
    Users findById(int user_id);
    Users findByUsername(String username);
    Integer insert(Users user);
    Integer delete(int user_id);
    Integer update(int user_id, String username, String firstname, String lastname, String email,
                   String password, String date_of_birth);

}
