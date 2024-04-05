package com.jwt.example.jwtexample.Service;

import com.jwt.example.jwtexample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> user = new ArrayList<>();

    public UserService(){
        user.add(new User(UUID.randomUUID().toString(),"manoj","abc@gmail.com"));
        user.add(new User(UUID.randomUUID().toString(),"sanoj","cde@gmail.com"));
        user.add(new User(UUID.randomUUID().toString(),"mahesh","efd@gmail.com"));
        user.add(new User(UUID.randomUUID().toString(),"suraj","oiy@gmail.com"));
    }
    public List<User> getAllUser(){
        return this.user;
    }
}
