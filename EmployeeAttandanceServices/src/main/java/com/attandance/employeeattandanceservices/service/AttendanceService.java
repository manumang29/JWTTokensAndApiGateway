package com.attandance.employeeattandanceservices.service;

import com.attandance.employeeattandanceservices.entity.SwipeData;
import com.attandance.employeeattandanceservices.feign.EmployeeServiceFeignClient;
import com.attandance.employeeattandanceservices.feign.SwipeInFeignClient;
import com.attandance.employeeattandanceservices.feign.SwipeOutFeignClient;
import com.attandance.employeeattandanceservices.repo.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AttendanceService {

    private SwipeInFeignClient swipeInFeignClient;
    private SwipeOutFeignClient swipeOutFeignClient;
    private EmployeeServiceFeignClient employeeServiceFeignClient;

    private AttendanceRepository attendanceRepository;

    public AttendanceService(SwipeInFeignClient swipeInFeignClient, SwipeOutFeignClient swipeOutFeignClient, EmployeeServiceFeignClient employeeServiceFeignClient, AttendanceRepository attendanceRepository) {
        this.swipeInFeignClient = swipeInFeignClient;
        this.swipeOutFeignClient = swipeOutFeignClient;
        this.employeeServiceFeignClient = employeeServiceFeignClient;
        this.attendanceRepository = attendanceRepository;
    }
    /*public List<SwipeData> fetchSwipeTimesForEmployee(Long employeeId,LocalDateTime date){
        return
    }*/

    public String calculateAttendanceStatus(LocalDateTime swipeInTime, LocalDateTime swipeOutTime) {
        double totalHours = calculateTotalHours(swipeInTime, swipeOutTime);

        if (totalHours < 4) {
            return "Absent";
        } else if (totalHours >= 4 && totalHours < 8) {
            return "Half Day";
        } else {
            return "Present";
        }
    }

    public double calculateTotalHours(LocalDateTime swipeInTime, LocalDateTime swipeOutTime) {
        // Calculate the duration between swipe-in and swipe-out times
        Duration duration = Duration.between(swipeInTime, swipeOutTime);
        // Convert the duration to hours as a double value
        double totalHours = duration.toMinutes() / 60.0;

        return totalHours;


    }
}
