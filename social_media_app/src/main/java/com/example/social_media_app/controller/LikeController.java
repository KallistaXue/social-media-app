package com.example.social_media_app.controller;
import com.example.social_media_app.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikeController {

    @Autowired
    LikeService LikeService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/likes/like-create")
    public Object likeCreate(@RequestParam int user_id, @RequestParam int post_id){
        return LikeService.likeCreate(user_id, post_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/likes/like-info/{like_id}")
    public Object likeInfo(@PathVariable int like_id){
        return LikeService.likeInfo(like_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value = "/likes/like-delete/{like_id}")
    public Object likeDelete(@PathVariable int like_id){
        return LikeService.likeDelete(like_id);
    }

}

