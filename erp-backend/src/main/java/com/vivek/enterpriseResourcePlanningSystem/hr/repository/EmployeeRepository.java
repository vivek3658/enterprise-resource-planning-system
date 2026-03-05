package com.vivek.enterpriseResourcePlanningSystem.hr.repository;

import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
