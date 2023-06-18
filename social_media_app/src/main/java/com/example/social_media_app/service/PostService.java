package com.example.social_media_app.service;
import com.example.social_media_app.entity.Posts;
import com.example.social_media_app.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PostService {
    @Autowired
    private PostMapper postMapper;
    public int postCreate(int user_id, String post_content) {
        Posts temp_post = new Posts();
        temp_post.setPost_content(post_content);
        temp_post.setUser_id(user_id);
        return postMapper.insert(temp_post);
    }

    public Posts postInfo(int post_id) {
        return postMapper.findById(post_id);
    }

    public int postDelete(int post_id) {
        return postMapper.delete(post_id);
    }

    public int postUpdate(int post_id, String post_content) {
        return postMapper.update(post_id, post_content);
    }

}
