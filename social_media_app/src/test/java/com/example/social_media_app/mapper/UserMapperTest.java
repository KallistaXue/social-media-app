package com.example.social_media_app.mapper;
import com.example.social_media_app.entity.Users;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper UserMapper;

    @Test
    public void findById(){
        Users user = UserMapper.findById(1);
        System.out.println(user);
    }

    @Test
    public void findByName(){
        Users user = UserMapper.findByUsername("testUsername");
        System.out.println(user);
    }

    @Test
    public void insert(){
        Users user = new Users();

        user.setUsername("testUsername");
        user.setFirstname("testFirst") ;
        user.setLastname("testLast");
        user.setEmail("user1@gmail.com");
        user.setPassword("123456");
        user.setDate_of_birth("1990-09-29");
        UserMapper.insert(user);
    }

    @Test
    public void delete(){
        UserMapper.delete(2);
    }

    @Test
    void update(){
        UserMapper.update(1, "updatedUsername", "updatedFirst", "updatedLast",
                "updateduser1@gmail.com", "12345678", "1999-11-01");
        Users user = UserMapper.findById(1);
        System.out.println(user);
    }
}
