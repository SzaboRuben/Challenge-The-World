package com.CTW.user;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> listUsers(){
        return userService.listUsers();
    }
}
