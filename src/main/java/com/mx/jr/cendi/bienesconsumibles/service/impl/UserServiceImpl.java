package com.mx.jr.cendi.bienesconsumibles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.jr.cendi.bienesconsumibles.model.User;
import com.mx.jr.cendi.bienesconsumibles.repository.UserRepository;
import com.mx.jr.cendi.bienesconsumibles.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean saveUser(User user) {
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}