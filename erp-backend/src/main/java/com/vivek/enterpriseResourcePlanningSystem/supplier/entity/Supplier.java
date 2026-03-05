package com.vivek.enterpriseResourcePlanningSystem.supplier.entity;

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
        name = "suppliers"
)
public class Supplier extends BaseEntity {

    private String name;
    private String gstNumber;
}
