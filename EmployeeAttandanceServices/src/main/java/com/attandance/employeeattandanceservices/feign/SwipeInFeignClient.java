package com.attandance.employeeattandanceservices.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Swipe-In-Service",url = "http:localhost:9091")
public interface SwipeInFeignClient {
    @GetMapping("/employee/{id}")
    ResponseEntity<String> getEmployeeById(@PathVariable("id") Long id);
}
