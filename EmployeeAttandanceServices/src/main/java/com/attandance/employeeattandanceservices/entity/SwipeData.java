package com.attandance.employeeattandanceservices.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SwipeData {
    private Long employeeId;
    private LocalDateTime timestamp;
}
