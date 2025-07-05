package com.pricecompare.pricecompare_new.service;

import com.pricecompare.pricecompare_new.entity.user;
import com.pricecompare.pricecompare_new.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean validateLogin(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).isPresent();
    }
}
