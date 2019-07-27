package com.CTW.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> listUsers() {
        return userService.listUsers();
    }

    @GetMapping("/role")
    public User determineRole(Authentication authentication) {
        if (authentication == null) {
            return new User(1, "VISITOR");
        }
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = getUserByUserName(userDetails.getUsername());
        return new User(1, user.getRole());
    }


    @GetMapping("/user")
    public User geUserDetails(Authentication authentication) {
        if (authentication == null) {
            return new User(1, "VISITOR");
        }
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return getUserByUserName(userDetails.getUsername());
    }

    private User getUserByUserName(String userName) {
        return userService.getUserByUserName(userName);
    }

}
