package com.vivek.enterpriseResourcePlanningSystem.sales.repository;

import com.vivek.enterpriseResourcePlanningSystem.sales.entity.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}
