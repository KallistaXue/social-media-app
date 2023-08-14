package com.example.social_media_app.mapper;
import com.example.social_media_app.entity.Likes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest

public class LikeMapperTest {
    @Autowired
    private LikeMapper LikeMapper;

    @Test
    public void findByID(){
        Likes like = LikeMapper.findById(1);
        System.out.println(like);
    }

    @Test
    public void insert(){
        Likes like = new Likes();

        like.setUser_id(0);
        like.setPost_id(1);
        LikeMapper.insert(like);
    }

    @Test
    public void delete(){
        LikeMapper.delete(1);
    }

}
