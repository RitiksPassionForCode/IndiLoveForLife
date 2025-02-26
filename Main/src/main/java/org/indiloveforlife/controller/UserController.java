package org.indiloveforlife.controller;

import org.indiloveforlife.entity.User;
import org.indiloveforlife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void registerUser(@RequestBody User user){
        userService.registerUser(user);
    }

}
