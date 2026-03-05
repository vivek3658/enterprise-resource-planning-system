package com.vivek.enterpriseResourcePlanningSystem.purchase.repository;

import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.GoodsReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsReceiptRepository extends JpaRepository<GoodsReceipt, Long> {
}
