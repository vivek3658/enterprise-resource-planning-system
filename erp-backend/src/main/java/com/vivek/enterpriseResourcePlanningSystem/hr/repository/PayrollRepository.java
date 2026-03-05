package com.vivek.enterpriseResourcePlanningSystem.hr.repository;

import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {
}
