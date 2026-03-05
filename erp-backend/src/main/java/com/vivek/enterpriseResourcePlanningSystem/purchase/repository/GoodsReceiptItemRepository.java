package com.vivek.enterpriseResourcePlanningSystem.purchase.repository;

import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.GoodsReceiptItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsReceiptItemRepository extends JpaRepository<GoodsReceiptItem,Long> {
}
