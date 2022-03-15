package com.innovaway.kao1.service;

import com.innovaway.kao1.model.User;
import com.innovaway.kao1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public void processOAuthPostLogin(String email) {
        User existUser = repo.getUserByEmail(email);
        if (existUser == null) {
            User newUser = new User();
            newUser.setEmail(email);

            repo.save(newUser);
        }

    }
}
