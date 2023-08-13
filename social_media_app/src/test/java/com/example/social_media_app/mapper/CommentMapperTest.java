package com.example.social_media_app.mapper;
import com.example.social_media_app.entity.Comments;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest

public class CommentMapperTest {
    @Autowired
    private CommentMapper CommentMapper;

    @Test
    public void findByID(){
        Comments comment = CommentMapper.findById(1);
        System.out.println(comment);
    }

    @Test
    public void insert(){
        Comments comment = new Comments();

        comment.setComment_content("good!");
        comment.setUser_id(0);
        comment.setPost_id(1);
        CommentMapper.insert(comment);
    }

    @Test
    public void delete(){
        CommentMapper.delete(1);
    }

}
