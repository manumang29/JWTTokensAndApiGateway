//package com.attendance.emp.controller;
//
//import com.attendance.emp.service.SwipeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class SwipeController {
//    private final SwipeService swipeService;
//
//    @Autowired
//    public SwipeController(SwipeService swipeService) {
//        this.swipeService = swipeService;
//    }
//
//    @PostMapping("/swipe/in")
//    public ResponseEntity<Void> swipeIn(@RequestBody Long employeeId) {
//        swipeService.handleSwipeIn(employeeId);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//
//    @PostMapping("/swipe/out")
//    public ResponseEntity<Void> swipeOut(@RequestBody Long employeeId) {
//        swipeService.handleSwipeOut(employeeId);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//}
