package com.example.social_media_app.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.social_media_app.entity.Posts;
@Mapper
public interface PostMapper {
    Posts findById(int post_id);
    Integer insert(Posts post);
    Integer delete(int post_id);
    Integer update(int post_id, String post_content);
}
