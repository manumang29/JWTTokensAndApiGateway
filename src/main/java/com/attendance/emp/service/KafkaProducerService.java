//package com.attendance.emp.service;
//
//import com.attendance.employeeattendacesystem.emp.AttendanceRecord;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducerService {
//    private static final String TOPIC = "employee-state";
//
//    private final KafkaTemplate<String, AttendanceRecord> kafkaTemplate;
//
//    @Autowired
//    public KafkaProducerService(KafkaTemplate<String, AttendanceRecord> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(AttendanceRecord attendanceRecord) {
//        kafkaTemplate.send(TOPIC, attendanceRecord);
//    }
//}
