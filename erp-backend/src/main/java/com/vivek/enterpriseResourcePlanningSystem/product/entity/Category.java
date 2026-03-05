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
        name = "categories",
        uniqueConstraints = @UniqueConstraint(
                columnNames = "name"
        )
)
public class Category extends BaseEntity {
    @Column(nullable = false)
    private String name;

}
