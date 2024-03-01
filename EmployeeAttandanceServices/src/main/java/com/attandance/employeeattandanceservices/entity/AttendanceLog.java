package com.attandance.employeeattandanceservices.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
@Table(name = "attendance_logs")
public class AttendanceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime swipeTime;
    private Long employeeId;
}
