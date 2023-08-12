package com.example.social_media_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.social_media_app.service.PostService;
@RestController
public class PostController {

    @Autowired
    PostService PostService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/posts/post-create")
    public Object postCreate(@RequestParam int user_id, @RequestParam String post_content){
        return PostService.postCreate(user_id, post_content);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/posts/post-info/{post_id}")
    public Object postInfo(@PathVariable int post_id){
        return PostService.postInfo(post_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value = "/posts/post-delete/{post_id}")
    public Object postDelete(@PathVariable int post_id){
        return PostService.postDelete(post_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT, value = "/posts/post-update/{post_id}")
    public Object postUpdate(@PathVariable int post_id, @RequestParam String post_content){
        return PostService.postUpdate(post_id, post_content);
    }

}
