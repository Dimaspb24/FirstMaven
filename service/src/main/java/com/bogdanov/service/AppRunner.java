package com.bogdanov.service;

import com.bogdanov.service.service.UserService;

public class AppRunner {

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getUser(15L));
    }

}
