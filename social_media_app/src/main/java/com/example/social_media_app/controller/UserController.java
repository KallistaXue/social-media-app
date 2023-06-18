package com.example.social_media_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.social_media_app.service.UserService;
@RestController
public class UserController {

    @Autowired
    UserService UserService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/users/user-login")
    public Object userLogin(@RequestParam String username, @RequestParam String password){
        return UserService.userLogin(username, password);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/users/user-register")
    public Object userRegister(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname,
                           @RequestParam String email, @RequestParam String password, @RequestParam String date_of_birth){
        return UserService.userRegister(username, firstname, lastname, email, password, date_of_birth);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/users/user-info/{user_id}")
    public Object userInfo(@PathVariable int user_id){
        return UserService.userInfo(user_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value = "/users/user-delete/{user_id}")
    public Object userDelete(@PathVariable int user_id){
        return UserService.userDelete(user_id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT, value = "/users/user-update/{user_id}")
    public Object userUpdate(@PathVariable int user_id, @RequestParam String username, @RequestParam String firstname,
                             @RequestParam String lastname, @RequestParam String email, @RequestParam String password,
                             @RequestParam String date_of_birth){
        return UserService.userUpdate(user_id, username, firstname, lastname, email, password, date_of_birth);
    }

}
