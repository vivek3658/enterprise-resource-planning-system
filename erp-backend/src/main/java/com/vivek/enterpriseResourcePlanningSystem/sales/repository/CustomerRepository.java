package com.vivek.enterpriseResourcePlanningSystem.sales.repository;

import com.vivek.enterpriseResourcePlanningSystem.sales.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
