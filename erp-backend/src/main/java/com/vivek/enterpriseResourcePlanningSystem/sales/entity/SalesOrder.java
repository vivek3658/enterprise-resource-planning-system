package com.vivek.enterpriseResourcePlanningSystem.sales.entity;

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
        name = "sales_orders"
)
public class SalesOrder extends BaseEntity {
    @ManyToOne
    private Customer customer;
}
