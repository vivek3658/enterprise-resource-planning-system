package com.vivek.enterpriseResourcePlanningSystem.purchase.repository;

import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
}
