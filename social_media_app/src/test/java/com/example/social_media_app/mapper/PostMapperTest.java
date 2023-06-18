package com.example.social_media_app.mapper;
import com.example.social_media_app.entity.Posts;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@ExtendWith(MockitoExtension.class)
@SpringBootTest

public class PostMapperTest {
    @Autowired
    private PostMapper PostMapper;

    @Test
    public void findByID(){
        Posts post = PostMapper.findById(1);
        System.out.println(post);
    }

    @Test
    public void insert(){
        Posts post = new Posts();

        post.setPost_content("Hello World!");
        post.setUser_id(1);
        PostMapper.insert(post);
    }

    @Test
    public void delete(){
        PostMapper.delete(1);
    }

    @Test
    public void update(){
        PostMapper.update(1,"Hello!");
        Posts post = PostMapper.findById(1);
        System.out.println(post);
    }
}
