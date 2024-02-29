package com.emp.employeeservice.service;

import com.emp.employeeservice.entity.Employee;
import com.emp.employeeservice.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getDetailsByEmployeeDetailsById(Long id){
      return  employeeRepository.getById(id);
    }
}
