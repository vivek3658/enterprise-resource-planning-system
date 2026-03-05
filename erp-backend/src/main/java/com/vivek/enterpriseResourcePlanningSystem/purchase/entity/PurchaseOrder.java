package com.vivek.enterpriseResourcePlanningSystem.purchase.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.common.enums.OrderStatus;
import com.vivek.enterpriseResourcePlanningSystem.supplier.entity.Supplier;
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
        name = "purchase_orders"
)
public class PurchaseOrder extends BaseEntity {
    @ManyToOne
    private Supplier supplier;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
