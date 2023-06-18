package com.example.social_media_app.service;
import com.example.social_media_app.entity.Users;
import com.example.social_media_app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean userLogin(String username, String password) {
        Users temp_user = userMapper.findByUsername(username);
        return (temp_user.getPassword().equals(password));
    }

    public int userRegister(String username, String firstname, String lastname, String email,
                        String password, String date_of_birth) {
        Users temp_user = new Users();
        temp_user.setUsername(username);
        temp_user.setFirstname(firstname);
        temp_user.setLastname(lastname);
        temp_user.setEmail(email);
        temp_user.setPassword(password);
        temp_user.setDate_of_birth(date_of_birth);
        return userMapper.insert(temp_user);
    }

    public Users userInfo(int user_id) {
        return userMapper.findById(user_id);
    }

    public int userDelete(int user_id) {
        return userMapper.delete(user_id);
    }

    public int userUpdate(int user_id, String username, String firstname, String lastname, String email,
                      String password, String date_of_birth) {
        return userMapper.update(user_id, username, firstname, lastname, email, password, date_of_birth);
    }
}
