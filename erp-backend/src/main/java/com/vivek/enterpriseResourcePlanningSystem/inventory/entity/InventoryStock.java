package com.vivek.enterpriseResourcePlanningSystem.inventory.entity;

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
        name = "inventory_stocks"
)
public class InventoryStock extends BaseEntity {
    @OneToOne
    private Item item;

    private Integer quantity;
}
