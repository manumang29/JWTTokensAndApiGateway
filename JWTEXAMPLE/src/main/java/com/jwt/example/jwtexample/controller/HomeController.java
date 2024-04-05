package com.jwt.example.jwtexample.controller;

import com.jwt.example.jwtexample.Service.UserService;
import com.jwt.example.jwtexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public String getUser(){
        System.out.println("getting user information");
        return "Users";
    }
    @GetMapping("/users")
    public List<User> getallusers(){
        return this.userService.getAllUser();
    }
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
