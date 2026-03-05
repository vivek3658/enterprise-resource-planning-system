package com.vivek.enterpriseResourcePlanningSystem.product.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "products"
)
public class Product extends BaseEntity {
    @Column(nullable = false)
    private String name;

    private String description;
    @Column(nullable = false)
    private BigDecimal price;

    private Integer stock;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;
}
