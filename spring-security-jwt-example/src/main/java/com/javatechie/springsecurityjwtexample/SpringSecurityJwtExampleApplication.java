package com.javatechie.springsecurityjwtexample;

import com.javatechie.springsecurityjwtexample.entity.User;
import com.javatechie.springsecurityjwtexample.repo.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private  UserRepository userRepository;
    @PostConstruct
    public  void initUser() {
     List<User> users = Stream.of(new User(1,"manumang","password","email@id.com"),new User(2,"sunny","pwd1","abc@gmail.com")).collect(Collectors.toList());
        userRepository.saveAll(users);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);

    }

}
