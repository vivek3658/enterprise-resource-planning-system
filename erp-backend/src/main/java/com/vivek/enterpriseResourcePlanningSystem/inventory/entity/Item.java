package com.vivek.enterpriseResourcePlanningSystem.inventory.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.common.enums.UnitOfMeasure;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
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
        name = "items"
)
public class Item extends BaseEntity {
    @ManyToOne
    private Product product;
    @Column(unique = true)
    private String skuCode;
    @Enumerated(EnumType.STRING)
    private UnitOfMeasure unitOfMeasure;

}
