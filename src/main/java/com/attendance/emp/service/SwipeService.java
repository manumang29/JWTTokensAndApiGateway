//package com.attendance.emp.service;
//
//import com.attendance.employeeattendacesystem.emp.SwipeType;
//import com.attendance.employeeattendacesystem.event.SwipeEvent;
//import com.attendance.emp.repository.SwipeEventRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//public class SwipeService {
//    private final SwipeEventRepository swipeEventRepository;
//
//    @Autowired
//    public SwipeService(SwipeEventRepository swipeEventRepository) {
//        this.swipeEventRepository = swipeEventRepository;
//    }
//
//    public void handleSwipeIn(Long employeeId) {
//        saveSwipeEvent(employeeId, SwipeType.IN);
//    }
//
//    public void handleSwipeOut(Long employeeId) {
//        saveSwipeEvent(employeeId, SwipeType.OUT);
//    }
//
//    private void saveSwipeEvent(Long employeeId, SwipeType swipeType) {
//        SwipeEvent swipeEvent = new SwipeEvent();
//        swipeEvent.setEmployeeId(employeeId);
//        swipeEvent.setSwipeType(swipeType);
//        swipeEvent.setTimestamp(LocalDateTime.now());
//        swipeEventRepository.save(swipeEvent);
//    }
//}
