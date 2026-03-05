package com.vivek.enterpriseResourcePlanningSystem.product.entity;

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
        name = "product_taxes",
        uniqueConstraints = @UniqueConstraint(columnNames = {"product_id","tax_id"})
)
public class ProductTax extends BaseEntity {
    @ManyToOne
    private Product product;
    @ManyToOne
    private Tax tax;

}
