package com.attendance.employeeattendacesystem.controller;

import com.attendance.employeeattendacesystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    private final AttendanceService attendanceService;

    @Autowired
    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @GetMapping("/total-hours/{employeeId}/{date}")
    public ResponseEntity<Integer> getTotalHoursPresent(@PathVariable Long employeeId,
                                                        @PathVariable LocalDate date) {
        int totalHours = attendanceService.getTotalHoursPresent(employeeId, date);
        return ResponseEntity.ok(totalHours);
    }

}
