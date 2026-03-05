package com.vivek.enterpriseResourcePlanningSystem.purchase.repository;

import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.PurchaseOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderItemRepository extends JpaRepository<PurchaseOrderItem, Long> {
}
