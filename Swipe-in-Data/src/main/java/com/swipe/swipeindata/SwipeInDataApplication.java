package com.swipe.swipeindata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SwipeInDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwipeInDataApplication.class, args);
    }

}
