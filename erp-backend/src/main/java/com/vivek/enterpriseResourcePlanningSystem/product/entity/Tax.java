package com.vivek.enterpriseResourcePlanningSystem.product.entity;


import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.common.enums.TaxType;
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
        name = "taxes"
)
public class Tax extends BaseEntity {
    private String name;
    @Enumerated(EnumType.STRING)
    private TaxType taxType;
    private Double rate;
}
