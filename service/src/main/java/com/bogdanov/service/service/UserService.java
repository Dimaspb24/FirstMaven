package com.bogdanov.service.service;

import com.bogdanov.database.dao.UserDao;
import com.bogdanov.service.dto.UserDto;

import java.util.Optional;


public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id).map(it -> new UserDto());
    }
}
