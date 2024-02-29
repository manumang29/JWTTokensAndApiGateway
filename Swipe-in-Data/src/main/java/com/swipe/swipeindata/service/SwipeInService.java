package com.swipe.swipeindata.service;

import com.swipe.swipeindata.repo.SwipeInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwipeInService {
    private final SwipeInRepository swipeInRepository;
    @Autowired
    public SwipeInService(SwipeInRepository swipeInRepository){
        this.swipeInRepository = swipeInRepository;
    }
    public boolean validateEmployee(Long employeeId) {
        return swipeInRepository.existsById(employeeId);
    }
}
