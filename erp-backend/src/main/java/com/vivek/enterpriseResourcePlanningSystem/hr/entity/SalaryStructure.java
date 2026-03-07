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
        name = "salary_structures"
)
public class SalaryStructure extends BaseEntity {
    @Column(nullable = false)
    private Double basicSalary;
    @Column(nullable = false)
    private Double hra;
    @Column(nullable = false)
    private Double allowance;
    @Column(nullable = false)
    private Double deductions;

    @OneToOne
    @JoinColumn(unique = true,nullable = false)
    private Employee employee;

}
