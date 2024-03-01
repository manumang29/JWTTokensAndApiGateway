package com.attandance.employeeattandanceservices.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Swipe-Out-Service",url = "http:localhost:9092")
public interface SwipeOutFeignClient {
    @GetMapping("/employee/{id}")
    ResponseEntity<String> getEmployeeById(@PathVariable("id") Long id);


}
