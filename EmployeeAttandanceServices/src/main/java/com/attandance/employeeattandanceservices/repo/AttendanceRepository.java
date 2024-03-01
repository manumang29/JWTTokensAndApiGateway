package com.attandance.employeeattandanceservices.repo;

import com.attandance.employeeattandanceservices.entity.AttendanceLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceLog,Long> {
}
