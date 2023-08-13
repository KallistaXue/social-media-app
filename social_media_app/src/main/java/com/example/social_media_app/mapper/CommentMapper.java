package com.example.social_media_app.mapper;
import com.example.social_media_app.entity.Comments;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    Comments findById(int comment_id);
    Integer insert(Comments comments);
    Integer delete(int comment_id);
}
