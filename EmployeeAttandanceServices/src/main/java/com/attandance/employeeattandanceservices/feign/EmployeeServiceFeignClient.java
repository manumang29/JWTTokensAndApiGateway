package com.attandance.employeeattandanceservices.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-Service",url = "http:localhost:9090")
public interface EmployeeServiceFeignClient {
    @GetMapping("/employee/{id}")
    ResponseEntity<String> getEmployeeById(@PathVariable("id") Long id);
}
