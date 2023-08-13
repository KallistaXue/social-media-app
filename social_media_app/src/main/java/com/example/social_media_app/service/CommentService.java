package com.example.social_media_app.service;
import com.example.social_media_app.entity.Comments;
import com.example.social_media_app.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;
    public int commentCreate(int user_id, int post_id, String comment_content) {
        Comments temp_comment = new Comments();
        temp_comment.setComment_content(comment_content);
        temp_comment.setUser_id(user_id);
        temp_comment.setPost_id(post_id);
        return commentMapper.insert(temp_comment);
    }

    public Comments commentInfo(int comment_id) {
        return commentMapper.findById(comment_id);
    }

    public int commentDelete(int comment_id) {
        return commentMapper.delete(comment_id);
    }

}
