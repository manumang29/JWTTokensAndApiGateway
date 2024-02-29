package com.emp.employeeservice.controller;

import com.emp.employeeservice.entity.Employee;
import com.emp.employeeservice.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/{id}")
    public Employee getAllEmployee(@PathVariable Long id){
        return employeeRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Employee Not found with ID:" +id));
    }
}
