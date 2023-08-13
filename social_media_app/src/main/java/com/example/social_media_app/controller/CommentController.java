package com.example.social_media_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.social_media_app.service.CommentService;
@RestController
public class CommentController {

    @Autowired
    CommentService CommentService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/comments/comment-create")
    public Object commentCreate(@RequestParam int user_id, @RequestParam int post_id, @RequestParam String comment_content){
        return CommentService.commentCreate(user_id, post_id, comment_content);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/comments/comment-info/{comment_id}")
    public Object commentInfo(@PathVariable int comment_id){
        return CommentService.commentInfo(comment_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value = "/comments/comment-delete/{comment_id}")
    public Object commentDelete(@PathVariable int comment_id){
        return CommentService.commentDelete(comment_id);
    }


}

