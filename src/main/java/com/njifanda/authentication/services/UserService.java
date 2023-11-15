package com.njifanda.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.njifanda.authentication.models.LoginUser;
import com.njifanda.authentication.models.User;
import com.njifanda.authentication.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user, BindingResult result) {


//    	this.userRepository.save(user);
        return null;
    }
    public User login(LoginUser newLoginObject, BindingResult result) {

    	
        return null;
    }
}
