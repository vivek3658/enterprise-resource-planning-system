package com.vivek.enterpriseResourcePlanningSystem.operations.entity;

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
        name = "transporters"
)
public class Transporter extends BaseEntity {
    private String name;
    private String vehicleNo;
    private Integer phone;
}
