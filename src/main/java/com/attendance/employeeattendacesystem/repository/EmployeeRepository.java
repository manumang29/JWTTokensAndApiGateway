package com.attendance.employeeattendacesystem.repository;

import com.attendance.employeeattendacesystem.emp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
