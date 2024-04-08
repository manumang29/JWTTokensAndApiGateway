package com.attandance.employeeattandanceservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeAttendanceServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAttendanceServicesApplication.class, args);
	}

}
