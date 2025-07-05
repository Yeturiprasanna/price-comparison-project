package com.pricecompare.pricecompare_new.controller;

import com.pricecompare.pricecompare_new.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public boolean login(@RequestBody UserLoginRequest request) {
        return userService.validateLogin(request.getUsername(), request.getPassword());
    }

    static class UserLoginRequest {
        private String username;
        private String password;

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}