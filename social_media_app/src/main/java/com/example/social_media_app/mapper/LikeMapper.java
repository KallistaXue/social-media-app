package com.example.social_media_app.mapper;
import com.example.social_media_app.entity.Likes;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface LikeMapper {
    Likes findById(int like_id);
    Integer insert(Likes likes);
    Integer delete(int comment_id);
}
