package com.vivek.enterpriseResourcePlanningSystem.purchase.entity;


import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.Item;
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
        name = "purchase_order_items"
)
public class PurchaseOrderItem extends BaseEntity {
    @ManyToOne
    private PurchaseOrder purchaseOrder;
    @ManyToOne
    private Item item;

    private Integer quantity;
}
