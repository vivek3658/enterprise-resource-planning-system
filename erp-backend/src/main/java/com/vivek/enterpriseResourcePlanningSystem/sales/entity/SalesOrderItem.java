package com.vivek.enterpriseResourcePlanningSystem.sales.entity;

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
        name = "sales_order_items"
)
public class SalesOrderItem extends BaseEntity {
    @ManyToOne
    private SalesOrder salesOrder;
    @ManyToOne
    private Item item;
}
