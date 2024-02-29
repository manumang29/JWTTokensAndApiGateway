package com.swipe.swipeindata.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-service", url = "http://localhost:6060")
public interface EmployeeServiceClient {
    @GetMapping("/employee/{id}")
    ResponseEntity<String> getEmployeeById(@PathVariable("id") Long id);
}
