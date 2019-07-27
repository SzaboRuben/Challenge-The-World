package com.CTW.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> listUsers() {
        return userDao.listUsers();
    }

    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName( userName);

    }
}
