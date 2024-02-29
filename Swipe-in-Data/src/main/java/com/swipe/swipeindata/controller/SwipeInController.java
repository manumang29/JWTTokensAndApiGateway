package com.swipe.swipeindata.controller;

import com.swipe.swipeindata.entity.SwipeIn;
import com.swipe.swipeindata.repo.SwipeInRepository;
import com.swipe.swipeindata.service.EmployeeServiceClient;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swipeIn")
public class SwipeInController {
    private final SwipeInRepository swipeInRepository;
    private EmployeeServiceClient employeeServiceClient;
    @Autowired
    public SwipeInController(SwipeInRepository swipeInRepository,EmployeeServiceClient employeeServiceClient){
        this.swipeInRepository = swipeInRepository;
        this.employeeServiceClient = employeeServiceClient;
    }
    @PostMapping
    public ResponseEntity<String> addSwipeIn(@RequestBody SwipeIn swipeIn) {
        try {
            ResponseEntity<String> employeeResponse = employeeServiceClient.getEmployeeById(swipeIn.getEmployeeId());
            if (employeeResponse.getStatusCode().is2xxSuccessful()) {
                swipeInRepository.save(swipeIn);
                return ResponseEntity.ok("Swipe-in recorded successfully.");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized employee.");
            }
        } catch (FeignException.NotFound e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized employee.");
        }

    }
}
