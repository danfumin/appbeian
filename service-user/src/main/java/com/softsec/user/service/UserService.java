package com.softsec.user.service;

import com.softsec.user.mapper.UserMapper;
import com.softsec.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(int id) {
        return userMapper.findById(id);
    }
}