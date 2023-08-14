package com.example.social_media_app.service;
import com.example.social_media_app.entity.Likes;
import com.example.social_media_app.mapper.LikeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    private LikeMapper likeMapper;
    public int likeCreate(int user_id, int post_id) {
        Likes temp_like = new Likes();
        temp_like.setUser_id(user_id);
        temp_like.setPost_id(post_id);
        return likeMapper.insert(temp_like);
    }

    public Likes likeInfo(int like_id) {
        return likeMapper.findById(like_id);
    }

    public int likeDelete(int like_id) {
        return likeMapper.delete(like_id);
    }

}
