package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void registerUser(@RequestBody User user) {
        userService.registerUser(user);
    }

}
