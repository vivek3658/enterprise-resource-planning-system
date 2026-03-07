package com.vivek.enterpriseResourcePlanningSystem.hr.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.common.enums.PayrollStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;
    @NotNull
    @Column(nullable = false)
    private Integer month;
    @NotNull
    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Integer totalWorkingDays;
    @Column(nullable = false)
    private Integer presentDays;

    @Column(nullable = false)
    private Double netSalary;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PayrollStatus payrollStatus;

}
