package com.vivek.enterpriseResourcePlanningSystem.hr.repository;

import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
