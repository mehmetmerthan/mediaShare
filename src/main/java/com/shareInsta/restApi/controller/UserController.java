package com.shareInsta.restApi.controller;

import com.shareInsta.restApi.business.UserService;
import com.shareInsta.restApi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/users") //@RequestMapping(value = "/users",method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping(value = "/users") //@RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getUser();
    }
    @RequestMapping(value = "/users/{userId}",method = RequestMethod.PUT)
    public User updateUser(@PathVariable(value = "userId") Integer id,@RequestBody User user){
        return userService.updateUser(id,user);
    }

}
