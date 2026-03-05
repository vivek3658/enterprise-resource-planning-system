package com.vivek.enterpriseResourcePlanningSystem.hr.entity;

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
        name = "payroll"
)
public class Payroll extends BaseEntity {
    @ManyToOne
    private Employee employee;
    private Double netSalary;
}
