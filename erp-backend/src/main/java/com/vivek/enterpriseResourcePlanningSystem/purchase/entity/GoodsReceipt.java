package com.vivek.enterpriseResourcePlanningSystem.purchase.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "goods_receipts"
)
public class GoodsReceipt extends BaseEntity {
    @ManyToOne
    private PurchaseOrder purchaseOrder;
}
